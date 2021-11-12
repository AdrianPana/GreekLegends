import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinitaurasFighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinitaurasFighter extends Actor
{
    /**
     * Act - do whatever the MinitaurasFighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */// imagini necesare animatiei
     private GreenfootImage face1 = new GreenfootImage ("fata1.png");
    private GreenfootImage face2 = new GreenfootImage ("fata2.png");
    private GreenfootImage face3 = new GreenfootImage ("fata3.png");
        private GreenfootImage right1 = new GreenfootImage ("RightWalk2.png");
    private GreenfootImage right2 = new GreenfootImage ("RightWalk1.png");
    private GreenfootImage right3 = new GreenfootImage ("RightWalk3.png");
        private GreenfootImage left1 = new GreenfootImage ("LeftWalk2.png");
    private GreenfootImage left2 = new GreenfootImage ("LeftWalk3.png");
    private GreenfootImage left3 = new GreenfootImage ("LeftWalk4.png");
        private GreenfootImage back1 = new GreenfootImage ("spate1.png");
    private GreenfootImage back2 = new GreenfootImage ("spate3.png");
    private GreenfootImage back3 = new GreenfootImage ("spate4.png");
    private GreenfootImage r = new GreenfootImage ("rhit.png");
    private GreenfootImage f = new GreenfootImage ("fhit.png");
    private GreenfootImage l = new GreenfootImage ("lhit.png");
    private GreenfootImage b = new GreenfootImage ("bhit.png");
 private int stunTimer=550+Greenfoot.getRandomNumber(10*55);
 public int HP=3;
 private int ok=1;
 public int ok1=1;
 public int nr=0;
 private int timer=0;
 public int frame1=0;
 public int frame2=0;
 public int frame3=0;
 public int frame4=0;
 public int x=0;
 public int direction=0;
 public int hittimer=0;
    public void act() //comportamentul minotaurului
    {
        // Add your action code here.
        hittimer--;
        if (hittimer<0) {if (direction==0) setImage(right2);
    else if (direction==1) setImage(face2);
    else if (direction==2) setImage(left2);
    else if (direction==3) setImage(back2);}
    if (--stunTimer == -5*55) stunTimer = 10*55+Greenfoot.getRandomNumber(10*55);
    if (stunTimer > 0 && ok1==1) {   movee(); ok=1;}
    Actor tezeu = getOneIntersectingObject(TezeuFighter.class);
    if (tezeu != null) if (stunTimer>0) {getWorld().removeObject(tezeu); ok1=0;
        textbox3 textbox3 = new textbox3();
        getWorld().addObject(textbox3,710,350);
        RetryButton retrybutton = new RetryButton();
        getWorld().addObject(retrybutton,710,600);
        MenuButton menubutton = new MenuButton();
        getWorld().addObject(menubutton,710,710);
    }
    else {if (HP>1 && ok==1) {HP=HP-1; ok=0; hittimer=10; 
        if (direction==0) setImage(r);
    else if (direction==1) setImage(f);
    else if (direction==2) setImage(l);
    else if (direction==3) setImage(b);}
        else if (HP==1 && ok==1) {textbox2 textbox2 = new textbox2();
        getWorld().addObject(textbox2,710,410);
        getWorld().removeObject(this);
        
            } }}
public void movee ()
{ nr++;
    timer++;
    
    if (HP==3) {move();
        animate (); if (timer%40==0) turn();
        if (isAtEdge()) turnaround();}
        else if (HP==2) {animate(); move1 ();
        if (timer%20==0) turn();
        if (isAtEdge()) turnaround();}
        else if (HP==1) {animate(); move2 ();
        if (timer%20==0)turn();
        if (isAtEdge()) turnaround();}
}
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
public void turn ()
{direction = Greenfoot.getRandomNumber(3);
}
public void move (){animate ();
    if (direction==0) setLocation(getX()+Greenfoot.getRandomNumber(20),getY());
    else if (direction==1) setLocation(getX(),getY()+Greenfoot.getRandomNumber(20));
    else if (direction==2) setLocation(getX()-Greenfoot.getRandomNumber(20),getY());
    else if  (getY()>=160) setLocation(getX(),getY()-Greenfoot.getRandomNumber(20));
}
public void move1 (){animate ();
    if (direction==0) setLocation(getX()+Greenfoot.getRandomNumber(20)*2,getY());
    else if (direction==1) setLocation(getX(),getY()+Greenfoot.getRandomNumber(20)*2);
    else if (direction==2) setLocation(getX()-Greenfoot.getRandomNumber(20)*2,getY());
    else  setLocation(getX(),getY()-Greenfoot.getRandomNumber(20)*2);
}
public void move2 (){animate ();
    if (direction==0) setLocation(getX()+Greenfoot.getRandomNumber(20)*3,getY());
    else if (direction==1) setLocation(getX(),getY()+Greenfoot.getRandomNumber(20)*3);
    else if (direction==2) setLocation(getX()-Greenfoot.getRandomNumber(20)*3,getY());
    else  setLocation(getX(),getY()-Greenfoot.getRandomNumber(20)*3);
}
public void turnaround()
{if (direction==0) direction=2;
    else if (direction==1) direction=3;
    else if (direction==2) direction=0;
    else  direction=1;}
}