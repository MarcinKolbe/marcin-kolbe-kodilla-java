package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("shopping list", "milk", 2);
            case PAINTING -> new PaintingTask("painting the kitchen", "yellow", "kitchen");
            case DRIVING -> new DrivingTask("driving Mrs. Daisy", "home", "car");
            default -> null;
        };
    }
}
