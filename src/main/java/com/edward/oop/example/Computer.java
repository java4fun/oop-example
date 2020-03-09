package com.edward.oop.example;


abstract public class Computer   implements IPowerOn
{
    protected IPowerOn powerController;
    protected String name = "Unknown";
    public boolean isOn() {
        return powerController.isOn();
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public Computer(String name) {
        this.setName(name);
        powerController = new PowerController();
    }

    public void togglePower() {
        powerController.togglePower();
    }

}


