import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class PlayerMana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerMana extends BattleMenu
{
    Player play;
    /**
     * Act - do whatever the PlayerMana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayerMana(Player p)
    {
        play = p;
    }
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(200,20);
        image.setColor(Color.darkGray);
        image.fillRect(0, 0,100, 20);
        image.setColor(new Color(0,0,153));
        int length = (int)(((double)play.mana/(double)play.maxMana)*100);
        image.fillRect(0, 0, length, 20);
        Font font = image.getFont();
        font = font.deriveFont(12);
        image.setFont(font);
        image.setColor(new Color(0,0,204));
        String str = play.mana + "/" + play.maxMana;
        image.drawString(str, 110, 15);
        setImage(image);
    }    
}
