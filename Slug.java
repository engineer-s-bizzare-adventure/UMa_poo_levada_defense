import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slug extends Enemy
{
    private final int DELAY;
    private static int myDelay,X,Y;
    private static int YSPEED;
    protected static int counter;
    protected static int myRotation;
    GreenfootImage slug1;
    GreenfootImage slug2;
    GreenfootImage slug21;
    GreenfootImage slug22;

    Slug(){
        DELAY = 3;
        myDelay = DELAY;
        counter=0;
        X=Y=1;
        slug1 = new GreenfootImage("slug1.png");
        slug2 = new GreenfootImage("slug2.png");
        slug21 = new GreenfootImage("slug21.png");
        slug22 = new GreenfootImage("slug22.png");
        SPEED = 2;
    }
    public void act() 
    {
        move(SPEED);
        bounce();
        myRotation = getRotation();
        if (myDelay <= 0){
            animation();
            myDelay = DELAY;
        }
        trail();
        myDelay--;
    }    
    private void animation(){
        GreenfootImage currentImage = getImage();
        if (currentImage == slug1){
            setImage(slug2);
        }
        else{
            setImage(slug1);
        }
    }
    
    private void trail(){
        counter++;
        if (counter == 3)
        {
            getWorld().addObject(new Goo(), getX(), getY()+20);
            counter = 0;
        }
    }
    
    private void bounce(){
        if(touching()){
            if (Greenfoot.getRandomNumber(2) == 1){
                turn(25);
            }
            else{
                turn(-25);
            }
        }
    }
    private boolean touching(){
        if(isTouching(Cement.class) || isTouching(Crate.class) || isAtEdge()){
            return true;
        }
        return false;
        
    }
}
