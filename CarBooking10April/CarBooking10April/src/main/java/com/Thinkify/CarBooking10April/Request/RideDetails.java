package com.Thinkify.CarBooking10April.Request;

import lombok.Data;

@Data
public class RideDetails {

    private String driverName;
    private String CarModel;
    private String CarNumber;
    private Integer fare;


    public RideDetails(String driverName, String carModel, String carNumber, Integer fare) {
        this.driverName = driverName;
        CarModel = carModel;
        CarNumber = carNumber;
        this.fare = fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }
}
