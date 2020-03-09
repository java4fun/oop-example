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

    protected void turnOn() throws Exception {
        setIsOn(true);
    }

    protected void turnOff() throws Exception {
        setIsOn(false);
    }

    public void togglePower() throws Exception {
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


