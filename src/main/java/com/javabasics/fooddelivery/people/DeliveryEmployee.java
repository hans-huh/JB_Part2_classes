package com.javabasics.fooddelivery.people;

import com.javabasics.fooddelivery.order.Order;

import java.util.ArrayList;

public class DeliveryEmployee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String employeeStatus;
    private boolean isCarAvailable;

    private ArrayList<Order> historyOfOrders;
    private ArrayList<Order> activeOrders;
}
