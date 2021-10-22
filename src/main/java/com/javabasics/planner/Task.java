package com.javabasics.planner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String taskDescription;
    private String notification;
    private String dateFormat = "dd-MM-yyyy HH:mm";
    private String dueDateProvidedByUser;
    private Date dueDate;

    private SimpleDateFormat taskDueDate;
    public Task() {}

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat();
    }
}
