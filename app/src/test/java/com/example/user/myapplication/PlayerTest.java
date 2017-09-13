package com.example.user.myapplication;

import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by user on 13/09/2017.
 */

public class PlayerTest {

    Player player1;

    @Before
    public void before(){
        player1 = new Player("Raul");
    }

    @Test
    public void canGetName(){
        assertEquals("Raul", player1.getName());
    }

    @Test
    public void startsAtZero(){
        assertEquals(0, player1.getPosition());
    }
}
