import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OlimpFinishMessege here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OlimpFinishMessege extends Actor
{
    /**
     * Act - do whatever the OlimpFinishMessege wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        runner place = (runner) (getWorld().getObjects(runner.class).get(0));
        
        RetryButton retrybutton = new RetryButton();
        getWorld().addObject(retrybutton,710,600);
        MenuButton menubutton = new MenuButton();
        getWorld().addObject(menubutton,710,710);
        
        GreenfootImage image = new GreenfootImage("Ai iesit pe locul " + place.MYPLACE + " !",50,Color.RED,new Color (0,0,0,0));
        setImage (image);
    }    
}
