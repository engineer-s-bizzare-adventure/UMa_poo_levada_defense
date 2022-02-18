import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World12P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level12P extends Level1
{

    /**
     * Constructor for objects of class Level12P.
     * 
     */

    public Level12P()
    {

        
        addObject(healthbarP2,815,34);
        showText("Player 2", 815, 54);
        addObject(scoreP2, 815, 74);
        
        Player2 player = new Player2();
        addObject(player,279,311);
        player.setLocation(300,50);
    }
}
