package com.edward.oop.example;

public class PowerController   implements IPowerOn
{
    private boolean isOn;
    public boolean isOn() {
        return isOn;
    }

    private void setIsOn(boolean value) {
        isOn = value;
    }

    protected void turnOn() {
        setIsOn(true);
    }

    protected void turnOff() {
        setIsOn(false);
    }

    public void togglePower() {
        if (isOn())
        {
            turnOff();
        }
        else
        {
            turnOn();
        } 
    }

}


