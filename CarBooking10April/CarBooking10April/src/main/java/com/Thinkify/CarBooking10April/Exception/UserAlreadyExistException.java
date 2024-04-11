package com.Thinkify.CarBooking10April.Exception;

public class UserAlreadyExistException extends RuntimeException{
        public UserAlreadyExistException(String message){
            super(message);
        }
}
