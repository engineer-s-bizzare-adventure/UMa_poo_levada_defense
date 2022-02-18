import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthbarP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Healthbar extends Actor
{
    int health = 4;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealth = (int) healthBarWidth / health;
    
    /**
     * Act - do whatever the Healthbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Healthbar()
    {
       update();
    }
    
    public void act() 
    {
        // Add your action code here.
        update();
    }    
    
    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight +2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarWidth + 1, healthBarHeight + 1);
        
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1, health*pixelsPerHealth, healthBarHeight);
    }
    
    public void loseHealth()
    {
        health--;
    }
    
    public void gainHealth(){
        health++;
    }  
}
