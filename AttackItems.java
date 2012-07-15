import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.*;
/**
 * Write a description of class AttackItems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AttackItems extends BattleMenu
{
    public int number;
    public Player p;
    public Enemy e;
    /**
     * Act - do whatever the AttackItems wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void setNum(int num)
    {
        number = num;
    }
    public AttackItems(String text, Player p1, Enemy e1)
    {

        GreenfootImage image = new GreenfootImage(100,20);
        image.fillRect(0, 0,100, 20);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, 90, 10);
        Font font = image.getFont();
        font = font.deriveFont(12);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(text, 35, 15);
        setImage(image);
        p=p1;
        e=e1;
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            CalculateBattle myB;
            double dbl = p.accuracy[0];
            if(Math.random()<p.accuracy[number])
            {
            myB= new CalculateBattle(p,number,e);
            if(myB.x==1)
            {
                Battle myW = (Battle)getWorld();
         
                myW.world.removeObject(e);
                Greenfoot.setWorld(myW.world);
            }
        }
            Random rnd = new Random();
            myB = new CalculateBattle(e,rnd.nextInt(4),p);
            if(myB.x==1)
            {
                Battle myW = (Battle)getWorld();
                myW.world.removeObject(e);
                Greenfoot.setWorld(myW.world);
            }
        }
        // Add your action code here.
    }    
}
