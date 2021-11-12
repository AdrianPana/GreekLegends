import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class countdown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class countdown extends Actor
{
    /**
     * Act - do whatever the countdown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int countdown=301;
    public void act() 
    {  
        countdown--;
        if (countdown==300) {GreenfootImage image = new GreenfootImage ("3.png");
        setImage (image);}
        if (countdown==200) {GreenfootImage image = new GreenfootImage ("2.png");
        setImage (image);}
        if (countdown==100) {GreenfootImage image = new GreenfootImage ("1.png");
        setImage (image);}
        if (countdown==0) {GreenfootImage image = new GreenfootImage ("start.png");
        setImage (image);}
        if (countdown==-100) getWorld().removeObject(this);
        // Add your action code here.
    }    
}
