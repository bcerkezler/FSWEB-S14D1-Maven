package com.workintech.developers;

public class HRManager extends Employee{
    JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    MidDeveloper[] midDevelopers = new MidDeveloper[5];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public int jrIndex = 0;
    public int midIndex = 0;
    public int srIndex = 0;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts working.");
        setSalary(130000);
    }

    public void addEmployee(JuniorDeveloper jrDev) {
        if (jrIndex == juniorDevelopers.length-1) {
            System.out.println("Not enough open positions!");
        }
        else {
            juniorDevelopers[jrIndex] = jrDev;
            jrIndex++;
        }
    }

    public void addEmployee(MidDeveloper midDev) {
        if (midIndex == midDevelopers.length-1) {
            System.out.println("Not enough open positions!");
        }
        else {
            midDevelopers[midIndex] = midDev;
            midIndex++;
        }
    }

    public void addEmployee(SeniorDeveloper srDev) {
        if (srIndex == seniorDevelopers.length-1) {
            System.out.println("Not enough open positions!");
        }
        else {
            seniorDevelopers[srIndex] = srDev;
            srIndex++;
        }
    }
}
