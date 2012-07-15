import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class EnemyHealth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyHealth extends BattleMenu
{
    public Enemy e;
    /**
     * Act - do whatever the EnemyHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyHealth(Enemy e1)
    {
        e=e1;
    }
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(200,20);
        image.setColor(Color.darkGray);
        image.fillRect(0, 0,100, 20);
        image.setColor(new Color(204,0,0));
        int length = (int)(((double)e.health/(double)e.maxHealth)*100);
        image.fillRect(0, 0, length, 20);
        Font font = image.getFont();
        font = font.deriveFont(12);
        image.setFont(font);
        image.setColor(new Color(255,51,51));
        String str = e.health + "/" + e.maxHealth;
        image.drawString(str, 110, 15);
        setImage(image);
    }    
}
