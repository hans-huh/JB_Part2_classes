package com.javabasics.habittracker;

import java.util.UUID;

public class Habit {
    private String habitID;
    private String habitName;
    private String habitDescription;

    public Habit(){
        habitID = UUID.randomUUID().toString();
    }
}
