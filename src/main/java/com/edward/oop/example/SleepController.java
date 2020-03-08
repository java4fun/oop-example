package com.edward.oop.example;

public class SleepController   implements ISleep
{
    private boolean __isSleeping;
    public boolean getisSleeping() {
        return __isSleeping;
    }

    public void setisSleeping(boolean value) {
        __isSleeping = value;
    }

    public void toggleSleep() throws Exception {
        setisSleeping(!getisSleeping());
    }

}


