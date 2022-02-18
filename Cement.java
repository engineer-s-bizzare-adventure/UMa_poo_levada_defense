import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Cement extends Actor
{
    public GreenfootImage cement;
    
    public Cement(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        
        cement = new GreenfootImage("cement.png");
        cement.scale(50,50);
        
    }
    /**
     * Act - do whatever the Cement wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
