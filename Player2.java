import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Players
{
     /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //Image array
    public GreenfootImage [] moves;
    
    public Player2()
    {
        //Creating array of images
        GreenfootImage image = getImage();
        image.scale(100, 100);
        
        //Array for animation
        moves = new GreenfootImage [3];
        moves[0] = new GreenfootImage("moverightEN.png");
        moves[0].scale(100,100);
        moves[1] = new GreenfootImage("moveleftEN.png");
        moves[1].scale(100,100);
        moves[2] = new GreenfootImage("stillEN.png");
        moves[2].scale(100,100);
        
        setImage(moves[2]);
    }
    
    public void act() 
    {
        playerMovement();
        checkWallCollision();
        checkCrateCollision();
        if(isMoving())
        {
            playerAnimation2();
        }
        
        checkEnemyCollision();
        rockAttack2();
        checkWaterCollision();
        healthPack();
    }    
    
    public boolean isMoving(){
        
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("right")){
            return true;
        }
        else{
            setImage(moves[2]);
        }
        return false;
    }
    
    public void playerAnimation2(){
        //While animDelay isn't the established ANIM_DELAY, it counts down
        if(animDelay > 0){
            animDelay--;
            return;
        }
        //Resets to the value
        else{
            animDelay = ANIM_DELAY;
        }
        
        if(getImage() == moves[2])
        {
            setImage(moves[0]);
            return;
        }
        if(getImage() == moves[0])
        {
            setImage(moves[1]);
            return;
        }
        if(getImage() == moves[1])
        {
            setImage(moves[2]);
            return;
        }
        
    }
    
    public void playerMovement()
    {
        int y = getY();
        int x = getX();
        
        //Movement code
        if(Greenfoot.isKeyDown("up")){
            y -= SPEED;
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left")){
            x -= SPEED;
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("down")){
            y += SPEED;
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("right")){
            x += SPEED;
            setRotation(90);
        }
        
        
        //Changing rotation to suit the movement
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")){
            y += DIAGONAL;
            x -= DIAGONAL;
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left")){
            y += DIAGONAL;
            x += DIAGONAL;
            setRotation(-45);
        }
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right")){
            y -= DIAGONAL;
            x -= DIAGONAL;
            setRotation(135);
        }
        if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left")){
            y -= DIAGONAL;
            x += DIAGONAL; 
            setRotation(-135);
        }
        setLocation(x, y);
    }
    
    public void checkWallCollision()
    {
        
        //DEFEITO AO IR PARA TRÁS ENCOSTADO
        Actor a = getOneIntersectingObject(Cement.class);
        int x = getX();
        int y = getY();
        
        if(a == null) {
            savePosition1();
            return;
        }
        else{
            setLocation(position1[0],position1[1]);
        }
    
    }
    
     public void checkCrateCollision()
    {
        //DEFEITO AO IR PARA TRÁS ENCOSTADO
        Actor b = getOneIntersectingObject(Crate.class);
        int x = getX();
        int y = getY();
        
        if(b == null) {
            savePosition2();
            return;
        }
        else{
            setLocation(position2[0],position2[1]);
        }
    
    }
    
    public void checkEnemyCollision()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null){
            //to get the functions from the World1 code
            Level level = (Level)getWorld();
        
            Healthbar healthbar2 = level.getHealthBar2();
            lifeTimeCounter--;

            if (touchingEnemy==false){
                healthbar2.loseHealth();
                touchingEnemy = true;
            }           
            if (touchingEnemy &&  lifeTimeCounter<=0){
                healthbar2.loseHealth();
                lifeTimeCounter = COUNTER_LIFE;
            }
            if(healthbar2.health <= 0){
                this.setImage("ripEN.png");
                if(this.getRotation()!=0){
                    this.setRotation(0);
                }
                Greenfoot.delay(100);
                Greenfoot.setWorld(new Gameover());
                Greenfoot.stop();
            }
        }
        else{
            lifeTimeCounter = COUNTER_LIFE;
            touchingEnemy = false;
        }
    }
    
    public void healthPack(){
        Level level = (Level)getWorld();
        
        Healthbar healthbar2 = level.getHealthBar2();
        
        if(isTouching(Healthpack.class)){
            if(healthbar2.health < 4){
                removeTouching(Healthpack.class); 
                healthbar2.gainHealth();
            }
        }
    }
    
    public void rockAttack2(){
        if (getWorld().getObjects(Teacup.class).size() == 1){ //size starts at 1 >:C
            setImage(moves[2]);
            existsCup = false;
        }
        else{
            if(Greenfoot.isKeyDown("L")){
                int counter = 0;
                GreenfootImage[] throwRock = new GreenfootImage[2];
                throwRock[0] = new GreenfootImage("throw1.png");
                throwRock[0].scale(100,100);
                throwRock[1] = new GreenfootImage("throw2.png");
                throwRock[1].scale(100,100);
                cupPosition = getRotation();
                
                while(counter<THROWDELAY){
                    counter++;
                    if(counter < THROWDELAY/2){
                        setImage(throwRock[0]);
                    }
                    else{
                        setImage(throwRock[1]);
                    }
                }
                
                Teacup myCup = new Teacup();
                getWorld().addObject(myCup,getX(),getY());
                myCup.setRotation(cupPosition-90);
                existsCup = true;
                
            }
        }
    }
    
    public void savePosition1(){
        position1[0] = getX();
        position1[1] = getY();
    }
    
    public void savePosition2(){
        position2[0] = getX();
        position2[1] = getY();
    }
    
    public void checkWaterCollision()
    {
        Actor a = getOneIntersectingObject(Water.class);
        
        if(a == null) return;
        
        if(Greenfoot.isKeyDown("up")){
           setLocation(getX(), getY()+WATERSLOW);
        }
        if(Greenfoot.isKeyDown("left")){
           setLocation(getX()+WATERSLOW, getY());
        }
        if(Greenfoot.isKeyDown("down")){
           setLocation(getX(), getY()-WATERSLOW);
        }
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX()-WATERSLOW, getY());
        }
    }
}


