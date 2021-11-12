import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage fly1 = new GreenfootImage ("Bird.png");
    private GreenfootImage fly2 = new GreenfootImage ("birddagain.png");
    public int nr=0;
    public void act() // animatie , verificare coliziuni si modificare viata jucator
    {
        // Add your action code here.
        nr++;
        if (nr==50) setImage (fly2);
        else if (nr==100) {setImage (fly1); nr=0;}
        move (5);
        if (getX()>=1400) getWorld().removeObject(this);
        else {if (this.getWorld().getClass()==DaedalWorld.class)
            {Actor daedal = getOneObjectAtOffset(0,0,Daedal.class);
        if (daedal!=null)
        {Actor candle = getOneObjectAtOffset(0,32,Candle.class);
        getWorld().removeObject(candle);
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
            if (hp.HP>0) {hp.HP= hp.HP-1; getWorld().removeObject(this);
            }   
        }}
        else {Actor daedal2 = getOneObjectAtOffset(0,0,DedalEndless.class);
        if (daedal2!=null)
        {Actor candle = getOneObjectAtOffset(0,32,Candle.class);
        getWorld().removeObject(candle);
        HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
            if (hp.HP>0) {hp.HP= hp.HP-1; getWorld().removeObject(this);
            }   
        }}
    }
    }    
}
