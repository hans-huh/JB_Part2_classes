package com.javabasics.fooddelivery.people;

import com.javabasics.fooddelivery.Order;

import java.util.ArrayList;

public class Client {
    private String clientName;
    private String phoneNumber;
    private String email;
    private String defaultAddress;

    private ArrayList<Order> historyOfOrders;
    private ArrayList<Order> activeOrders;
}
