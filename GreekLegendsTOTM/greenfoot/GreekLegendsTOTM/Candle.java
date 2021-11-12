import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candle extends Actor
{
    /**
     * Act - do whatever the Candle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         move (5);
         if (getX()>=1400) getWorld().removeObject(this);
         else {
        Actor daedal;
        daedal = getOneObjectAtOffset(0,0,Daedal.class);
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
        if (daedal!=null) {
            
           if (hp.HP<3) hp.HP = hp.HP +1;
         getWorld().removeObject(this);}}
    }    
}
