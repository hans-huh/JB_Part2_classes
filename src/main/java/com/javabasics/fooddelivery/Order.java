package com.javabasics.fooddelivery;

import com.javabasics.fooddelivery.food.FoodItem;
import com.javabasics.fooddelivery.people.Client;

import java.util.Map;

public class Order {
    private Client client;
    private Map<FoodItem, Integer> foodItemsToDeliver;
    private double totalPriceToCharge;
    private boolean isOrderActive;
    private DeliveryEmployee deliveryEmployee;
}
