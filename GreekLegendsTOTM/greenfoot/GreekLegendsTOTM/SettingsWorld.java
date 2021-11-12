import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SettingsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingsWorld extends World
{

    /**
     * Constructor for objects of class SettingsWorld.
     * 
     */
    public SettingsWorld()
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
        addObject(backbutton1,706,698);
        backbutton1.setLocation(706,710);
        InstructionsButton instructionsbutton = new InstructionsButton();
        addObject(instructionsbutton,730,408);
        instructionsbutton.setLocation(729,438);
        MusicButton musicbutton = new MusicButton();
        addObject(musicbutton,667,338);
        musicbutton.setLocation(666,329);
        musicbutton.setLocation(667,285);
        instructionsbutton.setLocation(729,393);
        backbutton1.setLocation(662,710);
    }
   
}
