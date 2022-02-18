import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends World
{

    /**
     * Constructor for objects of class FinalBoss.
     * 
     */
    public FinalBoss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        addObject(new Wamuu(), getWidth()/2 , getHeight()-500);
        
    }
   
}
