import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textbox2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textbox2 extends Actor
{
    /**
     * Act - do whatever the textbox2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("Escape"))
        Greenfoot.setWorld(new MyWorld());
        if (this.getWorld().getClass()==TezeuFightScene.class)
        setImage ("textboxtezeu.png");
        
    }    
}
