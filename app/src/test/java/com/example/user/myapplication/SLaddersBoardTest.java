package com.example.user.myapplication;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

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

//    @Test
//    public void testPositionValues(){
//        assertEquals(3, board.getPositionValue(2));
//        assertEquals(-3, board.getPositionValue(4));
//    }

    @Test
    public void testEndSpace(){
        assertEquals(7, board.getEndSpace());
    }
}