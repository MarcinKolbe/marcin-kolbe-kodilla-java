package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements  Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isDone = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task: " + taskName + " is executed");
        isDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
