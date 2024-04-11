package com.Thinkify.CarBooking10April.enums;

import java.util.Collections;
import java.util.HashMap;

public enum Gender {
    M("Male"),
    F("Female"),
    O("others");

    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

   public String getGenderName(){
        return gender;
   }

}
