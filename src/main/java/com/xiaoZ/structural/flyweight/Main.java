package com.xiaoZ.structural.flyweight;

public class Main {
    private static final String[] departments = {"RB","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random()*departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.setReportContent(department + "部门汇报...");
            manager.report();
        }
    }
}
