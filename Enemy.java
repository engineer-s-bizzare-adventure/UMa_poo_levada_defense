    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Enemy here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int SPEED;
    Enemy(){
        SPEED = 5;
    }
    public void act() 
    {
        // Add your action code here.
        moveVert();
        CollideMovement();
    }   
    
    protected void CollideMovement(){
        
        if(isAtEdge() || isTouching(Cement.class) || isTouching(Crate.class)){
            move(SPEED=SPEED*(-1));
        }
    }
    protected void moveVert(){
        setLocation(getX(),getY()+SPEED);
    }
    protected  void moveHoriz(){
        setLocation(getX()+SPEED,getY());
            
    }
}
