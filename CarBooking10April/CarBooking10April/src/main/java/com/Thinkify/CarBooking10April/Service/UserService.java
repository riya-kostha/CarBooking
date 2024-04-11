package com.Thinkify.CarBooking10April.Service;

import com.Thinkify.CarBooking10April.Request.RideDetails;
import com.Thinkify.CarBooking10April.Request.UserDetails;
import com.Thinkify.CarBooking10April.Models.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    String adduser(UserDetails userDetails);
    List<RideDetails> findRides(Driver.Location location);
}
