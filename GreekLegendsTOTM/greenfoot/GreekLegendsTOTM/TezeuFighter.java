import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TezeuFighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TezeuFighter extends Actor
{
    /**
     * Act - do whatever the TezeuFighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage face1 = new GreenfootImage ("tezeuface1.png");
    private GreenfootImage face2 = new GreenfootImage ("tezeuface2.png");
    private GreenfootImage face3 = new GreenfootImage ("tezeuface3.png");
        private GreenfootImage right1 = new GreenfootImage ("tr1.png");
        private GreenfootImage right2 = new GreenfootImage ("tr2.png");
    private GreenfootImage right3 = new GreenfootImage ("tr3.png");
        private GreenfootImage left1 = new GreenfootImage ("tl2.png");
        private GreenfootImage left2 = new GreenfootImage ("tl1.png");
    private GreenfootImage left3 = new GreenfootImage ("tl3.png");
        private GreenfootImage back1 = new GreenfootImage ("tezeuback1.png");
    private GreenfootImage back2 = new GreenfootImage ("tezeuback2.png");
    private GreenfootImage back3 = new GreenfootImage ("tezeuback3.png");
     public int frame1=0;
 public int frame2=0;
 public int frame3=0;
 public int frame4=0;
    public int HitTimer=0;
    public int direction=0;
   
    public void act() 
    {
        // Add your action code here.
        move ();
     }
   public void move ()
   {       if (Greenfoot.isKeyDown("up") && getY()>140)
        
           { setLocation(getX(),getY()-15); direction=3; animate (); }
        if (Greenfoot.isKeyDown("down"))
        {
          setLocation(getX(),getY()+15); direction=1; animate (); 
    }    
    if (Greenfoot.isKeyDown("left"))
        {
          setLocation(getX()-15,getY()); direction=2; animate ();  
    }  
     if (Greenfoot.isKeyDown("right"))
        {setLocation(getX()+15,getY()); direction=0; animate ();
    }  }
    public void animate ()
{if (direction==0) animateRight();
    else if (direction==1) animateFront();
    else if (direction==2) animateLeft();
    else if (direction==3) animateBack();
}public void animateFront ()
{if (frame1 == 10) setImage(face1);
      else if (frame1==20) setImage(face2);
      else if (frame1==30) setImage(face3);
      else if (frame1==40) {setImage(face2); frame1=10; return ;}
      frame1++;
}
public void animateRight ()
{if (frame2 == 10) setImage(right1);
      else if (frame2==20) setImage(right2);
      else if (frame2==30) setImage(right3);
      else if (frame2==40) {setImage(right2); frame2=10; return ;}
      frame2++;
}
public void animateLeft ()
{if (frame3 == 10) setImage(left1);
      else if (frame3==20) setImage(left2);
      else if (frame3==30) setImage(left3);
      else if (frame3==40) {setImage(left2); frame3=10; return ;}
      frame3++;
}
public void animateBack ()
{if (frame4 == 10) setImage(back1);
      else if (frame4==20) setImage(back2);
      else if (frame4==30) setImage(back3);
      else if (frame4==40) {setImage(back2); frame4=10; return ;}
      frame4++;
}
}
