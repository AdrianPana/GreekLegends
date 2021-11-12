import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Daedal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daedal extends Actor
{
    /**
     * Act - do whatever the Daedal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int height;
    public void act() 
    {
        // Add your action code here.
        int timer = ((DaedalWorld) getWorld()).timer;
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
     
        if (timer>=3300) {  move (-5);
            if(getX()<5) { getWorld().removeObject(this);
            Greenfoot.setWorld (new DaedalWorld2());
            }}
        else{
        
        if (hp.HP>0)
        {
        movee ();
        }
        else {nohealth();}
        if (hp.HP>0)if(getY()>=700)
        {
            die (); hp.HP=0;
        if (hp.HP>0) if (getY()>=780) getWorld().removeObject(this);
         }
        else if (hp.HP>0)  if  (getX()>=1330 && getY()<=85)
        {sundeath();
        }
        
        } 
       
            
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
       {textbox3 textbox3 = new textbox3();
        getWorld().addObject(textbox3,710,350);
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