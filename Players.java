import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    //Animation 
    protected int animDelay = ANIM_DELAY;
    protected static final int ANIM_DELAY = 15;
    
    //Enemy variables
    boolean touchingEnemy = false;
    protected static final int COUNTER_LIFE = 30; //Cycles for damage while touching an enemy
    protected int lifeTimeCounter = COUNTER_LIFE;
    
    //Player movement
    protected static int SPEED = 5; //running speed
    protected static int DIAGONAL = 1; //sideways running speed slowdown
    public static int WATERSLOW = 2;
    
    //Rock variables
    public boolean existsRock = false; //checks if a rock existsb (was thrown)
    protected int rockPosition;
    protected int ROCKSPEED = 8;
    protected static int THROWDELAY = 150;
    protected int position1[] =  new int[2];
    protected int position2[] =  new int[2];
    
    public boolean existsCup = false; 
    protected int cupPosition;
    
    public void act() 
    {
        // Add your action code here.
    }    
}
