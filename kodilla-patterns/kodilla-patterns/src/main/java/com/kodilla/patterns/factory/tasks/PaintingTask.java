package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String taskName;
    private final String colour;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String colour, final String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    private boolean executed = false;

    @Override
    public void executeTask() {
        System.out.println("Task " + taskName + " executed");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
