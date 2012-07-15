import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleMenu extends Actor
{
public boolean first = true;
public Enemy e;
public Player p;
    /**
     * Act - do whatever the BattleMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BattleMenu(Player p1, Enemy e1)
    {
        p=p1;
        e=e1;
    }
    public BattleMenu(){}
    public void act() 
    {
        if(first)
        {
            AttackItems myObj = new AttackItems(p.attacks[0],p,e);
            World myW = getWorld();
            myObj.setNum(0);
            myW.addObject(myObj, 120, 430);
            myObj = new AttackItems(p.attacks[1],p,e);
            myObj.setNum(1);
            myW.addObject(myObj,250, 430);
            myObj = new AttackItems(p.attacks[2],p,e);
            myObj.setNum(2);
            myW.addObject(myObj,120, 460);            
            myObj = new AttackItems(p.attacks[3],p,e);
            myObj.setNum(3);
            myW.addObject(myObj,250, 460);
        first =!first;
      }
        // Add your action code here.
    }    
}














