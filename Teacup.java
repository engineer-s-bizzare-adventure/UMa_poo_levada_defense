import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teacup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacup extends Player2
{
    private int SPEED = 8;
    private int CUP = 50;
    private int DISTANCE = 60;
    GreenfootImage teacupImage = new GreenfootImage("teacup.png");

    public Teacup(){
        teacupImage.scale(CUP,CUP);
        setImage(teacupImage);
    }
    
    public void act() {
        //System.out.println(CUPPosition);
        move(SPEED);
        touching();
        distance();
    }
    
    public void distance(){
        DISTANCE--;
        if (DISTANCE <= CUP){
           CUP--;
           if(CUP <= 0){
                getWorld().removeObject(this);
                //super.existsCUP = false;
                return;
           }
           else{
                teacupImage.scale(CUP,CUP);
           }
        }
    }
    
    public void touching(){
        if(isTouching(Goo.class)){
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(BossFire.class)){
            addScore2(5);
            removeTouching(BossFire.class);
            getWorld().removeObject(this);
            return;
        }
        if(isTouching(Boss.class)){
            addScore2(10);
            return;
        }
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class); 
            addScore2(20);
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
    
    private void addScore2(int points){
            Level level = (Level)getWorld();
            
            ScoreCounter scoreP2 = level.getCounterP2();
            scoreP2.addScore(points);
    }
}
   

