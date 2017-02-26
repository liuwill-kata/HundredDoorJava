package com.liuwill.kata.test;

import com.liuwill.kata.HundredDoor;
import org.junit.*;
import static org.junit.Assert.*;

public class HundredDoorTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = HundredDoor.answer();
        System.out.println("false");
        assertEquals(expected, actual);
    }
}
