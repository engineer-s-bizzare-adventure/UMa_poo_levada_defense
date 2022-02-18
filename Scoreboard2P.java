import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard2P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard2P extends Scoreboard
{

    /**
     * Constructor for objects of class Scoreboard2P.
     * 
     */
    public Scoreboard2P(ScoreCounter scoreP1, ScoreCounter scoreP2)
    {
        super(scoreP1, scoreP2);
    }
    
    public void act(){
        if(scoreP1.score > scoreP2.score){
            showText("PLAYER ONE WINS", 450, 350);
            showText("Player 1 score: " + scoreP1.score , 450, 450);
            showText("Player 2 score: " + scoreP2.score , 450, 550);
        }
        else if(scoreP1.score == scoreP2.score){
            showText("TIE", 450, 350);
            showText("Player 1 score: " + scoreP1.score , 450, 450);
            showText("Player 2 score: " + scoreP2.score , 450, 550);
        }
        else{
            showText("PLAYER TWO WINS", 450, 350);
            showText("Player 1 score: " + scoreP1.score , 450, 450);
            showText("Player 2 score: " + scoreP2.score , 450, 550);
        }
    }
}
