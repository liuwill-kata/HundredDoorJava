package com.liuwill.kata.test;

import com.liuwill.kata.HundredDoor;
import com.liuwill.kata.hundredDoorWithArray.DoorHolderWithArray;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by videopls on 2017/2/27.
 */
public class HundredDoorWithArrayTest {

    @Before
    public void init(){

    }

    @Test
    public void is_count_times(){
        for(int t=1;t<=HundredDoor.DOOR_COUNT;t++){
            DoorHolderWithArray doorHolderWithArray = DoorHolderWithArray.factoryDoorHolder(HundredDoor.DOOR_COUNT);
            boolean[] resultDoorStates = HundredDoor.generateResultArray(HundredDoor.DOOR_COUNT,t);

            assertEquals(doorHolderWithArray.countDoors(),resultDoorStates.length);

            doorHolderWithArray.operateDoorHolder(t);
            boolean[] finalDoors = doorHolderWithArray.getAllDoors();
            for(int j = 0;j<finalDoors.length;j++){
                assertEquals(resultDoorStates[j],finalDoors[j]);
            }
        }
        System.out.println("is_count_times");
    }

    @Test
    public void is_size_times(){
        for(int i=1;i<=HundredDoor.DOOR_COUNT;i++){
            DoorHolderWithArray doorHolderWithArray = DoorHolderWithArray.factoryDoorHolder(i);
            boolean[] resultDoorStates = HundredDoor.generateResultArray(i,i);

            assertEquals(doorHolderWithArray.countDoors(),resultDoorStates.length);
            assertEquals(i,doorHolderWithArray.countDoors());

            doorHolderWithArray.operateDoorHolder(i);
            boolean[] finalDoors = doorHolderWithArray.getAllDoors();
            for(int j = 0;j<finalDoors.length;j++){
                assertEquals(resultDoorStates[j],finalDoors[j]);
            }
            assertEquals(i,finalDoors.length);
        }
        System.out.println("is_size_times");
    }
}
