import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OlimpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OlimpWorld extends World
{

    /**
     * Constructor for objects of class OlimpWorld.
     * 
     */
    public OlimpWorld()
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

        runner runner = new runner();
        addObject(runner,909,739);
        runner.setLocation(110,735);
        runner.turn(-90);

        runner1 runner1 = new runner1();
        addObject(runner1,310,735);
        runner1.setRotation(-90);
        runner2 runner2 = new runner2();
        addObject(runner2,515,735);
        runner3 runner3 = new runner3();
        addObject(runner3,710,735);
        runner4 runner4 = new runner4();
        addObject(runner4,910,735);
        runner5 runner5 = new runner5();
        addObject(runner5,1115,735);
        runner6 runner6 = new runner6();
        addObject(runner6,1310,735);
        runner2.setRotation(-90);
        runner3.setRotation(-90);
        runner4.setRotation(-90);
        runner5.setRotation(-90);
        runner6.setRotation(-90);
        PLACE place = new PLACE();
        addObject(place,1404,20);

        OlimpFinishMessege olimpfinishmessege = new OlimpFinishMessege();
        addObject(olimpfinishmessege,715,399);
        removeObject(olimpfinishmessege);

        countdown countdown = new countdown();
        addObject(countdown,718,398);
    }
}
