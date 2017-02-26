package com.liuwill.kata.hundredDoor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by videopls on 2017/2/26.
 */
public class DoorHolder{
    private ArrayList<Door> doors;
    private int index = 0;

    public static DoorHolder factoryDoorHolder(int count){
        DoorHolder doorHolder = new DoorHolder();
        for(int i=0;i<count;i++){
            doorHolder.createDoor();
        }
        return doorHolder;
    }

    public DoorHolder() {
        this.doors = new ArrayList<>();
    }

    public void createDoor(){
        Door door = new Door(doors.size());
        doors.add(door);
    }

    public void swichDoor(int position){
        Door door = doors.get(position-1);
        if(door.isOpen()){
            door.setOpen(false);
        }else{
            door.setOpen(true);
        }
    }

    public int countDoors(){
        return doors.size();
    }

    public Iterator getAllDoors(){
        return doors.iterator();
    }
}
