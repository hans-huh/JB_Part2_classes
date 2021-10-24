package com.javabasics.shop;

import java.util.ArrayList;

public class Order {
    private String orderID;
    private Account account;
    private ArrayList<Item> itemsInOrder;
    private Double totalPriceToCharge;
    private String deliveryLocation;
    private String orderStatus;
}
