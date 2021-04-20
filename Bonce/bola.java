import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    private int speed = 4;
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkkeys();
        fall();
        // Add your action code here.
    }    
    private void checkkeys ()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setImage("b.png");
            moveleft();
        }
         if (Greenfoot.isKeyDown("right"))
        {
            setImage("b.png");
            moveright();
        }
         if (Greenfoot.isKeyDown("up"))
        {
            setImage("b.png");
            movetop();
        }
        
    }
    public void pijakan()
    {
        Actor B=getOneIntersectingObject(g.class);
        if(B!=null)
        {
            setLocation(getX(),getY());
        }
        else
        {
            fall();
        }

    }
    public void fall ()
    {
        setLocation (getX(), getY() + speed + 2);
    }
    public void moveright()
    {
        setLocation (getX() + speed, getY());
    }
    public void moveleft()
    {
        setLocation (getX() - speed, getY());
    }
    public void movetop()
    {
        setLocation (getX(), getY() - speed -20);
    }

    
}
