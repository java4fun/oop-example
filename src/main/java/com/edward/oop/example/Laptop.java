package com.edward.oop.example;

public class Laptop  extends Computer implements ISleep
{
    private ISleep sleepController;
    private Display __display;
    public Display getdisplay() {
        return __display;
    }

    public void setdisplay(Display value) {
        __display = value;
    }

    public boolean getisSleeping() throws Exception {
        return sleepController.getisSleeping();
    }

    public Laptop(String name, int width, int height) throws Exception {
        super(name);
        setdisplay(new Display(width,height));
        sleepController = new SleepController();
    }

    public void toggleSleep() throws Exception {
        sleepController.toggleSleep();
    }

}


