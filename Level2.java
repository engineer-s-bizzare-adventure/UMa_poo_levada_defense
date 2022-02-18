import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public Level2(ScoreCounter score1, ScoreCounter score2)
    {   
        super(score1, score2);
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }
    
    public Level2(){
        super();
        prepare();
    }
    
    public void act(){
        if(getObjects(Enemy.class).isEmpty()){
            if(getObjects(Player2.class).isEmpty()){
                Greenfoot.setWorld(new Level3(scoreP1, scoreP2));
            }
            else Greenfoot.setWorld(new Level32P(scoreP1, scoreP2));
        }
    }
    
    private void prepare(){
        MapCreation();
        
        //Healhbars
        addObject(healthbarP1,85,34);
        showText("Player 1", 85, 54);
        
        //Scores
        addObject(scoreP1, 85, 74);
        
        Player1 player = new Player1();
        addObject(player,279,311);
        player.setLocation(200,50);
    }
    
    private void MapCreation(){
        addObject(new Enemy(),300,350);
        
        addObject(new Tree(), 450, 450);
        
        Actor Water1= new Water();
        Water1.turn(45);
        addObject(Water1, 450,590);
        
        Actor Water2= new Water();
        Water2.turn(45);
        addObject(Water2, 485,555);
        
        Actor Water3= new Water();
        Water3.turn(45);
        addObject(Water3, 520,520);
        
        Actor Water4= new Water();
        Water4.turn(45);
        addObject(Water4, 555,485);
        
        Actor Water5= new Water();
        Water5.turn(45);
        addObject(Water5, 590,450);
        
        Actor Water6= new Water();
        Water6.turn(45);
        addObject(Water6, 555,415);
        
        Actor Water7= new Water();
        Water7.turn(45);
        addObject(Water7, 520,380);
        
        Actor Water8= new Water();
        Water8.turn(45);
        addObject(Water8, 485,345);
        
        Actor Water9= new Water();
        Water9.turn(45);
        addObject(Water9, 450,310);
        
        Actor Water10= new Water();
        Water10.turn(45);
        addObject(Water10, 415,345);
        
        Actor Water11= new Water();
        Water11.turn(45);
        addObject(Water11, 380,380);
        
        Actor Water12= new Water();
        Water12.turn(45);
        addObject(Water12, 345,415);
        
        Actor Water13= new Water();
        Water13.turn(45);
        addObject(Water13, 310,450);
        
        Actor Water14= new Water();
        Water14.turn(45);
        addObject(Water14, 345,485);
        
        Actor Water15= new Water();
        Water15.turn(45);
        addObject(Water15, 380,520);
        
        Actor Water16= new Water();
        Water16.turn(45);
        addObject(Water16, 415,555);

        int x=25;
        while ( x < 150){        
            addObject(new Cement(),x,675);
            x= x+50;
        }
        
        int y=875;
        while ( y > 725){ 
           addObject(new Cement(),225,y);
            y= y-50; 
        }
    }
}

