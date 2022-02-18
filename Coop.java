import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coop extends Actor{
    private GreenfootImage coop0 = new GreenfootImage("button0Coop.png");
    private GreenfootImage coop1 = new GreenfootImage("button1Coop.png");
   
    public void act(){
        mouseClick();
    }
    
    public void mouseClick(){
        if (Greenfoot.mousePressed(this)){
            setImage(coop1);
            Greenfoot.delay(5);
        }
        
        else if (Greenfoot.mouseClicked(this)){
            setImage(coop1);
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Level12P());
        }
        else{
            setImage(coop0);
        }
    }
    
}   
