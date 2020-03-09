package com.edward.oop.example;

public class SleepController   implements ISleep
{
    private boolean isSleeping;
    public boolean isSleeping() {
        return isSleeping;
    }

    private void setIsSleeping(boolean value) {
        isSleeping = value;
    }

    public void toggleSleep() {
        setIsSleeping(!isSleeping());
    }

}


