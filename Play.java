import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor{
    private GreenfootImage play0 = new GreenfootImage("button0Play.png");
    private GreenfootImage play1 = new GreenfootImage("button1Play.png");
   
    public void act(){
        mouseClick();
    }
    
    public void mouseClick(){
        if (Greenfoot.mousePressed(this)){
            setImage(play1);
            Greenfoot.delay(5);
        }
        
        else if (Greenfoot.mouseClicked(this)){
            setImage(play1);
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Level1());
        }
        else{
            setImage(play0);
        }
    }
}
