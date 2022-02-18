import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Player1
{
    /**
     * Act - do whatever the Rock1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int SPEED = 8;
    private int ROCK = 25;
    private int DISTANCE = 60;
    GreenfootImage rockImage = new GreenfootImage("rock1.png");

    public Rock(){
        rockImage.scale(ROCK,ROCK);
        setImage(rockImage);
        
    }
    
    public void act() {
        //System.out.println(rockPosition);
        move(SPEED);
        touching();
        distance();
    }
    
    public void distance(){
        DISTANCE--;
        if (DISTANCE <= ROCK){
            
            if(ROCK <= 0){
                getWorld().removeObject(this);
                //super.existsRock = false;
                return;
            }
            else{
                rockImage.scale(ROCK,ROCK);
            }
            ROCK--;
        }
    }
    public void touching(){
        if(isTouching(Goo.class)){
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(BossFire.class)){
            addScore(5);
            removeTouching(BossFire.class);
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Boss.class)){
            addScore(10);
            return;
        }
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class); 
            addScore(20);
            getWorld().removeObject(this);
            return;
            //super.existsRock = false;
        }
        if(isTouching(Cement.class)){
            //existsRock = false;
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Crate.class)){
            removeTouching(Crate.class);
            getWorld().removeObject(this);
            return;
        }
        if(isAtEdge()){
            //existsRock = false;
            getWorld().removeObject(this);
            return;
        }
    }
    
    private void addScore(int points){
        Level level = (Level)getWorld();
        
        ScoreCounter scoreP1 = level.getCounterP1();
        scoreP1.addScore(points);
    }
}
