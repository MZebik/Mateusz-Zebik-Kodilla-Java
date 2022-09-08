package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTaskList studentTaskList) {
        System.out.println("Student " + studentTaskList.getStudentName() + " added a new task to list" + "\n" +
                " (total: " + studentTaskList.getTaskList().size() + " tasks)");
        ++updateCount;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
