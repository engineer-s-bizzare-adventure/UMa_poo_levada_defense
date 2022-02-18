import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level3 extends Level
{
    
    protected int posX;
    protected int posY;
    public Level3(ScoreCounter score1, ScoreCounter score2)
    {   
        super(score1, score2);
        prepare();
    }
    
    public Level3()
    {
        prepare();
    }
    
    public void act(){
        addHealthRandom(100); // 1/(value input) chance of appearing health
        if(getObjects(Enemy.class).isEmpty()){
            if(getObjects(Player2.class).isEmpty()){
                Greenfoot.setWorld(new Scoreboard(scoreP1, scoreP2));
            }
            else Greenfoot.setWorld(new Scoreboard2P(scoreP1, scoreP2));
        }
    }
    
    protected void prepare(){
        setPaintOrder(Healthbar.class,ScoreCounter.class,Boss.class,Grass.class,Player1.class, Crate.class, Slug.class, Goo.class, Healthpack.class);
        addObject(new Boss(),getWidth()/2,200);
        
        //Healhbars
        addObject(healthbarP1,85,34);
        showText("Player 1", 85, 54);
        
        //Scores
        addObject(scoreP1, 85, 74);
        
        Player1 player = new Player1();
        addObject(player,279,311);
        player.setLocation(300,800);
        
        int x = 25;
        while(x<900){
            if (x < 200 || x> 700){
                addObject(new Grass(),x,25);
                addObject(new Grass(),25,x);
                addObject(new Grass(),x,875);
                addObject(new Grass(),875,x);
            }
            x+=25;
        }
    }
    
    protected void addHealthRandom(int chance){
        int posX = Greenfoot.getRandomNumber(getWidth());
        int posY = (getHeight()/2)+Greenfoot.getRandomNumber(getHeight()/2);
        if(Greenfoot.getRandomNumber(chance)==1){
            addHealth(posX,posY);
        }
    }
}
