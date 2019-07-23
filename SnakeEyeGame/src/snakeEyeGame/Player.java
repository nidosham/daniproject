package snakeEyeGame;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */
public class Player {
    
    private String name;
    private int score;
    
    private Scanner kb;
    /**
     * Inits the score to zero.
     * @param name name of the player.
     */
    Player(String name){
        this.name = name;
        score = 0; 
        kb = new Scanner(System.in);
    }
    
    public String getName(){
        return name;
    }
    /**
     * 
     * @return 
     */
    public int getScore(){
        return score;
    }
    
    /**
     * 
     * @param score 
     */
    public void updateScore(int score){
        this.score = score;
    }
    
    /**
     * Player takes turn;
     *  - first, he rolls the dice and updates its score
     * 
     *  
     * @param d the Dice passed to the player.
     */
    public void takeTurn(Dice d){
        System.out.println(name + " is rolling....");
        int cs = d.roll();
        System.out.println("Current score of "+name+ " is "+ score);
        System.out.println(name + " rolled "+cs);
        
        if(cs == 2){
            updateScore(0);
        }else if(d.getFaceValueDie1() != 1 && d.getFaceValueDie2() != 1){
            updateScore(score + cs);
        }else{
            System.out.println(name + " rolled a 1, hence no score update at this round.");
        }
        
        
    }
    
    /**
     * Asks the user if he/she wants to play again or not?
     * @return true if the player wants to play again; false otherwise
     */
   public boolean playAgain(){
        System.out.println(name + " : Do you want to try again? (y/n)");
        String choice = kb.nextLine();
        if(choice.equalsIgnoreCase("y"))
            return true;
        return false;
    }
    
    
    
}
