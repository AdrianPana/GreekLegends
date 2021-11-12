import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicButton extends Actor
{
    /**
     * Act - do whatever the MusicButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int volume=0;
    public void act() 
    {
        // Add your action code here.
        if (volume == 0)setImage("butonmuzica2.png");
        else setImage("butonmuzica.png");
        if (Greenfoot.mouseClicked(this)) 
        if (volume == 0) {volume = 50;MyWorld.backgroundMusic.playLoop();
            MyWorld.backgroundMusic.setVolume(50);
        setImage("butonmuzica.png");}
        else{ volume = 0;
        MyWorld.backgroundMusic.stop();
        setImage("butonmuzica2.png");}
    }    
    
}
