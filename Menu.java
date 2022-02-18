import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World{
    //Center of the Map:
    private int posX = getWidth()/2; //Center of X
    private int posY = getHeight()/2; //Center of Y
    Play buttonPlay = new Play();
    Coop buttonCoop = new Coop();
    Help buttonHelp = new Help();
    public Menu(){    
        super(900, 900, 1); 
        addButtons(); //Load Buttons
        checkClick(); //Load Worlds
        Greenfoot.setSpeed(50);
    }
    public void addButtons(){
        addObject(buttonPlay,posX,posY-250);
        addObject(buttonCoop,posX,posY);
        addObject(buttonHelp,posX,posY+250);
        
    }
    public void checkClick(){
        
        if (Greenfoot.mouseClicked(buttonPlay)){
            //Greenfoot.setWorld(new World1());
        }
        if(Greenfoot.mouseClicked(buttonCoop)){
            Greenfoot.setWorld(new Level12P());
        }
        if(Greenfoot.mouseClicked(buttonHelp)){
            
        }
        
    }
}
