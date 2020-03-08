package com.edward.oop.example;

public class PowerController   implements IPowerOn
{
    private boolean __isOn;
    public boolean getisOn() {
        return __isOn;
    }

    public void setisOn(boolean value) {
        __isOn = value;
    }

    protected void turnOn() throws Exception {
        setisOn(true);
    }

    protected void turnOff() throws Exception {
        setisOn(false);
    }

    public void togglePower() throws Exception {
        if (getisOn())
        {
            turnOff();
        }
        else
        {
            turnOn();
        } 
    }

}


