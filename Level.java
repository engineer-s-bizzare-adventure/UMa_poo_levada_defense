import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    //Healthbars     
    Healthbar healthbarP1 = new Healthbar();
    Healthbar healthbarP2 = new Healthbar();
    
    //Scores
    ScoreCounter scoreP1 = new ScoreCounter();
    ScoreCounter scoreP2 = new ScoreCounter();
        
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level(ScoreCounter score1, ScoreCounter score2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1);
        this.scoreP1 = score1;
        this.scoreP2 = score2;
    }
    
    public Level() {
        super(900, 900, 1);
        setPaintOrder(Healthbar.class,ScoreCounter.class,Grass.class,Player1.class, Crate.class, Slug.class, Goo.class, Healthpack.class);

    }
    
     //Healthbars
    public Healthbar getHealthBar1()
    {
        return healthbarP1;
    }
    
    public Healthbar getHealthBar2(){
        return healthbarP2;
    }
    
    //Scores
    public ScoreCounter getCounterP1(){
        return scoreP1;
    }
    
    public ScoreCounter getCounterP2(){
        return scoreP2;
    }
    
    protected void addCrateWithPack(int x, int y){
        Crate crate = new Crate();
        addObject(crate,x,y);
        crate.setLocation(x,y);
        
        Healthpack healthpack = new Healthpack();
        addObject(healthpack,x,y);
    }
    protected void addHealth(int x, int y){
        Healthpack healthpack = new Healthpack();
        addObject(healthpack,x,y);
    }
}
