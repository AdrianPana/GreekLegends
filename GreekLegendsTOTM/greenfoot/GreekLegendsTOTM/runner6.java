import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class runner6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner6 extends Actor
{
    /**
     * Act - do whatever the runner6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private GreenfootImage run1 = new GreenfootImage ("r61.png");
    private GreenfootImage run2 = new GreenfootImage ("r62.png");
    private GreenfootImage run3 = new GreenfootImage ("r63.png");
    private int frame = 1;
     public int nr=0;
     public int ok=0;
     public int start=0;
    public void act() 
    {
        // Add your action code here.
        if (start<=300) start++;
        PLACE place = (PLACE) (getWorld().getObjects(PLACE.class).get(0));
        if (getY()<=38 && ok==0){ok=1; place.place++;}
        if (start==301) {if (getY()>38) {nr++;if (nr%2==0){ move (2);animate ();}
        else if (nr%3==0) {move (1);animate ();}}}
        
    }   
    public void animate ()
    { if (frame == 3) setImage(run1);
      else if (frame==6) setImage(run2);
      else if (frame==9) setImage(run3);
      else if (frame==12) {setImage(run2); frame=2; return ;}
      frame++;
    }
}
