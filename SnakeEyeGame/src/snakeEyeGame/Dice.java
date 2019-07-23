package snakeEyeGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * It encapsulates the Dice (two-Die) for the SnakeEye game.
 * @author mrahman
 */
public class Dice {
    // ivars for two Die
    private Die die1, die2;
    
    /**
     * initialize both Dies 
     */
    Dice(){
        die1 = new Die();
        die2 = new Die();
    }
    
    /**
     * Simulates rolling to two-die at the same time. 
     * @return the sum of faceValues of both Dies
     */
    public int roll(){
        die1.roll();
        die2.roll();
        
        return die1.getFaceValue() + die2.getFaceValue();
    }
    
    /** 
     * Getter method for the faceValue of Die1.
     * @return face value of Die1.
     */
    public int getFaceValueDie1(){
        return die1.getFaceValue();
    }

    /** 
     * Getter method for the faceValue of Die2.
     * @return face value of Die2.
     */
    public int getFaceValueDie2(){
        return die2.getFaceValue();
    }
    
    
}
