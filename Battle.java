import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle extends World
{
    public boolean first = true;
    public int area;
    public ActorWorld world;
    public Enemy myEnemy;
    public Player player;
    /**
     * Constructor for objects of class Battle.
     * 
     */
    public Battle(int are, ActorWorld worl, Enemy myEnem, Player playe)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1, true); 
        area = are;world=worl;myEnemy=myEnem;player=playe;
        area=3;
    }
    public void act()
    {
        //Background images
        switch(area)
        {
            case 1:
            setBackground("forest.png");
            break;
            case 2:
            setBackground("snow.png");
            break;
            case 3:
            setBackground("Mountain1.png");
            break;
            default:
            setBackground("inside.png");
        }
        if(first)
        {
        addObject(new PlayerBattle(), 108, 270);
        String s = myEnemy.getClass().toString();
        s=s.substring(6);
        if(s.equals("Enemy1"))
            addObject(new Enemy1Battle(), 410,270);
        addObject(new BattleMenu(player,myEnemy),0,0);first=!first;}
        removeObjects(getObjects(PlayerHealth.class));
        addObject(new PlayerHealth(player), 410,430);
        addObject(new PlayerMana(player),410,460);
        addObject(new EnemyHealth(myEnemy),435,25);
        
        addObject(new EnemyMana(myEnemy),435,55);
    }
}












