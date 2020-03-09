package com.edward.oop.example;


abstract public class Computer   implements IPowerOn
{
    protected IPowerOn powerController;
    protected String name = "Unknown";
    public boolean isOn() throws Exception {
        return powerController.isOn();
    }

    public String getname() throws Exception {
        return name;
    }

    public void setname(String value) throws Exception {
        name = value;
    }

    public Computer(String name) throws Exception {
        this.setname(name);
        powerController = new PowerController();
    }

    public void togglePower() throws Exception {
        powerController.togglePower();
    }

}


