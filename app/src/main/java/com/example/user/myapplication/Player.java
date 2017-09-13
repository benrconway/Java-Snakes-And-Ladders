package com.example.user.myapplication;

/**
 * Created by user on 13/09/2017.
 */

public class Player {

    private String name;
    private int position;

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return this.position;
    }

//    public void move(Rollable dice) {
//        int result = dice.roll();
//        changePosition(result);
//    }

    public void changePosition(int movement){
        this.position += movement;
    }
}
