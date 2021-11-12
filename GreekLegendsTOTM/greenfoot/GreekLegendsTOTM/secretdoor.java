import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class secretdoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class secretdoor extends Actor
{
    /**
     * Act - do whatever the secretdoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        lever ok = (lever) (getWorld().getObjects(lever.class).get(0));
        if (ok.ok==1) getWorld().removeObject(this);
    }    
}
