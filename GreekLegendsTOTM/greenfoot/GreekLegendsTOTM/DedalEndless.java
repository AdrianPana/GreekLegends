import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DedalEndless here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DedalEndless extends Actor
{
    /**
     * Act - do whatever the DedalEndless wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int nr=0;
    public int score=0;
    public int score1=0;
    public int ok=1;
    public void act() 
    {
        // Add your action code here
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
        if (hp.HP>0){
        score++;
        movee ();
        
    }
    if (hp.HP==0 || getY()>=700 ||(getX()>=1330 && getY()<=85)) { hp.HP=0;
         DedalEndlessMessege dedalendlessmessege = new DedalEndlessMessege();
            getWorld().addObject(dedalendlessmessege,710,350);die ();
         getWorld().removeObject(this);}
       
            
}
public void movee (){if (Greenfoot.isKeyDown("up"))
        {setLocation(getX(),getY()-5);}
       if (Greenfoot.isKeyDown("down"))
        {setLocation(getX(),getY()+5);}
            if (Greenfoot.isKeyDown("left"))
            {setLocation(getX()-5,getY());}
                
            if (Greenfoot.isKeyDown("right"))
            {setLocation(getX()+5,getY());
            }}
private void die ()
       {    
        RetryButton retrybutton = new RetryButton();
        getWorld().addObject(retrybutton,710,600);
        MenuButton menubutton = new MenuButton();
        getWorld().addObject(menubutton,710,710);}
private void nohealth()
{ HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
    setRotation(270);
          while (getY()<780)  move (-10);
            if(getY()>=700)
        {  hp.HP=0;
            die();
        if (getY()>=780) getWorld().removeObject(this);
         }
}
private void sundeath()
{HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
    setRotation(270);
 while (getY()<780) move(-10);
    if(getY()>=700)
        {hp.HP=0;
            die();
        if (getY()>=780) getWorld().removeObject(this);
         }
}
    }    

