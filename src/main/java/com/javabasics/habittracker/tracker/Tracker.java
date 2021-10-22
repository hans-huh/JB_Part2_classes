package com.javabasics.habittracker.tracker;

import com.javabasics.habittracker.calendar.CalendarDay;

import java.util.ArrayList;
import java.util.UUID;

public class Tracker {
    private String trackerID;
    private String trackerName;
    private Owner owner;
    private ArrayList<Habit> habits;
    private ArrayList<CalendarDay> days;

    public Tracker() {
        trackerID = UUID.randomUUID().toString();
    }
}
