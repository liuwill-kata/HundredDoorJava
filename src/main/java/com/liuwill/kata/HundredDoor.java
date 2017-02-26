package com.liuwill.kata;

import com.liuwill.kata.hundredDoor.DoorHolder;

public class HundredDoor {
    public static final int DOOR_COUNT = 100;
    public static DoorHolder doorHolder;

    public static int answer() {
        doorHolder = DoorHolder.factoryDoorHolder(DOOR_COUNT);

        return 6 * 9;
    }
}
