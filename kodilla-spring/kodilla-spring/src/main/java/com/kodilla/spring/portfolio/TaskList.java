package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
       this.tasks = new ArrayList<>();
    }

    public void addTask(String newTask){
        tasks.add(newTask);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
