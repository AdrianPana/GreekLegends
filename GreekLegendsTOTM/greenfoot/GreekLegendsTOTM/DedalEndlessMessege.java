import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DedalEndlessMessege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DedalEndlessMessege extends Actor
{
    /**
     * Act - do whatever the DedalEndlessMessege wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        textbox4 scor = (textbox4) (getWorld().getObjects(textbox4.class).get(0));
        GreenfootImage image = new GreenfootImage ("Joc terminat ! Scorul tau : "+ scor.scor,50,Color.RED,new Color(0,0,0,0));
        setImage (image);
    }    
}
