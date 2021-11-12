import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuEndlessMessege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuEndlessMessege extends Actor
{
    /**
     * Act - do whatever the TezeuEndlessMessege wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        MinotaurEndless hits = (MinotaurEndless) (getWorld().getObjects(MinotaurEndless.class).get(0));
        GreenfootImage image = new GreenfootImage ("Joc terminat ! Scorul tau : "+ hits.hits,50,Color.RED,new Color(0,0,0,0));
        setImage (image);
        
     
}
}