import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
 * Write a description of class ActorWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActorWorld extends World
{
    public static int h = 1;
    public static char w = 'A';
    public static String file = "Maps/" + Integer.toString(h) + Character.toString(w) + ".txt"; 
    public Player play = new Player();
    public ActorWorld() throws IOException
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 10, 50, true); 
        initialPopulate("1A");
        file = "Maps/" + Integer.toString(h) + Character.toString(w) + ".txt"; 
        w='A';
        h=1;
        addObject(play,5,5);
    }
    public void initialPopulate(String fileName) throws IOException
    {
        InputStream input = getClass().getClassLoader().getResourceAsStream("Maps/1A.txt");
        BufferedReader r = new BufferedReader(new InputStreamReader(input));
        for(int i =0;i<10;i++)
        {
                String str = r.readLine();
                Scanner sc = new Scanner(str);
            for(int j=0;j<10;j++)
            {
                Actor myAct;
                switch(sc.nextInt())
                {
                    case 4:
                    myAct = new Bush();
                    break;
                    case 1:
                    myAct = new Grass();
                    break;
                    case 3:
                    myAct = new Tall();
                    break;
                    default:
                    myAct = new Grass();
                }
                addObject(myAct,j,i);
            }
    }
    r.close();
    input.close();
    }
    public void populate(String fileName) throws IOException
    {
        file = "Maps/" + fileName + ".txt";
        InputStream input = getClass().getClassLoader().getResourceAsStream(file);
        BufferedReader r = new BufferedReader(new InputStreamReader(input));
        for(int i =0;i<10;i++)
        {
            
                Scanner sc = new Scanner(r.readLine());
            for(int j=0;j<10;j++)
            {
                List myL = getObjectsAt(j,i,null);
                if(myL.size()!=0)
                {
                    removeObjects(myL);
                }
                Actor myAct;
                switch(sc.nextInt())
                {
                    case 4:
                    myAct = new Bush();
                    break;
                    case 1:
                    myAct = new Grass();
                    break;
                    case 3:
                    myAct = new Tall();
                    break;
                    case 5:
                    case 6:
                    addObject(new Grass(),j,i);
                    myAct = new Enemy1();
                    break;
                    default:
                    myAct = new Grass();
                }
                
                addObject(myAct,j,i);
            }
    }
    addObject(play,play.x,play.y);
    input.close();
    r.close();
}
    public void setPlayer(Player p, int direction)
    {
        play  =p;
        switch(direction)
        {
            case 1:
            play.y = 8;
            break;
            case 3:
            play.y = 1;
            break;
            case 2:
            play.x=1;
            break;
            case 4:
            play.x = 8;
        }
}
}
