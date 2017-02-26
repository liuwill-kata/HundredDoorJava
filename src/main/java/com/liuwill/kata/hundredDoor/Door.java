package com.liuwill.kata.hundredDoor;

/**
 * Created by videopls on 2017/2/26.
 */
public class Door {
    public boolean isOpen;
    public int index;

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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
