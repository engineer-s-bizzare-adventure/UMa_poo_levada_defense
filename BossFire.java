import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossFire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossFire extends Flame
{
    /**
     * Act - do whatever the BossFire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int SPIN;
    private int TURNRATE;
    BossFire(){
        SPIN = Greenfoot.getRandomNumber(500);
    }
    public void act() 
    {
        collideCement();
        touching();
        enemyMovement();
        turn(3);
        turnAttack();
    }   
    
    public void turnAttack(){
        if(SPIN<=0){
            turn(-3);
        }
        SPIN--;
    }
}
