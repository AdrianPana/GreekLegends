import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class secretdoor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class secretdoor2 extends Actor
{
    /**
     * Act - do whatever the secretdoor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        lever2 ok = (lever2) (getWorld().getObjects(lever2.class).get(0));
        if (ok.ok==1) getWorld().removeObject(this);
    }    
}
