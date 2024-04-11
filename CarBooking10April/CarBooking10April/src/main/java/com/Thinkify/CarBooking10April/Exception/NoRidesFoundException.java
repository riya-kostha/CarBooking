package com.Thinkify.CarBooking10April.Exception;

public class NoRidesFoundException extends RuntimeException{
    public NoRidesFoundException(String message) {
        super(message);
    }
}
