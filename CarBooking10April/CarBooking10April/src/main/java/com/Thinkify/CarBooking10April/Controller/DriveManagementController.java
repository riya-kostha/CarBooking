package com.Thinkify.CarBooking10April.Controller;

import com.Thinkify.CarBooking10April.Request.DriverDetails;
import com.Thinkify.CarBooking10April.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("driver")
public class DriveManagementController {

    @Autowired
    DriverService driverService;

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUser(@RequestBody DriverDetails driverDetails){
        return ResponseEntity.ok(driverService.addDriver(driverDetails));

    }
    @GetMapping(value = "")
    public String fun(){
        return "hello";
    }

}
