import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikes2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikes2 extends Actor
{
    /**
     * Act - do whatever the Spikes2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int nr=100;
    private GreenfootImage spike = new GreenfootImage ("spikes.png");
    private GreenfootImage nospike = new GreenfootImage ("nospikes.png");
    public void act() 
    {
        // Add your action code here.
        nr++;
        if (nr==100) setImage (nospike);
        else if (nr==200) {setImage(spike); nr=0;}
        if (nr<100) {Actor tezeu = getOneObjectAtOffset(0,0,Tezeu.class);
            if (tezeu!=null) {getWorld().removeObject(tezeu);
         textbox3 textbox3 = new textbox3();
        getWorld().addObject(textbox3,710,350);
        RetryButton retrybutton = new RetryButton();
        getWorld().addObject(retrybutton,710,600);
        MenuButton menubutton = new MenuButton();
        getWorld().addObject(menubutton,710,710);}}
    }    
}
