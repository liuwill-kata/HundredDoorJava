package com.liuwill.kata.test;

import com.liuwill.kata.HundredDoor;
import com.liuwill.kata.hundredDoor.Door;
import com.liuwill.kata.hundredDoor.DoorHolder;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class HundredDoorTest {

    private static DoorHolder doorHolder;
    private static boolean[] resultDoorStates;

    @Before
    public void init(){
        doorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);
    }

    @Test
    public void test_result(){
        DoorHolder testDoorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);
        resultDoorStates = HundredDoor.generateResultArray(HundredDoor.DOOR_COUNT);

        for(int i=0;i<HundredDoor.DOOR_COUNT;i++){
            testDoorHolder.operateDoorHolder(i+1);
        }

        for (Iterator<Door> it = testDoorHolder.getAllDoors(); it.hasNext(); ) {
            Door door = it.next();

            int index = door.getIndex() - 1;
            assertEquals(resultDoorStates[index],door.isOpen());
        }
    }

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = HundredDoor.answer();
        System.out.println("life_the_universe_and_everything");
        assertNotEquals(expected, actual);
    }

    @Test
    public void is_door_defined() {
        int expected = HundredDoor.DOOR_COUNT;
        //DoorHolder doorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);
        int actual = doorHolder.countDoors();
        System.out.println("is_door_defined");

        assertEquals(expected, actual);
    }

    @Test
    public void is_door_closed() {
        //DoorHolder doorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);

        System.out.println("is_door_closed");

        Iterator<Door> doorList = doorHolder.getAllDoors();
        for (Iterator<Door> it = doorList; it.hasNext(); ) {
            Door door = it.next();
            assertFalse(door.isOpen());
        }
    }

    @Test
    public void is_position_ok(){
        //DoorHolder doorHolder = DoorHolder.factoryDoorHolder(HundredDoor.DOOR_COUNT);
        HashMap<Integer,Door> testSet = new HashMap<>();
        Random random = new Random();

        int randPos = random.nextInt(HundredDoor.DOOR_COUNT)%(HundredDoor.DOOR_COUNT+1);
        int startPos = HundredDoor.START_INDEX;
        int lastPos = HundredDoor.DOOR_COUNT;

        Door randDoor = doorHolder.getDoorAt(randPos);
        Door startDoor = doorHolder.getDoorAt(startPos);
        Door endDoor = doorHolder.getDoorAt(lastPos);
        testSet.put(randPos,randDoor);
        testSet.put(startPos,startDoor);
        testSet.put(lastPos,endDoor);
        System.out.println("is_position_ok");

        for(Map.Entry<Integer,Door> doorSet:testSet.entrySet()) {
            Door door = doorSet.getValue();
            assertFalse(door.isOpen());
            assertEquals(doorSet.getKey().intValue(), door.getIndex());
        }
    }
}
