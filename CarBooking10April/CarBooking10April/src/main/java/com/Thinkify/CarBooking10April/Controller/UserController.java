package com.Thinkify.CarBooking10April.Controller;


import com.Thinkify.CarBooking10April.Request.RideDetails;
import com.Thinkify.CarBooking10April.Request.UserDetails;
import com.Thinkify.CarBooking10April.Request.UserRideInfo;
import com.Thinkify.CarBooking10April.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody UserDetails user){
       return ResponseEntity.ok(userService.adduser(user));

    }

    @GetMapping(value = "/findRide")
    public ResponseEntity<List<RideDetails>> findRide(@RequestBody UserRideInfo rideInfo) {

        return ResponseEntity.ok(userService.findRides(rideInfo.getSource()));
    }
}
