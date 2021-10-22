package com.javabasics.fooddelivery.order;

import com.javabasics.fooddelivery.food.FoodItem;
import com.javabasics.fooddelivery.people.Client;
import com.javabasics.fooddelivery.people.DeliveryEmployee;

import java.util.Map;

public class Order {
    private String orderID;
    private Client client;
    private String addressToDeliver;
    private Map<FoodItem, Integer> foodItemsToDeliver;
    private double totalPriceToCharge;
    private boolean isOrderActive;
    private DeliveryEmployee deliveryEmployee;
}
