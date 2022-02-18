import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpMessage extends Actor
{
    /**
     * Act - do whatever the HelpMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    HelpMessage(){
        GreenfootImage myImage = getImage();
        myImage.scale(800,300);
        setImage(myImage);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("R")){
            Greenfoot.setWorld(new Menu());
        }
        if(Greenfoot.isKeyDown("M") && Greenfoot.isKeyDown("I") && Greenfoot.isKeyDown("L") && Greenfoot.isKeyDown("O") && Greenfoot.isKeyDown("S")){
            Greenfoot.setWorld(new FinalBoss());
        }    
    }
}
