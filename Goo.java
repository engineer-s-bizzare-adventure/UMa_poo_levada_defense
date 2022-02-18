import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goo extends Slug
{
    /**
     * Act - do whatever the Goo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    Goo(){
        image = getImage();
        setRotation(myRotation);
    }
    public void act() 
    {
        fade();
    }   
    public void fade(){
        int transparency = image.getTransparency(); 
        if (transparency < 10) 
            getWorld().removeObject(this); 
        else{
            image.setTransparency(transparency - 5); 
        }
    }   
}
