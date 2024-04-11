package com.Thinkify.CarBooking10April.Service;


import com.Thinkify.CarBooking10April.Exception.DriverAlreadyRegisteredException;
import com.Thinkify.CarBooking10April.Exception.NoRidesFoundException;
import com.Thinkify.CarBooking10April.Models.*;
import com.Thinkify.CarBooking10April.Repo.DriverRepository;
import com.Thinkify.CarBooking10April.Request.DriverDetails;
import com.Thinkify.CarBooking10April.Request.RideDetails;
import com.Thinkify.CarBooking10April.Util.LocationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository;

    @Override
    @Transactional
    public String addDriver(DriverDetails driverDetails) {
        Driver driver=new Driver(driverDetails.getName(),driverDetails.getGender().getGenderName(), driverDetails.getAge(), driverDetails.getCarModel(), driverDetails.getCarNumber(), driverDetails.getLocation());
       if(driverRepository.findByCarNumber(driver.getCarNumber())!=null)
            throw new DriverAlreadyRegisteredException("driver already registered with this carNumber :" +driver.getCarNumber());
        if(driverRepository.save(driver)!=null)
           return "Driver Added SuccessFully";
       else
           throw new RuntimeException("can not add driver");

    }
    @Override
    public List<RideDetails> getDrivers(Driver.Location location) {
        List<RideDetails> rideDetails = new ArrayList<>();
        List<Driver> driverList=driverRepository.findAll();
        for(Driver d:driverList){
            double distance= LocationUtil.calculateDistance(location,d.getLocation());
            if(distance<5d)
            rideDetails.add(new RideDetails(d.getName(), d.getCarModel(), d.getCarNumber(), Math.toIntExact(Math.round(distance)*75)));
        }
        if(rideDetails.isEmpty())
            throw new NoRidesFoundException("Sorry No Rides are available for this location please try in some time");
        return rideDetails;
    }
}
