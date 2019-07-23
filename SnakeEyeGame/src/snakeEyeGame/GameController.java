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
public class GameController {

    public static final int NOT_STARTED = 0;
    public static final int PLAYING = 1;
    public static final int WIN = 2;
    // public static final int PLAYER2_WIN = 3;

    private Dice dice;
    private Player player1;
    private TheComputer theComp;
    private ScoreBoard scoreBoard;

    private int gameState;

    /**
     *
     * @param d
     * @param p1
     * @param p2
     */
    public GameController(Dice d, Player p1, TheComputer p2) {
        dice = d;
        player1 = p1;
        theComp = p2;
        scoreBoard = new ScoreBoard();
        gameState = NOT_STARTED;
    }

    private void updateGameState(Player p) {
        if (p.getScore() >= 100) {
            gameState = WIN;
            scoreBoard.showScore("Winner! " + p.getName());
        }
    }
    private void updateGameState(TheComputer p) {
        if (p.getScore() >= 100) {
            gameState = WIN;
            scoreBoard.showScore("Winner! " + p.getName());
        }
    }
    /**
     * Call this method to start the Snake Eye Game.
     */
    public void startGame() {
        gameState = PLAYING;

        while (gameState == PLAYING) {
            do {
                player1.takeTurn(dice);
                updateGameState(player1);
            } while (player1.playAgain() && gameState == PLAYING);

            while (gameState == PLAYING) {
                theComp.takeTurn(dice);
                updateGameState(theComp);
                if (theComp.playAgain() == false) {
                    break;
                }
            }
        }

    }

    /**
     * Re-sets the game state to NOT_STARTED.
     */
    public void init() {
        gameState = NOT_STARTED;
    }

    public int getCurrentGameState() {
        return gameState;
    }

}
