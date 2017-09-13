package com.example.user.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/09/2017.
 */

public class GameTest {

    Player player1;
    Player player2;
    Boards board;
    Rollable fakeDice;
    Game sladdersTheGame;

    @Before
    public void before() {
        player1 = new Player("Raul");
        player2 = new Player("Jaguar");
        board = new SLaddersBoard();
        fakeDice = Mockito.mock(Rollable.class);
        sladdersTheGame = new Game(board, fakeDice);
    }

    @Test
    public void canHasPlayers(){
        assertEquals(0, sladdersTheGame.getPlayers().size());
    }

    @Test
    public void canHasOnePlayers(){
        sladdersTheGame.add(player2);
        assertEquals(1, sladdersTheGame.getPlayers().size());
    }

    @Test
    public void canHasMorePlayers(){
        sladdersTheGame.add(player1);
        sladdersTheGame.add(player2);
        assertEquals(2, sladdersTheGame.getPlayers().size());
    }

    @Test
    public void canPlayATurn(){
        sladdersTheGame.add(player2);
        Mockito.when(fakeDice.roll()).thenReturn(4);
        sladdersTheGame.playTurn();
        assertEquals(1, player2.getPosition());
    }

    @Test
    public void canPositionWithNoValue(){
        sladdersTheGame.add(player2);
        Mockito.when(fakeDice.roll()).thenReturn(1);
        sladdersTheGame.playTurn();
        assertEquals(1, player2.getPosition());
    }

    @Test
    public void canDeclareWinner(){
        sladdersTheGame.add(player1);
        sladdersTheGame.add(player2);
        Mockito.when(fakeDice.roll()).thenReturn(4).thenReturn(7);
        assertEquals("The game is over and the winner is Jaguar!", sladdersTheGame.playTurn());
    }

//    @Test

}
