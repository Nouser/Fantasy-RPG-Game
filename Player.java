import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Characters
{
    public static int x;
    public static int y;
    public int direction;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        mana = 50;
        maxMana = 50;
        health = 100;
        maxHealth = 100;
        attacks[0] = "Slice";
        attacks[1] = "Heal";
        attacks[2] = "Trip";
        attacks[3] = "Screech";
        attackStr[0]=30;
        attackStr[1] = -20;
        attackStr[2] = 20;
        attackStr[3] = 10;
        accuracy[0] = .7;
        accuracy[1] = 1;
        accuracy[2] = .85;
        accuracy[3] = .95;
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
        setImage("CharUp.png");
        if(getObjectsAtOffset(0, -1, Bush.class).size()==0)
        setLocation(getX(), getY()-1);
    }
    else if(Greenfoot.isKeyDown("down"))
        {
        setImage("CharDown.png");
        if(getObjectsAtOffset(0,+1, Bush.class).size()==0)
        setLocation(getX(), getY()+1);
    }
    else if(Greenfoot.isKeyDown("left"))
        {
            
        setImage("CharLeft.png");
        if(getObjectsAtOffset(-1,0, Bush.class).size()==0)
        setLocation(getX()-1, getY());
    }
    else if(Greenfoot.isKeyDown("right"))
        {
        setImage("CharRight.png");
        if(getObjectsAtOffset(1, 0, Bush.class).size()==0)
        setLocation(getX()+1, getY());
    }
    check();
    battle();
    }
    
    public void battle()
    {
        List<Enemy> enemies = getObjectsAtOffset(0,0,Enemy.class);
        if(enemies.size()!=0)
        {
            Enemy myE = enemies.get(0);
            World myBattle = new Battle(1, (ActorWorld)getWorld(), myE, this);
            Greenfoot.setWorld(myBattle);
        }
    }
  
    
    public void check()
    {
        //Check for edges.
        if(getY()==0)
    {
        Player p =this;
       ActorWorld myWorld = (ActorWorld)getWorld();
       try{
           x = getX();
           y =getY();
           myWorld.setPlayer(p,1);
           myWorld.h+=1;
       myWorld.populate(Integer.toString(myWorld.h) + Character.toString(myWorld.w));
    }
    catch(IOException e){};
    }
    if(getY()==9)
    {
        
        Player p =this;
       ActorWorld myWorld = (ActorWorld)getWorld();
       try{
           x = getX();
           y =getY();
           myWorld.setPlayer(p,3);
           myWorld.h-=1;
       myWorld.populate(Integer.toString(myWorld.h) + Character.toString(myWorld.w));
    }
    catch(IOException e){};
    }
    if(getX()==0)
    {
        
        Player p =this;
       ActorWorld myWorld = (ActorWorld)getWorld();
       try{
           x = getX();
           y =getY();
           myWorld.setPlayer(p,4);
           myWorld.w-=1;
       myWorld.populate(Integer.toString(myWorld.h) + Character.toString((myWorld.w)));
    }
    catch(IOException e){};
    }
    if(getX()==9)
    {
        
        Player p =this;
       ActorWorld myWorld = (ActorWorld)getWorld();
       try{
           x = getX();
           y =getY();
           myWorld.setPlayer(p,2);
           myWorld.w+=1;
       myWorld.populate(Integer.toString(myWorld.h) + Character.toString(myWorld.w));
    }
    catch(IOException e){};
    }
    }
    }    












