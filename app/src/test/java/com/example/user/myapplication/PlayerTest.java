package com.example.user.myapplication;

import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.Mockito;

/**
 * Created by user on 13/09/2017.
 */

public class PlayerTest {

    Player player1;
    Rollable fakeDice;

    @Before
    public void before(){
        player1 = new Player("Raul");
        fakeDice = Mockito.mock(Rollable.class);
    }

    @Test
    public void canGetName(){
        assertEquals("Raul", player1.getName());
    }

    @Test
    public void startsAtZero(){
        assertEquals(0, player1.getPosition());
    }

    @Test
    public void canMove() {
        Mockito.when(fakeDice.roll()).thenReturn(4);
        int move = fakeDice.roll();
        player1.changePosition(move);
        assertEquals( 4, player1.getPosition());
    }

    @Test
    public void canMoveTwice() {
        Mockito.when(fakeDice.roll()).thenReturn(4);
        int move = fakeDice.roll();
        player1.changePosition(move);
        Mockito.when(fakeDice.roll()).thenReturn(4);
        move = fakeDice.roll();
        player1.changePosition(move);
        assertEquals( 8, player1.getPosition());
    }


}
