package com.javabasics.attendancejournal.journal;

import com.javabasics.attendancejournal.group.Group;
import com.javabasics.attendancejournal.students.GroupLeader;

import java.util.ArrayList;

public class Journal {
    private static final int NUMBER_OF_PAGES_IN_JOURNAL = 55;
    private ArrayList<JournalPage> pages;
    private GroupLeader owner;
    private Group group;

    public Journal(Group group, GroupLeader owner){
        this.owner = owner;
        this.group = group;
        initializeJournalPages();
    }

    private void initializeJournalPages(){
        pages = new ArrayList<JournalPage>();
        for(int i = 0; i < NUMBER_OF_PAGES_IN_JOURNAL; i++){
            pages.add(new JournalPage());
        }
    }

    // getters

    // setters

    // Object class methods overrides

    // custom logic
}
