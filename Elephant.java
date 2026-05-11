import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephan, our hero.
 * 
 * @author (Rianna) 
 * @version (May 2026)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        
        //remove apple if elephant eats it
        eat();
    }
    
    /**
     * eat the burger and spawn new burger if a burger is eaten
     */
    public void eat()
    {
        if(isTouching(Burger.class))
        {
            removeTouching(Burger.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBurger();
        }
        
    }
}
