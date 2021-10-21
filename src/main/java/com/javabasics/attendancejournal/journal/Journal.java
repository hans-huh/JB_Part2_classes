package com.javabasics.attendancejournal.journal;

import com.javabasics.attendancejournal.group.Group;
import com.javabasics.attendancejournal.students.GroupLeader;

import java.util.ArrayList;

public class Journal {
    private ArrayList<JournalRecord> pages;
    private GroupLeader owner;
    private Group group;

    public Journal(Group group, GroupLeader owner){
        this.owner = owner;
        this.group = group;
    }


    // getters

    // setters

    // Object class methods overrides

    // custom logic
}
