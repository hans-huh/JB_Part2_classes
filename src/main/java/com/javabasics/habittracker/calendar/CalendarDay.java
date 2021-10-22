package com.javabasics.habittracker.calendar;

import com.javabasics.habittracker.tracker.Habit;
import com.javabasics.habittracker.tracker.Tracker;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Map;

public class CalendarDay {
    private DayOfWeek dayOfWeek;
    private Months month;
    private int dayOfMonth;
    private ArrayList<Habit> habits;
    private Map<Habit, Boolean> completedAndSkippedHabits;

    public CalendarDay() {}
}
