package com.liuwill.kata.hundredDoor;

/**
 * Created by liuwill on 2017/2/26.
 */
public class Door {
    private boolean isOpen;
    private int index;

    public Door(int index) {
        this.index = index;
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void switchDoor() {
        isOpen = !isOpen;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
