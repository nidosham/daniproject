package snakeEyeGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */
public class DieTester {
    public static void main(String[] args) {
        Die d =new Die();
        d.roll();
        System.out.println("the face value "+d.getFaceValue());
    }
    
}
