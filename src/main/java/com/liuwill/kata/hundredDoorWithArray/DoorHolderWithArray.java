package com.liuwill.kata.hundredDoorWithArray;

/**
 * Created by liuwill on 2017/2/28.
 */
public class DoorHolderWithArray {
    private boolean[] doorsArr;
    private int count;

    public static DoorHolderWithArray factoryDoorHolder(int count){
        DoorHolderWithArray doorHolder = new DoorHolderWithArray(count);
        for(int i=0;i<count;i++){
            doorHolder.addDoor(i+1,false);
        }
        return doorHolder;
    }

    public DoorHolderWithArray(int count) {
        this.doorsArr = new boolean[count];
        this.count = count;
    }

    public void addDoor(int index, boolean state){
        if(index > count){
            throw new IndexOutOfBoundsException();
        }

        this.doorsArr[index-1] = state;
    }

    public int countDoors(){
        return this.count;
    }

    public boolean[] getAllDoors(){
        return this.doorsArr;
    }

    public void operateDoorHolder(int count){
        for(int i = 0;i < count;i++){
            for(int j = 0;j < this.count; j++){
                if((j+1)%(i+1) == 0){
                    this.doorsArr[j] = !this.doorsArr[j];
                }
            }
        }
    }
}
