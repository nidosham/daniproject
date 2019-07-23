package snakeEyeGame;


import java.util.Scanner;


/**
 *
 * @author mrahman
 */
public class SnakeEyeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = scanner.next();
        Player p1 = new Player(name);
        TheComputer p2 = new TheComputer("Computer");
        Dice d = new Dice();
        
        GameController gc = new GameController(d, p1, p2);
        gc.init();
        gc.startGame();
        
    }
    
}
