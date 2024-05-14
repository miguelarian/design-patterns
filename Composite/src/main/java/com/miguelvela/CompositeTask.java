package com.miguelvela;

import java.util.List;

public class CompositeTask implements Task {

    private String title;
    private List<Task> tasks;

    public CompositeTask(String title, List<Task> tasks) {
        this.title = title;
        this.tasks = tasks;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    @Override
    public void display() {
        System.out.println("Complex task " + this.title + ":");
        this.tasks.forEach(Task::display);
    }
}
