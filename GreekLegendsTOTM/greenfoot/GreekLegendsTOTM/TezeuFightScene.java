import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuFightScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuFightScene extends World
{

    /**
     * Constructor for objects of class TezeuFightScene.
     * 
     */
    public TezeuFightScene()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1421, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tezeu tezeu = new Tezeu();
        addObject(tezeu,381,424);
        Minitauras minitauras = new Minitauras();
        addObject(minitauras,830,293);
        removeObject(minitauras);
        MinitaurasFighter minitaurasfighter = new MinitaurasFighter();
        addObject(minitaurasfighter,803,268);
        minitaurasfighter.setLocation(599,268);
        minitaurasfighter.setLocation(599,268);
        minitaurasfighter.setLocation(599,268);
        minitaurasfighter.setLocation(217,148);
        tezeu.setLocation(449,222);
        removeObject(minitaurasfighter);
        MinitaurasFighter minitaurasfighter2 = new MinitaurasFighter();
        addObject(minitaurasfighter2,816,266);
        tezeu.setLocation(257,423);
        TezeuFighter tezeufighter = new TezeuFighter();
        addObject(tezeufighter,352,493);
        removeObject(tezeu);
        tezeufighter.setLocation(390,371);
        minitaurasfighter2.setLocation(1005,415);
        minitaurasfighter2.setLocation(1002,376);
        textbox2 textbox2 = new textbox2();
        addObject(textbox2,600,618);
        removeObject(textbox2);
    }
}
