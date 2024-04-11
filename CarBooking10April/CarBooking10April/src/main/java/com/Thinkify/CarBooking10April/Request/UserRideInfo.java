package com.Thinkify.CarBooking10April.Request;


import com.Thinkify.CarBooking10April.Models.*;
import lombok.Data;

@Data
public class UserRideInfo {

    private Driver.Location source;
    private Driver.Location destination;

}
