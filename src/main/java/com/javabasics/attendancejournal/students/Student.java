package com.javabasics.attendancejournal.students;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private String email;
    private String phone;

    public Student(){
        studentID = generateID();
    }

    private String generateID(){
        /* some logic to generate a unique id
        e.g.
        return UUID.randomUUID().toString();
         */
        return new String();
    }

    // getters
    public String getStudentID(){
        return studentID;
    }

    // setters

    // Object class methods overrides

    // custom logic

}
