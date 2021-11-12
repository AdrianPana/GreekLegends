import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BonusWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusWorld extends World
{

    /**
     * Constructor for objects of class BonusWorld.
     * 
     */
    public BonusWorld()
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
        OlimpLevel olimplevel = new OlimpLevel();
        addObject(olimplevel,698,304);
        MazeHistory mazehistory = new MazeHistory();
        addObject(mazehistory,767,421);
        mazehistory.setLocation(761,469);
        olimplevel.setLocation(699,353);
        BackButton1 backbutton12 = new BackButton1();
        addObject(backbutton12,698,732);
        backbutton12.setLocation(694,730);
    }
}
