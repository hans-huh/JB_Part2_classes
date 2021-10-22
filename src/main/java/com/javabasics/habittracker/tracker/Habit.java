package com.javabasics.habittracker.tracker;

import java.util.UUID;

public class Habit {
    private String habitID;
    private String habitName;
    private String habitDescription;

    public Habit(){
        habitID = UUID.randomUUID().toString();
    }
}
