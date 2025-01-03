package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void toDoListAddTask(String task) {
        toDoList.addTask(task);
    }

    public void inProgressListAddTask(String task) {
        inProgressList.addTask(task);
    }

    public void doneListAddTask(String task) {
        doneList.addTask(task);
    }

    public void displayBoard() {
        System.out.println("To Do List:");
        toDoList.displayTasks();
        System.out.println("In Progress List:");
        inProgressList.displayTasks();
        System.out.println("Done List:");
        doneList.displayTasks();
    }
}
