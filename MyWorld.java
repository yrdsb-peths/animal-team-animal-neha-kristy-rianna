import greenfoot.*;

/**
 * The world our hero lives in 
 * @author Rianna 
 * @version May 2026
 */
public class MyWorld extends World 
{
    private int score = 0;
    private Label scoreLabel;

    public MyWorld() 
    {
        super(600, 400, 1);
        
        // create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBurger();
    }

    /**
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create a new burger at random location at top of the screen
     */
    public void createBurger()
    {
        Burger burger = new Burger();
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0;
        
        addObject(burger, x, y);
    }
}
