package com.Thinkify.CarBooking10April.advise;

import com.Thinkify.CarBooking10April.Exception.DriverAlreadyRegisteredException;
import com.Thinkify.CarBooking10April.Exception.NoRidesFoundException;
import com.Thinkify.CarBooking10April.Exception.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class carBookingControllerAdvise {

    @ExceptionHandler(value = UserAlreadyExistException.class)
    public ResponseEntity handleUserAlreadyExistException(UserAlreadyExistException e){
        return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value= DriverAlreadyRegisteredException.class)
    public ResponseEntity handleDriverAlreadyRegisteredException(DriverAlreadyRegisteredException e){
        return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value= NoRidesFoundException.class)
    public ResponseEntity handleDriverAlreadyRegisteredException(NoRidesFoundException e){
        return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
    }
}
