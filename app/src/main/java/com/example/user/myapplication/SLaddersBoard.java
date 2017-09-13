package com.example.user.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2017.
 */

public class SLaddersBoard implements Boards{

    ArrayList<Integer> board;

    public SLaddersBoard() {
        this.board = new ArrayList<>();
        board.add(0);
        board.add(0);
        board.add(3);
        board.add(0);
        board.add(-3);
        board.add(0);
        board.add(0);
    }


    @Override
    public int getPositionValue(int index) {
        int positionValue = this.board.get(index);
        return positionValue;
    }
}
