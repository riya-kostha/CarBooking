package com.Thinkify.CarBooking10April.Request;



import com.Thinkify.CarBooking10April.Models.*;

import com.Thinkify.CarBooking10April.enums.Gender;
import lombok.Data;

@Data
public class DriverDetails {

    private String name;
    private Gender gender;
    private Integer age;
    private String carModel;
    private String carNumber;
    private Driver.Location location;

    public DriverDetails(String name, Gender gender, Integer age, String carModel, String carNumber, Driver.Location location) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.location = location;
    }


}
