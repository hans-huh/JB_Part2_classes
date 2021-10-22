package com.javabasics.hotel;

import com.javabasics.hotel.rooms.Room;

import java.util.Map;

public class Hotel {
    private String hotelName;
    private String address;
    private String numberOfStars;
    private final static int NUMBER_OF_ROOMS = 20;
    private Map<Integer, Room> rooms;
}
