import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runner3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner3 extends Actor
{
    /**
     * Act - do whatever the runner3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private GreenfootImage run1 = new GreenfootImage ("r31.png");
    private GreenfootImage run2 = new GreenfootImage ("r32.png");
    private GreenfootImage run3 = new GreenfootImage ("r33.png");
    private int frame = 1;
    public int nr=0;
    public int ok=0;
    public int start=0;
    public void act() 
    { if (start<=300) start++;
        if (start==301) if (getY()>38) { move (1);
      animate ();  }
      PLACE place = (PLACE) (getWorld().getObjects(PLACE.class).get(0));
        if (getY()<=38 && ok==0){ok=1; place.place++;}
}
public void animate ()
    { if (frame == 5) setImage(run1);
      else if (frame==10) setImage(run2);
      else if (frame==15) setImage(run3);
      else if (frame==20) {setImage(run2); frame=5; return ;}
      frame++;
    }
}
