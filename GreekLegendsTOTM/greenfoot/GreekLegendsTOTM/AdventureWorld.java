import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AdventureWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdventureWorld extends World
{

    /**
     * Constructor for objects of class AdventureWorld.
     * 
     */
    public AdventureWorld()
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
        TezeuLevel tezeulevel2 = new TezeuLevel();
        addObject(tezeulevel2,1100,332);
        tezeulevel2.setLocation(1097,348);
        DaedalLevel daedallevel2 = new DaedalLevel();
        addObject(daedallevel2,1134,450);
        daedallevel2.setLocation(1129,453);
        BackButton1 backbutton1 = new BackButton1();
        addObject(backbutton1,1079,743);
        backbutton1.setLocation(1069,734);
        backbutton1.setLocation(1066,734);
    }
}
