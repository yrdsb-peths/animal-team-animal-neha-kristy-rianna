import greenfoot.*;

/**
 * The world our hero lives in 
 * @author Rianna 
 * @version May 2026
 */
public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createBurger();
    }
    
    /**
     * Create a new apple at random location at top of the screen
     */
    public void createBurger()
    {
        Burger burger = new Burger();
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0;
        addObject(burger, x, y);
    }
}
