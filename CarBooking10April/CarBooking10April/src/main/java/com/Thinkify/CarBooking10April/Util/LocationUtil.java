package com.Thinkify.CarBooking10April.Util;


import com.Thinkify.CarBooking10April.Models.*;

public class LocationUtil {

    private static final double EARTH_RADIUS = 6371;

    // Calculate distance between two locations using Haversine formula
    public static double calculateDistance(Driver.Location l1, Driver.Location l2) {
        // Convert latitude and longitude from degrees to radians
        double lat1Rad = l1.getLatitude();
        double lon1Rad = l1.getLongitude();
        double lat2Rad = l2.getLatitude();
        double lon2Rad = l2.getLongitude();


        return Math.sqrt(Math.pow(lat1Rad - lat2Rad, 2) + Math.pow(lon1Rad - lon2Rad, 2));

    }
}
