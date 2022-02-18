import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateScore();
    }    
    
    protected void addScore(int points){
        score += points;
    }
    
    protected void updateScore(){
        setImage(new GreenfootImage("Score: " + score, 20, Color.WHITE, null));
    }
    
    protected void setScore(int newScore){
        score = newScore;
    }
}
