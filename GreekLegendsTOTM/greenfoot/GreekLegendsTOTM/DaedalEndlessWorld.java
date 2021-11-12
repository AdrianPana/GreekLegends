import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DaedalEndlessWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DaedalEndlessWorld extends World
{

    /**
     * Constructor for objects of class DaedalEndlessWorld.
     * 
     */
    private int x;
    private int y;
    private int z;
    public int timer =0 ;
    public DaedalEndlessWorld()
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
        DedalEndless dedalendless = new DedalEndless();
        addObject(dedalendless,1235,390);
        Wax wax = new Wax();
        addObject(wax,30,760);
        Wax wax2 = new Wax();
        addObject(wax2,90,760);
        Wax wax3 = new Wax();
        addObject(wax3,150,760);
        HP hp = new HP();
        addObject(hp,1374,755);
        DedalEndlessMessege dedalendlessmessege = new DedalEndlessMessege();
        addObject(dedalendlessmessege,1364,759);
        dedalendlessmessege.setLocation(1360,755);
        removeObject(dedalendlessmessege);
        textbox4 textbox4 = new textbox4();
        addObject(textbox4,723,409);
        textbox4.setLocation(710,350);
    }


    public void act() // random bird spawn
    {timer = timer + 1;
        HP hp = (HP) (getObjects(HP.class).get(0));
        if (hp.HP>0) {
         {x=Greenfoot.getRandomNumber(500);
        if (x<23)
       {z=Greenfoot.getRandomNumber(700);
        y=Greenfoot.getRandomNumber(100);
        if (y<10) addObject (new WhiteBird(),1,z);
        else 
           addObject (new Bird(),0,z);}
       else if (x<35)
       {addObject (new Bird2(),0,Greenfoot.getRandomNumber(650));}}
      }
    }
    
}
