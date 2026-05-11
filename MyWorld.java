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
        super(600, 400, 1, false);
        
        // create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBurger();
    }

    /**
     * end the game and draw "Game over"
     */
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over...", 100);
        addObject(gameOverLabel, 300, 200);
        
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
