import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1Win extends World
{

    /**
     * Constructor for objects of class Player1Win.
     * 
     */
    public Player1Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
        prepare();
    }
    private void prepare()
    {
        int x = getHeight();
        int y= getWidth();
        showText("Player 1 Won with : ", x/2-50, y-300);
        showText("Player 2 Lost with :", x/2-50, y-250);
        
    }
}
