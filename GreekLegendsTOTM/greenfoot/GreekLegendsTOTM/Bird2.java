import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird2 extends Actor
{
    /**
     * Act - do whatever the Bird2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage fly1 = new GreenfootImage ("Bird.png");
    private GreenfootImage fly2 = new GreenfootImage ("birddagain.png");
    public int nr=0;
    private int ok=1;
    public void act() // animatie , verificare coliziuni si modificare viata jucator
    {
        // Add your action code here.
          nr++;
        if (nr==50) setImage (fly2);
        else if (nr==100) {setImage (fly1); nr=0;}
         if (getX()>=1400) getWorld().removeObject(this);
         else{
        if (getY()<=20)  ok=1;
        else if (getY()>=700) ok=2;
        if (ok==1) {setRotation (90); move (2);
            setRotation(0); move (3);}
            else if (ok==2) {setRotation(270); move (2);
                setRotation(0); move (3);}
                if (this.getWorld().getClass()==DaedalWorld.class)
                {Actor daedal = getOneObjectAtOffset(0,0,Daedal.class);
        if (daedal!=null)
        {HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
            if (hp.HP>0) {hp.HP= hp.HP-1; getWorld().removeObject(this);}
           // else if (hp.HP==1) Greenfoot.setWorld(new DaedalWorld());
        }}
       
    }
    }
}

