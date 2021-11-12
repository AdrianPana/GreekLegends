import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class secretdoor1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class secretdoor1 extends Actor
{
    /**
     * Act - do whatever the secretdoor1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        lever1 ok = (lever1) (getWorld().getObjects(lever1.class).get(0));
        if (ok.ok==1) getWorld().removeObject(this);
    }    
}
