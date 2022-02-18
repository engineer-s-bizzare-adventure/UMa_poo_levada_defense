import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level32P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level32P extends Level3
{

    /**
     * Constructor for objects of class Level32P.
     * 
     */
    public Level32P(ScoreCounter scoreP1, ScoreCounter scoreP2)
    {
        super(scoreP1, scoreP2);
        
        addObject(healthbarP2,815,34);
        showText("Player 2", 815, 54);
        addObject(scoreP2, 815, 74);
        
        Player2 player = new Player2();
        addObject(player,279,311);
        player.setLocation(600,800);
    }
}
