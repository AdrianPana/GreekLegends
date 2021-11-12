import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KnossosWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KnossosWorld extends World
{
   int nr=1;
   int ok=1;
    /**
     * Constructor for objects of class KnossosWorld.
     * 
     */
    public KnossosWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1421, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void act()
    {ok=1;
        String key = Greenfoot.getKey();
        if ("left".equals(key) && ok==1) {nr--;ok=0;}
        else if ("right".equals(key) && ok==1) {nr++;ok=0;}
        if (nr==0) Greenfoot.setWorld(new BonusWorld());
        else if (nr==1) setBackground("kl1.png");
        else if (nr==2) setBackground("kl2.png");
        else if (nr==3) setBackground("kl3.png");
        else if (nr==4) setBackground("kl4.png");
        else Greenfoot.setWorld(new BonusWorld());
}
}
