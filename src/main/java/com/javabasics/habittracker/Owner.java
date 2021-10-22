package com.javabasics.habittracker;

import java.util.UUID;

public class Owner {
    private String ownerID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Owner(){
        ownerID = UUID.randomUUID().toString();
    }
}
