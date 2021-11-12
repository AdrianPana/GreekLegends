import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Daedal2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daedal2 extends Actor
{
    /**
     * Act - do whatever the Daedal2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public int ok=0;
    public void act() // scena de final a nivelului
    {
        // Add your action code here
        if (getX()>750) move(-5);
        else if (getY()<=650) setLocation(getX()-5,getY()+3);
        else ok=1;
       if (ok==1) {setImage("dedaldone.png"); 
       textbox2 textbox2 = new textbox2();
        getWorld().addObject(textbox2,710,410);
        }
        }
}
