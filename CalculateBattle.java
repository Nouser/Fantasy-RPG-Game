/**
 * Write a description of class CalculateBattle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalculateBattle  
{
    // instance variables - replace the example below with your own
    public int x=0;

    /**
     * Constructor for objects of class CalculateBattle
     */
    public CalculateBattle(Player p, int choice, Enemy emy)
    {
        if(p.attackStr[choice]>0)
        emy.health -= p.attackStr[choice];
        else
        {
        p.health+=p.attackStr[choice]*-1;
        if(p.health>p.maxHealth)
        p.health = p.maxHealth;
    }
        if(emy.health<=0)
        {
            //Faint logic here
            x=1;
        }
    }
    public CalculateBattle(Enemy emy, int choice, Player p)
    {
        if(emy.attackStr[choice]>0)
        p.health -= emy.attackStr[choice];
        else
        {
        emy.health+=emy.attackStr[choice]*-1;
        if(emy.health>emy.maxHealth)
        emy.health = emy.maxHealth;
    }
        if(p.health<=0)
        {
            //Loss logic here
            x=1;
        }
    }
}






