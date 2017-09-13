package com.example.user.myapplication;

import java.util.HashMap;

/**
 * Created by user on 13/09/2017.
 */

public class SLaddersBoard implements Boards{

    private HashMap<Integer, Integer> board;
    private int endSpace;

    public SLaddersBoard() {
        this.board = new HashMap<>();
        board.put(2, 3);
        board.put(4, -3);
        this.endSpace = 7;
    }


    @Override
    public Integer getPositionValue(int index) {
        return board.get(index);
    }

    @Override
    public int getEndSpace() {
        return this.endSpace;
    }


}
