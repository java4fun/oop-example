package com.edward.oop.example;

public class Desktop  extends Computer implements ISleep
{
    private ISleep sleepController;
    public enum CaseType
    {
        Tower,
        MiniTower
    }
    public boolean isSleeping() {
        return sleepController.isSleeping();
    }

    private CaseType caseType = CaseType.Tower;
    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType value) {
        caseType = value;
    }

    public String getName() {
        return super.getName() + " " + getCaseType();
    }

    public Desktop(String name, CaseType caseType) {
        super(name);
        this.setCaseType(caseType);
        sleepController = new SleepController();
    }

    public void toggleSleep() {
        if (!isOn())
        {
            return ;
        }
         
        sleepController.toggleSleep();
    }

    public void togglePower() {
        if (isSleeping())
        {
            return ;
        }
         
        super.togglePower();
    }

}


