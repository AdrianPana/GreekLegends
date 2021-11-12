import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuEndlessWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuEndlessWorld extends World
{

    /**
     * Constructor for objects of class TezeuEndlessWorld.
     * 
     */
    public TezeuEndlessWorld()
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
        MinotaurEndless minotaurendless = new MinotaurEndless();
        addObject(minotaurendless,901,424);
        minotaurendless.setLocation(917,422);
        TezeuEndless tezeuendless = new TezeuEndless();
        addObject(tezeuendless,292,416);
        tezeuendless.setLocation(279,386);
        tezeuendless.setLocation(299,414);
        minotaurendless.setLocation(1033,408);
    }
}
