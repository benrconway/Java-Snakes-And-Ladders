package com.example.user.myapplication;

/**
 * Created by user on 13/09/2017.
 */

public class Runner {
    public static void main(String[] args){
        Boards board = new SLaddersBoard();
        Player player1 = new Player("Classic Raul");
        Player player2 = new Player("Johhny Knows More");
        Rollable dice = new Dice(6);
        Game game = new Game(board, dice);


        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());
        System.out.println(game.playTurn());



    }
}
