import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuRetry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuRetry extends Actor
{
    /**
     * Act - do whatever the TezeuRetry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if (Greenfoot.isKeyDown("Escape"))
       Greenfoot.setWorld(new MyWorld());
       if (Greenfoot.isKeyDown("Enter"))
       Greenfoot.setWorld(new TezeuFightScene());
       
}
}