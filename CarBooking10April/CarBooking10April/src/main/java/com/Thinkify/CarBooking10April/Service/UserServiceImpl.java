package com.Thinkify.CarBooking10April.Service;



import com.Thinkify.CarBooking10April.Exception.UserAlreadyExistException;
import com.Thinkify.CarBooking10April.Models.User;
import com.Thinkify.CarBooking10April.Repo.UserRepository;
import com.Thinkify.CarBooking10April.Request.RideDetails;
import com.Thinkify.CarBooking10April.Request.UserDetails;
import com.Thinkify.CarBooking10April.Models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    DriverService driverService;

    @Override
    @Transactional
    public String  adduser(UserDetails userDetails) {
        try {
            User user = new User(userDetails.getName(), userDetails.getNumber(), userDetails.getGender());
            if (userRepository.findByNumber(userDetails.getNumber()) != null)
                throw new UserAlreadyExistException("User Already registered with this number");
            if (userRepository.save(user) != null)
                return "User Added SuccessFully";
        } catch (Exception e) {
            throw new RuntimeException("can not add ueser due to {}" + e.getMessage());
        }
        return "";

    }


    @Override
    public List<RideDetails> findRides(Driver.Location location) {
      return driverService.getDrivers(location);
    }
}
