import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    public GreenfootImage Water;
    public GreenfootImage Water2;
    private int animDelay2 = ANIM_DELAY;
    private static final int ANIM_DELAY = 20;
    
    public Water()
    {
        Water = new GreenfootImage("water.png");
        Water2 = new GreenfootImage("water2.png");
        Water.scale(50,50);
        Water2.scale(50,50);
        
        setImage(Water);
    }
    
    public void act() 
    {
        animWater();
    }    
    
    public void animWater()
    {
        if(animDelay2 > 0){
            animDelay2--;
            return;
        }
        else{
            animDelay2 = ANIM_DELAY;
        }
        if(getImage() == Water){
            setImage(Water2);
        }
        else{
            setImage(Water);
        }
    }
}
