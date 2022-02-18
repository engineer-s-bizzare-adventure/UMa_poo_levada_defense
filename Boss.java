import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    private int FIREBALLLIMIT;
    private int bossLife;
    private boolean bossMusic;
    private boolean waterAttacking;
    private static int posWaterAttackX, posWaterAttackY;
    GreenfootImage boss1;
    GreenfootImage boss2;
    GreenfootSound bossFight;
    GreenfootSound bossDead;
    Boss(){
        FIREBALLLIMIT=200;
        bossLife = 5;
        bossMusic = false;
        waterAttacking = false;
        boss1 = new GreenfootImage("boss1.png");
        boss2 = new GreenfootImage("boss2.png");
        bossFight = new GreenfootSound("satani.mp3");
        bossDead = new GreenfootSound("robloxdeath.mp3");
    }
    public void act() 
    {
        
        playMP3();
        animation();
        damaged();
        if(attackChance(10)){
            normalAttack();
        }
        if(attackChance(1) || waterAttacking){
            waterAttack();
        } 
        
    }
    private void normalAttack(){
        for(int counter=0; counter<3;counter++){
            if(bossLife>0){
                if (getWorld().getObjects(Flame.class).size() < FIREBALLLIMIT){
                    getWorld().addObject(new BossFire(),getX(),getY());
                }
            }
        }        
    }
    private boolean attackChance(int chance){
        int myChance = Greenfoot.getRandomNumber(100);
        if (myChance<chance){
            return true;
        }
        return false;
    }
    private void animation(){
        GreenfootImage currentImage = getImage();
        if (currentImage == boss1){
            setImage(boss2);
        }
        else{
            setImage(boss1);
        }
    }
    private void damaged(){
        
        if(isTouching(Rock.class)){
            removeTouching(Rock.class);
            bossLife--;
            if(bossLife<=0){
                getWorld().removeObject(this);
                bossFight.stop();
                bossDead.play();
                return;
            }
        }
        if(isTouching(Teacup.class)){
            removeTouching(Teacup.class);
            if(bossLife<=0){
                getWorld().removeObject(this);
                bossFight.stop();
                bossDead.play();
                return;
            }
            bossLife--;
        }
    }
    private void playMP3(){
        if(bossMusic == false){
            bossFight.playLoop();
            bossFight.setVolume(100);
            getWorld().showText("MUAHAHAHAHAHA",getWorld().getWidth()/2, 25);
            Greenfoot.delay(100);
            bossMusic = true;
        }
    }
    private void waterAttack(){
        
        
        waterAttacking=true;
        if (posWaterAttackY == 25){
            posWaterAttackX = Greenfoot.getRandomNumber(getWorld().getWidth());
        }
        
        if (posWaterAttackY<=getWorld().getHeight()){
            getWorld().addObject(new PollWater(),posWaterAttackX,posWaterAttackY);
            posWaterAttackY+=25;
        }
        else{
            posWaterAttackY = 25;
            waterAttacking=false;
        }
        
    }
}
