import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Level
{

    /**
     * Constructor for objects of class Scoreboard.
     * 
     */
    public Scoreboard(ScoreCounter score1, ScoreCounter score2)
    {
        super(score1, score2);
    }
    
    public Scoreboard(){
    }
    
    public void act(){
        showText("Score: " + scoreP1.score, 450, 450);
    }

}
