package com.edward.oop.example;


abstract public class Computer   implements IPowerOn
{
    protected IPowerOn powerController;
    protected String _name = "Unknown";
    public boolean getisOn() throws Exception {
        return powerController.getisOn();
    }

    public String getname() throws Exception {
        return _name;
    }

    public void setname(String value) throws Exception {
        _name = value;
    }

    public Computer(String name) throws Exception {
        this.setname(name);
        powerController = new PowerController();
    }

    public void togglePower() throws Exception {
        powerController.togglePower();
    }

}


