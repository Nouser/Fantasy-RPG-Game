import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class EnemyMana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyMana extends BattleMenu
{
    public Enemy e;
    /**
     * Act - do whatever the EnemyMana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyMana(Enemy e1)
    {
        e=e1;
    }
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = new GreenfootImage(200,20);
        image.setColor(Color.darkGray);
        image.fillRect(0, 0,100, 20);
        image.setColor(new Color(0,0,153));
        int length = (int)(((double)e.mana/(double)e.maxMana)*100);
        image.fillRect(0, 0, length, 20);
        Font font = image.getFont();
        font = font.deriveFont(12);
        image.setFont(font);
        image.setColor(new Color(0,0,204));
        String str = e.mana + "/" + e.maxMana;
        image.drawString(str, 110, 15);
        setImage(image);
    }    
}
