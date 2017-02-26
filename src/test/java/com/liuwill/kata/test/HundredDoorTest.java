package com.liuwill.kata.test;

import com.liuwill.kata.HundredDoor;
import com.liuwill.kata.hundredDoor.DoorHolder;
import org.junit.*;
import static org.junit.Assert.*;

public class HundredDoorTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = HundredDoor.answer();
        System.out.println("life_the_universe_and_everything");
        assertEquals(expected, actual);
    }

    @Test
    public void is_door_defined() {
        int expected = HundredDoor.DOOR_COUNT;
        DoorHolder doorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);
        int actual = doorHolder.countDoors();
        System.out.println("is_door_defined");
        assertEquals(expected, actual);
    }
}
