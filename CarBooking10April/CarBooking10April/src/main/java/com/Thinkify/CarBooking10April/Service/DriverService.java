package com.Thinkify.CarBooking10April.Service;


import com.Thinkify.CarBooking10April.Models.*;

import com.Thinkify.CarBooking10April.Request.DriverDetails;
import com.Thinkify.CarBooking10April.Request.RideDetails;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DriverService {
    String addDriver(DriverDetails driverDetails);
    List<RideDetails> getDrivers(Driver.Location location);
}
