import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Actor{
    private GreenfootImage help0 = new GreenfootImage("button0Help.png");
    private GreenfootImage help1 = new GreenfootImage("button1Help.png");
   
    public void act(){
        mouseClick();
    }
    public void mouseClick(){
        if (Greenfoot.mousePressed(this)){
            setImage(help1);
            Greenfoot.delay(5);
        }
        
        else if (Greenfoot.mouseClicked(this)){
            setImage(help1);
            Greenfoot.delay(5);
            Greenfoot.setWorld(new HelpWorld());
        }
        else{
            setImage(help0);
        }
    }
}
