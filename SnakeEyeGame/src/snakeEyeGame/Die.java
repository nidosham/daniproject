package snakeEyeGame;


import java.util.Random;



/**
 * This class models a real-world six-sided die.
 * @author mrahman
 */
public class Die {
    
    // ivar to maintain current faceValue of the Die object
    private int face;
    private Random rnd;
    
    /**
     * The default faceValue for the die is 0 (invalid);
     */
    Die(){
        face = 0;
        rnd = new Random();
    }
    
    /**
     * rolls the dice and randomly selects a face value between 1 and 6.
     */
    public void roll(){
        face = rnd.nextInt(6) + 1;
    }
    
    /**
     * Getter method for the face value of the die.  
     * @return the current face value
     */
    public int getFaceValue(){
        
        return face;
    }
    
}
