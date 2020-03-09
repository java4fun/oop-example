package com.edward.oop.example;

public class Laptop  extends Computer implements ISleep
{
    private ISleep sleepController;
    private Display display;
    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display value) {
        display = value;
    }

    public boolean isSleeping() {
        return sleepController.isSleeping();
    }

    public Laptop(String name, int width, int height) {
        super(name);
        setDisplay(new Display(width,height));
        sleepController = new SleepController();
    }

    public void toggleSleep() {
        sleepController.toggleSleep();
    }

}


