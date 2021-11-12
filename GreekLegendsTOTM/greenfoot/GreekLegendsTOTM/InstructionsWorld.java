import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsWorld extends World
{
int nr=1;
int ok=1;
    /**
     * Constructor for objects of class InstructionsWorld.
     * 
     */
    public InstructionsWorld()
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
        backforth backforth = new backforth();
        addObject(backforth,363,761);
        backforth.setLocation(345,730);
        backforth.setLocation(336,25);
    }


    public void act()
    {ok=1;
        String key = Greenfoot.getKey();
        if ("left".equals(key) && ok==1) {nr--;ok=0;}
        else if ("right".equals(key) && ok==1) {nr++;ok=0;}
        if (nr==0) Greenfoot.setWorld(new SettingsWorld());
        else if (nr==1) setBackground("instr1.png");
        else if (nr==2) setBackground("instr4.png");
        else if (nr==3) setBackground("instr2.png");
        else if (nr==4) setBackground("instr3.png");
        else Greenfoot.setWorld(new SettingsWorld());
}
}