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
public class DiceTester {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println(d.roll());
        System.out.println("Face value of Die 1 is "+d.getFaceValueDie1());
        System.out.println("Face value of Die 2 is "+d.getFaceValueDie2());
        
        
    }
    
}
