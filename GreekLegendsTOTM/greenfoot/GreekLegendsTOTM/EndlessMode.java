import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndlessMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndlessMode extends World
{

    /**
     * Constructor for objects of class EndlessMode.
     * 
     */
    public EndlessMode()
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
        BackButton1 backbutton1 = new BackButton1();
        addObject(backbutton1,1077,740);
        backbutton1.setLocation(1066,734);
        TezeuEndlessLevel tezeuendlesslevel = new TezeuEndlessLevel();
        addObject(tezeuendlesslevel,1097,348);
        DedalEndlessLevel dedalendlesslevel = new DedalEndlessLevel();
        addObject(dedalendlesslevel,1129,453);
    }
}
