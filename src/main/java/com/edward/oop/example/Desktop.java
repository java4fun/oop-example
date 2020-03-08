package com.edward.oop.example;

public class Desktop  extends Computer implements ISleep
{
    private ISleep sleepController;
    public enum CaseType
    {
        Tower,
        MiniTower
    }
    public boolean getisSleeping() throws Exception {
        return sleepController.getisSleeping();
    }

    private CaseType __caseType = CaseType.Tower;
    public CaseType getcaseType() {
        return __caseType;
    }

    public void setcaseType(CaseType value) {
        __caseType = value;
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
        if (!getisOn())
        {
            return ;
        }
         
        sleepController.toggleSleep();
    }

    public void togglePower() throws Exception {
        if (getisSleeping())
        {
            return ;
        }
         
        super.togglePower();
    }

}


