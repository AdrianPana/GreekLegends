import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DaedalWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaedalWorld extends World
{

    /**
     * Constructor for objects of class DaedalWorld.
     * 
     */
    private int x;
    private int y;
    private int z;
    public int timer =0 ;
   
    public DaedalWorld()
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
        Daedal daedal = new Daedal();
        addObject(daedal,1400,400);
        daedal.setLocation(1186,409);
        Wax wax = new Wax();
        addObject(wax,30,760);
        Wax wax2 = new Wax();
        addObject(wax2,90,760);
        Wax wax3 = new Wax();
        addObject(wax3,150,760);
        HP hp = new HP();
        addObject(hp,1374,755);
    }


    public int gettimer()
    {return timer;}

    public void act() // random bird spawn
    {timer = timer + 1;
        HP hp = (HP) (getObjects(HP.class).get(0));
        if (timer <3000 && hp.HP>0) {
        if (timer <1000 && hp.HP>0) {
        x=Greenfoot.getRandomNumber(500);
        if (x<20)
       {z=Greenfoot.getRandomNumber(700);
        y=Greenfoot.getRandomNumber(100);
        if (y<10) addObject (new WhiteBird(),1,z);
        else addObject (new Bird(),0,z);}
       else if (x<23)
       {addObject (new Bird2(),0,Greenfoot.getRandomNumber(650));}}
       else {x=Greenfoot.getRandomNumber(500);
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