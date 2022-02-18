import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    int x = 25;
    /**
     * Constructor for objects of class World1.
     * 
     */
    public Level1(ScoreCounter score1, ScoreCounter score2)
    {   
        super(score1, score2);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }
    
    public Level1(){
        prepare();
    }
    
    public void act(){
        if(getObjects(Enemy.class).isEmpty()){
            if(getObjects(Player2.class).isEmpty()){
                Greenfoot.setWorld(new Level2(scoreP1, scoreP2));
            }
            else Greenfoot.setWorld(new Level22P(scoreP1, scoreP2));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Healthbar.class,ScoreCounter.class,Grass.class,Player1.class, Crate.class, Healthpack.class);
        while ( x < 900) {       
            addObject(new Water(),x,150);
            addObject(new Water(),x,350);
            addObject(new Water(),x,550);
            addObject(new Grass(),x,600);
            addObject(new Grass(),x,500);
            addObject(new Grass(),x,400);
            addObject(new Grass(),x,300);
            addObject(new Grass(),x,200);
            addObject(new Grass(),x,750);
            
    
            x = x+50 ;
        }             
        
        
        while ( x > 200) {       
            addObject(new Cement(),x,250);
            addObject(new Cement(),x,650);
            x = x-50 ;
        }

        x = 25;
        while ( x < 700) {       
            addObject(new Cement(),x,450);
            addObject(new Cement(),x,850);
            x = x+50 ;
        }
        
        
        //Add Enemies
        addObject(new Enemy(),300,350);
        addObject(new Enemy(),850,350);
        addObject(new Enemy(),50,550);
        addObject(new Enemy(),500,148);
        addObject(new DeathRobot(),50,575);
        addObject(new DeathRobot(),700,325);
        
        //Healhbars
        addObject(healthbarP1,85,34);
        showText("Player 1", 85, 54);
       
        // addObject(healthbar2,815,34);
        // showText("Player 2", 815, 54);
        
        
        //Crate + Healthpack
        addCrateWithPack(850,25);
        addCrateWithPack(850,75);
        
        //Add players
        Player1 player = new Player1();
        addObject(player,279,311);
        player.setLocation(200,50);
        
        
        //Scores
        addObject(scoreP1, 85, 74);
    }
    
}
