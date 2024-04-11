package com.Thinkify.CarBooking10April.Exception;

public class DriverAlreadyRegisteredException extends RuntimeException{
    public DriverAlreadyRegisteredException(String message){
        super(message);
    }
}
