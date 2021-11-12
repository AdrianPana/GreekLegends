import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lever1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lever1 extends Actor
{
    /**
     * Act - do whatever the lever1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private GreenfootImage turn = new GreenfootImage ("maneta2.png");
     public int ok=0;
    public void act() 
    {
        // Add your action code here.
        Actor tezeu = getOneObjectAtOffset(0,0,Tezeu.class);
        if (tezeu!=null) {setImage(turn);
          ok=1;
    }    
}
}