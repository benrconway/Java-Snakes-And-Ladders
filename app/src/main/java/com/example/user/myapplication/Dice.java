package com.example.user.myapplication;

import java.util.Random;

/**
 * Created by user on 13/09/2017.
 */

public class Dice implements Rollable {
    private int sides;

    public Dice (int sides){
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public int roll(){
        int min = 0;
        int max = this.getSides();

        Random die = new Random();

        int randomNumber = die.nextInt((max - min) +1) + min;

        return randomNumber;
    }
}
