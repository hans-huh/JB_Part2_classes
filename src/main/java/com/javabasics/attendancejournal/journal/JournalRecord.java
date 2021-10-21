package com.javabasics.attendancejournal.journal;

import com.javabasics.attendancejournal.group.Group;
import com.javabasics.attendancejournal.students.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JournalRecord {
    private String journalRecordID;
    private Date date;
    private String subjectName;
    private Map<String, Boolean> studentAttendance;

    public JournalRecord(Group group) {
        List<Student> studentList = group.getStudents();
        for(Student student : studentList){
            studentAttendance.put(student.getStudentID(), true);
        }
    }

    // getters

    // setters

    // Object class methods overrides

    // custom logic (e.g. markAbsent() method)
}
