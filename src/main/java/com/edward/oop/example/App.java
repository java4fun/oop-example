package com.edward.oop.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        App.Main(args);
    }

    static void Main(String[] args) throws Exception {
        //var comp = new Desktop("Generic Computer", Desktop.CaseType.Tower);
        Laptop comp = new Laptop("Generic Laptop",1024,768);
        System.out.println("Computer Type - " + comp.getClass());
        Boolean isComputer = comp instanceof Computer;
        System.out.println("Is computer - " + isComputer);
        System.out.println("Computer name - " + comp.getname());
        //Console.WriteLine("Computer case - " + comp.caseType);
        comp.togglePower();
        System.out.println("Computer is on - " + comp.getisOn());
        ISleep sleepingComp = comp instanceof ISleep ? (ISleep)comp : (ISleep)null;
        if (sleepingComp != null)
        {
            sleepingComp.toggleSleep();
            System.out.println("Computer is sleeping - " + sleepingComp.getisSleeping());
            comp.togglePower();
            System.out.println("Computer is on - " + comp.getisOn());
        }
         
    }
}
