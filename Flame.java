import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flame extends Enemy
{
    /**
     * Act - do whatever the Flame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int angle;
    private int angleTrack;
    Flame(){
        angle = Greenfoot.getRandomNumber(359);
        setRotation(angle);
        angleTrack = angle;
    }
    public void act() 
    {
        collideCement();
        touching();
        enemyMovement();
    }  
    public void touching(){
        
        if (isTouching(Crate.class)){
            removeTouching(Crate.class);
            getWorld().removeObject(this);
            return;
        }
        if (isTouching(Healthpack.class)){
            removeTouching(Healthpack.class);
            getWorld().removeObject(this);
            return;
        }
        if (isTouching(Players.class) || isAtEdge()){
            getWorld().removeObject(this);
            Greenfoot.playSound("fire.mp3");
            return;
        }
    }
    public void enemyMovement(){
        move(SPEED);
    }
    public void collideCement(){
        if(isTouching(Cement.class)){
            
            if (angleTrack < 180){
                turn(-35);
                angleTrack -=35;
            }
            else{
                turn(35);
                angleTrack +=35;
            }
        }
    }
}
