import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World
{
    
    private int posX = getWidth()/2; //Center of X
    private int posY = getHeight()/2; //Center of Y
    private boolean loop = true;
    public HelpWorld()
    {    
        super(900, 900, 1); 
        addHelp();
        
    }
    
    private void addHelp(){
        addObject(new HelpMessage(),posX,posY);
    }
     
}   
