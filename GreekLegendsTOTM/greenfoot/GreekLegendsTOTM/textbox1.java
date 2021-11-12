import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textbox1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textbox1 extends Actor
{
    /**
     * Act - do whatever the textbox1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */public int scor;
    public void act() 
    {
        // Add your action code here.
         
        if (this.getWorld().getClass()==OlimpWorld.class)
        {OlimpFinishMessege olimpfinishmessege = new OlimpFinishMessege();
        getWorld().addObject(olimpfinishmessege,710,350);}
        else if (this.getWorld().getClass()==TezeuEndlessWorld.class)
        {TezeuEndlessMessege tezeuendlessmessege = new TezeuEndlessMessege();
            getWorld().addObject(tezeuendlessmessege,710,350);}
           
               
           
}
}