package com.liuwill.kata;

import com.liuwill.kata.hundredDoor.DoorHolder;

public class HundredDoor {
    public static final int DOOR_COUNT = 100;
    public static final int START_INDEX = 1;
    public static DoorHolder doorHolder;

    public static int answer() {
        doorHolder = DoorHolder.factoryDoorHolder(DOOR_COUNT);

        return 6 * 9;
    }

    /**
     * 通过简单的规则算出经历size次操作之后的门的状态，false是关闭，true是打开
     * @param size
     * @return boolean[]
     */
    public static boolean[] generateResultArray(int size){
        return generateResultArray(size,size);
    }

    /**
     * 通过简单的规则算出经历size次操作之后的门的状态，false是关闭，true是打开
     * @param size
     * @return boolean[]
     */
    public static boolean[] generateResultArray(int size,int turns){
        boolean[] resultDoorStates = new boolean[size];

        for(int i = 1; i <= size; i++){
            int pos = i - 1;
            resultDoorStates[pos] = false;
            for(int j = 1; j <= turns; j++){
                if(i%j == 0){
                    resultDoorStates[pos] = !resultDoorStates[pos];
                }
            }
        }
        return resultDoorStates;
    }
}
