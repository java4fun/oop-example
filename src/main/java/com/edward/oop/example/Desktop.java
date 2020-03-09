package com.edward.oop.example;

public class Desktop  extends Computer implements ISleep
{
    private ISleep sleepController;
    public enum CaseType
    {
        Tower,
        MiniTower
    }
    public boolean isSleeping() throws Exception {
        return sleepController.isSleeping();
    }

    private CaseType caseType = CaseType.Tower;
    public CaseType getcaseType() {
        return caseType;
    }

    public void setcaseType(CaseType value) {
        caseType = value;
    }

    public String getname() throws Exception {
        return super.getname() + " " + getcaseType();
    }

    public Desktop(String name, CaseType caseType) throws Exception {
        super(name);
        this.setcaseType(caseType);
        sleepController = new SleepController();
    }

    public void toggleSleep() throws Exception {
        if (!isOn())
        {
            return ;
        }
         
        sleepController.toggleSleep();
    }

    public void togglePower() throws Exception {
        if (isSleeping())
        {
            return ;
        }
         
        super.togglePower();
    }

}


