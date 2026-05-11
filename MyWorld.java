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
        
        Burger burger = new Burger();
        addObject(burger, 300, 0);
    }
}
