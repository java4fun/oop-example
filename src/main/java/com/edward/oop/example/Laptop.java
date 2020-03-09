package com.edward.oop.example;

public class Laptop  extends Computer implements ISleep
{
    private ISleep sleepController;
    private Display display;
    public Display getdisplay() {
        return display;
    }

    public void setdisplay(Display value) {
        display = value;
    }

    public boolean isSleeping() throws Exception {
        return sleepController.isSleeping();
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


