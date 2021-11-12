import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner extends Actor
{
    /**
     * Act - do whatever the runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int myplace=0;
    public int ok=0;
    public int frame=0;
    public int MYPLACE=0;
    public int start=0;
    public void act() // algoritm pentru alergare si clasament
    {
        // Add your action code here.
    if (start<=300) start++;
        PLACE place = (PLACE) (getWorld().getObjects(PLACE.class).get(0));
        if (start==301) 
        switch (ok)
    {
    case 0: if (Greenfoot.isKeyDown("left")) { move(10); ok++; frame++; framing(); } break;
    case 1: if (!Greenfoot.isKeyDown("left")) ok++; break;
    case 2: if (Greenfoot.isKeyDown("right")) { move(10); ok++; frame++; framing(); } break;
    case 3: if (!Greenfoot.isKeyDown("right")) ok = 0; break;
    }
        if (getY()<=38 && MYPLACE==0) {MYPLACE=place.place;
            textbox1 textbox1 = new textbox1();
        getWorld().addObject(textbox1,710,350);
         
    }
    }
   

 public void framing ()
 {if (frame%4==1) setImage ("doesthisrun2.png");
  else if (frame%4==3) setImage ("doesthisrun3.png");
  else setImage ("doesthisrun.png");
    }
}