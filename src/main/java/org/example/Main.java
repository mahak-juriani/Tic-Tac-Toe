package org.example;


import org.example.controllers.GameController;
import org.example.exceptions.InvalidMoveException;
import org.example.models.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> players = List.of(
                new Player("Harsh", new Symbol('X'), ePlayerType.HUMAN),
                new Bot("Scaler", new Symbol('O'), ePlayerType.BOT, eBotDifficultyLevel.EASY)
        );

        Game game = gameController.startGame(dimension, players);
        //gameController.printBoard(game);

        while (game.getGameState().equals(eGameState.IN_PROGRESS)) {
            //1. print the board.
            gameController.printBoard(game);

            //2. Player's turn
            gameController.makeMove(game);
        }

        if (!gameController.checkState(game).equals(eGameState.ENDED)) {
            game.setGameState(eGameState.DRAW);
            System.out.println("Game DRAW");
        } else {
            gameController.printBoard(game);
            System.out.println("Player " + gameController.getWinner(game).getName() + " is the winner");
        }
    }
}