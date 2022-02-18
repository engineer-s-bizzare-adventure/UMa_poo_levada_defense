import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathRobot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class DeathRobot extends Enemy
{
    private final int DELAY;
    private static int myDelay;
    GreenfootImage image1;
    GreenfootImage image2;
    
    DeathRobot(){
        DELAY = 20;
        myDelay = DELAY;
        image1 = new GreenfootImage("deathRobot1.png");
        image2 = new GreenfootImage("deathRobot2.png");
        SPEED = 3;
    }
    
    public void act() 
    {
        //Greenfoot.delay(DELAY);
        if (myDelay <= 0){
            animation();
            resetDelay();
        }
        CollideMovement();
        moveHoriz();
        attack();
        myDelay--;
    }
    
    public void animation(){
        GreenfootImage currentImage = getImage();
        if (currentImage == image1){
            setImage(image2);
        }
        else{
            setImage(image1);
        }
    }
    public void attack(){
        /*
        If the number of flames are less than the number of DeathRobots
        add more flames. */
        if (getWorld().getObjects(Flame.class).size() < getWorld().getObjects(DeathRobot.class).size()){
            getWorld().addObject(new Flame(),getX(),getY());
        }
        
    }
   
    private void resetDelay(){
        myDelay=DELAY;
    }
}
