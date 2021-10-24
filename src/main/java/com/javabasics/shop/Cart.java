package com.javabasics.shop;

import java.util.Map;

public class Cart {
    private Account account;
    private Order order;
    private Map<Item, Integer> itemsInCart;
    private Double totalPriceToCharge;
    private Double totalDiscount;
}
