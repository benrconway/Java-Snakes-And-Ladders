package com.example.user.myapplication;

import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.Mockito;


/**
 * Created by user on 13/09/2017.
 */
public class DiceTest {

    Rollable dice;
    Rollable fakeDice;


    @Before
    public void before() {
        dice = new Dice(6);
        fakeDice = Mockito.mock(Rollable.class);
    }

    @Test
    public void canGetSides(){
        assertEquals(6, dice.getSides());
    }

    @Test
    public void canFake4(){
        Mockito.when(fakeDice.roll()).thenReturn(4);
        assertEquals(4, fakeDice.roll());
    }
}