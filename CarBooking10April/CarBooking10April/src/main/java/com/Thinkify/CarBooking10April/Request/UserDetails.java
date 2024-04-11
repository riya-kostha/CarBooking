package com.Thinkify.CarBooking10April.Request;

import lombok.Data;

@Data
public class UserDetails {
    private String name;
    private Integer number;
    private String gender;

    public UserDetails(String name, Integer number, String gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
    }

}
