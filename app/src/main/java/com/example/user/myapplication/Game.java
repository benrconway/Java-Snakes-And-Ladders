package com.example.user.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public class Game {

    ArrayList<Player> players;
    Boards board;
    Rollable dice;
    
    public Game(Boards board, Rollable dice){
        this.players = new ArrayList<>();
        this.board = board;
        this.dice = dice;
    }


    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void add(Player player) {
        players.add(player);
    }

    public void playTurn(){
        for(Player player: this.players){
            int move = dice.roll();
            player.changePosition(move);
            int modifier = 0;
            if (board.getPositionValue(player.getPosition()) != null){
                modifier += board.getPositionValue(player.getPosition());
            }
            player.changePosition(modifier);
        }

    }
}
