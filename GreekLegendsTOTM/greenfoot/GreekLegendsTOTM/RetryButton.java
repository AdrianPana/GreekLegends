import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RetryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RetryButton extends Actor
{
    /**
     * Act - do whatever the RetryButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {if (this.getWorld().getClass()==TezeuFightScene.class)
            Greenfoot.setWorld(new TezeuFightScene());
            else if (this.getWorld().getClass()==TezeuWorld.class)
            Greenfoot.setWorld(new TezeuWorld());
            else if (this.getWorld().getClass()==DaedalWorld.class)
            Greenfoot.setWorld(new DaedalWorld());
            else if (this.getWorld().getClass()==OlimpWorld.class)
            Greenfoot.setWorld(new OlimpWorld());
            else if (this.getWorld().getClass()==TezeuEndlessWorld.class)
            Greenfoot.setWorld(new TezeuEndlessWorld());
            else Greenfoot.setWorld(new DaedalEndlessWorld());
    }    }
}
