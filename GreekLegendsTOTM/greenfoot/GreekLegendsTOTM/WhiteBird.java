import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteBird extends Actor
{
    /**
     * Act - do whatever the WhiteBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ private GreenfootImage fly1 = new GreenfootImage ("weitbirb.png");
    private GreenfootImage fly2 = new GreenfootImage ("weitbirbagain.png");
    public int nr=0;
    public void act() // animatie , verificare coliziuni si modificare viata jucator
    {
        // Add your action code here.
       
      nr++;
        if (nr==50) setImage (fly2);
        else if (nr==100) {setImage (fly1); nr=0;}
        move (5);
         if (getX()>=1400) getWorld().removeObject(this);
         else { HP hp = (HP) (getWorld().getObjects(HP.class).get(0));
       if (this.getWorld().getClass()==DaedalWorld.class)
        {Actor daedal = getOneObjectAtOffset(0,0,Daedal.class);
        if (daedal!=null) {
            
           if (hp.HP<3) hp.HP = hp.HP +1;
         getWorld().removeObject(this);}}
         else {Actor daedal2 = getOneObjectAtOffset(0,0,DedalEndless.class);
        if (daedal2!=null) {
            
           if (hp.HP<3) hp.HP = hp.HP +1;
         getWorld().removeObject(this);}}
    }
}    
}
