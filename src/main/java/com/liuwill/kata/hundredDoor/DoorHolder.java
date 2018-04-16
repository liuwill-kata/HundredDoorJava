package com.liuwill.kata.hundredDoor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by liuwill on 2017/2/26.
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
        Door door = new Door(doors.size()+1);
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

    public Door getDoorAt(int position){
        if(position > doors.size() || position<1){
            throw new IndexOutOfBoundsException("there is not so much doors");
        }
        return doors.get(position-1);
    }

    public int countDoors(){
        return doors.size();
    }

    public Iterator<Door> getAllDoors(){
        return doors.iterator();
    }

    public void operateDoorHolder(int count){
        for(Door door : doors){
            if(door.getIndex()%count == 0){
                door.switchDoor();
            }
        }
    }
}
