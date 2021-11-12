import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textbox4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textbox4 extends Actor
{
    /**
     * Act - do whatever the textbox4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public int scor=0;
    public void act() 
    {
        // Add your action code here.
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
         if (hp.HP>0) scor++;
         else {setImage("textbox.png"); 
            }
    }    
}
