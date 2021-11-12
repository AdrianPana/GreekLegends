import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HP extends Actor
{
    /**
     * Act - do whatever the HP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int HP = 3;
    public void act() 
    {
        // Add your action code here.
        Wax wax= (Wax) (getWorld().getObjects(Wax.class).get(0));
       
    Wax wax1= (Wax) (getWorld().getObjects(Wax.class).get(1));
       
    Wax wax2= (Wax) (getWorld().getObjects(Wax.class).get(2));
        
    if (HP==3) { wax.getImage().setTransparency(255);
     wax1.getImage().setTransparency(255);
    wax2.getImage().setTransparency(255);}
        else if (HP==2) { wax.getImage().setTransparency(255);
     wax1.getImage().setTransparency(255);
    wax2.getImage().setTransparency(0);}
    else if (HP==1) { wax.getImage().setTransparency(255);
     wax1.getImage().setTransparency(0);
    wax2.getImage().setTransparency(0);
    } 
    else { wax.getImage().setTransparency(0);
     wax1.getImage().setTransparency(0);
    wax2.getImage().setTransparency(0);}
    } 
}
