import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bola bola = new bola();
        addObject(bola,75,308);
        pijakan pijakan = new pijakan();
        addObject(pijakan,350,268);
        pijakan.setLocation(191,318);
        g g = new g();
        addObject(g,191,318);
        pijakan.setLocation(419,259);
    }
}
