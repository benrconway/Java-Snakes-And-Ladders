package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class SLaddersBoardTest {

    Boards board;
    Player player1;
    Rollable fakeDice;


    @Before
    public void before(){
        board = new SLaddersBoard();
        player1 = new Player("Raul");
        fakeDice = Mockito.mock(Rollable.class);
    }

    @Test
    public void testPositionValues(){
        assertEquals(0, board.getPositionValue(0));
        assertEquals(0, board.getPositionValue(1));
        assertEquals(3, board.getPositionValue(2));
        assertEquals(0, board.getPositionValue(3));
        assertEquals(-3, board.getPositionValue(4));
        assertEquals(0, board.getPositionValue(5));
        assertEquals(0, board.getPositionValue(6));
    }


}