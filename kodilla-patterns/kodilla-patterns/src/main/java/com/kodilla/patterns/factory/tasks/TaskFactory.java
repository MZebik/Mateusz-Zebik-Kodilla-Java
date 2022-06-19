package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Next shopping", "milk", 1.0);
            case PAINTING:
                return new PaintingTask("Kitchen painting", "white", "Kitchen");
            case DRIVING:
                return new DrivingTask("Milk transport", "Warsaw", "Cistern");
            default:
                return null;
        }
    }

}
