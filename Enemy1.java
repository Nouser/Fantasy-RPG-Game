import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy1()
    {
        
        // Add your action code here.
        for(int i =0;i<4;i++)
        {
            attacks[i] = "Hello";
            attackStr[i] = 10;
            accuracy[i] = .9;
        }
        exp = 40;
        health = 100;
        mana = 50;
        maxHealth = 100;
        maxMana = 50;
    }
    public void act() 
    {
    }    
}
