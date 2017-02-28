package com.liuwill.kata.hundredDoorWithArray;

/**
 * Created by videopls on 2017/2/28.
 */
public class DoorHodlerWithArray {
    private boolean[] doorsArr;
    private int count;

    public DoorHodlerWithArray(int count) {
        this.doorsArr = new boolean[count];
        this.count = count;
    }

    public void addDoor(int index, boolean state){
        if(index > count){
            throw new IndexOutOfBoundsException();
        }

        this.doorsArr[index-1] = state;
    }

    public void operateDoorHolder(int count){

    }
}
