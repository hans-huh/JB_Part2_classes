package com.javabasics.planner;

import java.util.UUID;

public class User {
    private String userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public User(){
        userID = UUID.randomUUID().toString();
    }

    // getters

    // setters

    // Object methods overrides

    // custom logic (e.g. notifyUser() etc)


}
