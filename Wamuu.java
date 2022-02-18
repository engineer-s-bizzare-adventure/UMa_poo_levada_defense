import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wamuu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Wamuu extends Actor
{
    /**
     * Act - do whatever the Wamuu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage[] wamu = new GreenfootImage[5];
    private int appearTransparency = 0;
    private boolean animate = true;
    public Wamuu(){
        this.getImage().setTransparency(0);
        wamu[0] = new GreenfootImage("1.png");
        wamu[1] = new GreenfootImage("2.png");
        wamu[2] = new GreenfootImage("3.png");
        wamu[3] = new GreenfootImage("4.png");
        wamu[4] = new GreenfootImage("5.png");
    }
    public void act() 
    {
        appear();
        animation();
    }    
    public void animation(){
        if (animate){
            for (int i = 0; i <5; i++){
                if (i==0){
                    GreenfootSound pillarMan = new GreenfootSound("wamuu.mp3");
                    pillarMan.playLoop();
                    pillarMan.setVolume(100);
                    Greenfoot.delay(190);
                }
                Greenfoot.delay(2);
                setImage(wamu[i]);

            }
            animate = false;
        }
    }
    public void appear(){
        if (animate){
            
            while (appearTransparency <255){
                Greenfoot.delay(1);
                this.getImage().setTransparency(appearTransparency);
                appearTransparency++;
            }
        }
        
    }
}
