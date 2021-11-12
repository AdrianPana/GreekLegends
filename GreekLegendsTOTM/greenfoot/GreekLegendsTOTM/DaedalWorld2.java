import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DaedalWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaedalWorld2 extends World
{

    /**
     * Constructor for objects of class DaedalWorld2.
     * 
     */
    public DaedalWorld2()
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
        Daedal2 daedal2 = new Daedal2();
        addObject(daedal2,1400,400);
    }
}
