package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskList implements Observable {
    private String studentName;
    private List<String> taskList;
    private List<Observer> observers;

    public StudentTaskList(String studentName) {
        this.studentName = studentName;
        taskList = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void addNewTask(String task) {
        taskList.add(task);
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
