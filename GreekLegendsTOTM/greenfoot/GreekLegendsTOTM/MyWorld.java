import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
  public static GreenfootSound backgroundMusic = new GreenfootSound("vexentodreamcatcher.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1421, 800, 1); 
        //backgroundMusic.play();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        TezeuLevel tezeulevel = new TezeuLevel();
        addObject(tezeulevel,1100,200);

        DaedalLevel daedallevel = new DaedalLevel();
        addObject(daedallevel,1100,400);

        OlimpLevel olimplevel = new OlimpLevel();
        addObject(olimplevel,1100,600);

        removeObject(olimplevel);
        BonusButton bonusbutton = new BonusButton();
        addObject(bonusbutton,1100,600);
        tezeulevel.setLocation(1067,308);
        bonusbutton.setLocation(1038,489);

        removeObject(tezeulevel);
        removeObject(daedallevel);
        EndlessButton endlessbutton = new EndlessButton();
        addObject(endlessbutton,1108,392);
        endlessbutton.setLocation(1101,384);
        AdventureButton adventurebutton = new AdventureButton();
        addObject(adventurebutton,1028,278);
        adventurebutton.setLocation(1039,280);
        ExitButton exitbutton = new ExitButton();
        addObject(exitbutton,1107,603);
        exitbutton.setLocation(1102,594);
        adventurebutton.setLocation(1039,225);
        endlessbutton.setLocation(1102,329);
        bonusbutton.setLocation(1039,434);
        exitbutton.setLocation(1105,730);
        SettingsButton settingsbutton = new SettingsButton();
        addObject(settingsbutton,1156,554);
        settingsbutton.setLocation(1103,540);

    }
   /*public void stopped()
    {
      bg.setVolume(0); 
    }
    public void started()
    {
       bg.setVolume(100);  
    }*/
}
