package com.javabasics.shop;

import java.util.ArrayList;

public class Account {
    private String accountID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private double loyaltyDiscount;

    private ArrayList<Order> orderHistory;
    private ArrayList<Order> activeOrders;
}
