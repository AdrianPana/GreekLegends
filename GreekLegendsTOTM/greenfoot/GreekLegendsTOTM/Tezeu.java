import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tezeu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tezeu extends Actor
{
    /**
     * Act - do whatever the Tezeu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage face = new GreenfootImage ("tezeuface.png");
    private GreenfootImage back = new GreenfootImage ("tezeuback.png");
    private GreenfootImage right = new GreenfootImage ("tezeuright.png");
    private GreenfootImage left = new GreenfootImage ("tezeuleft.png");
    public void act() 
    {
        // Add your action code here.
        Actor wall;
        Actor wall1;
        Actor wall2;
        Actor wall3;
        Actor wall4;
        if (Greenfoot.isKeyDown("up"))
        {wall = getOneObjectAtOffset(0,-20,orizontalwall.class);
            wall1 = getOneObjectAtOffset(0,-20,verticalwall.class);
            
            if (wall==null && wall1==null){
            setLocation(getX(),getY()-3); setImage(back);
    }    }
    if (Greenfoot.isKeyDown("down"))
        {wall = getOneObjectAtOffset(0,20,orizontalwall.class);
            wall1 = getOneObjectAtOffset(0,20,verticalwall.class);
            wall2 = getOneObjectAtOffset(0,20,secretdoor2.class);
            if (wall==null && wall1==null && wall2==null){setLocation(getX(),getY()+3); 
                setImage(face);
    }    }
    if (Greenfoot.isKeyDown("left"))
        {wall = getOneObjectAtOffset(-20,0,orizontalwall.class);
            wall1 = getOneObjectAtOffset(-20,0,verticalwall.class);
            wall2 = getOneObjectAtOffset(-20,0,secretdoor2.class);
            wall3 = getOneObjectAtOffset(-20,0,secretdoor.class);
            if (wall==null && wall1==null && wall2==null && wall3==null){setLocation(getX()-3,getY()); 
                setImage(left);
    }  }
    if (Greenfoot.isKeyDown("right"))
        {wall = getOneObjectAtOffset(20,0,orizontalwall.class);
            wall1 = getOneObjectAtOffset(20,0,verticalwall.class);
            wall2 = getOneObjectAtOffset(20,0,secretdoor.class);
            wall3 = getOneObjectAtOffset(20,0,secretdoor1.class);
            wall4 = getOneObjectAtOffset(20,0,secretdoor2.class);
            if (wall==null && wall1==null && wall2==null && wall3==null){setLocation(getX()+3,getY());
                setImage(right);
    }  }  
    Actor Minotaur;
    Minotaur = getOneObjectAtOffset(0,0,Minitauras.class);
    if (Minotaur!=null)
    Greenfoot.setWorld(new TezeuFightScene());}
}

