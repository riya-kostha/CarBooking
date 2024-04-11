package com.Thinkify.CarBooking10April.Models;

import com.Thinkify.CarBooking10April.Models.*;
import com.Thinkify.CarBooking10April.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class Driver {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private Integer age;

    @Column(name="carModel")
    private String carModel;

    @Column(name="carNumber")
    private String carNumber;

    @Column
    @Embedded
    private Location location;

    public Driver() {

    }
    public Driver(String name, String gender, Integer age, String carModel, String carNumber, Location location) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.location=location;
    }



    @Embeddable
    public static class Location {


        private double latitude;
        private double longitude;


        public Location(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
        public Location(){

        }
        // Getters and setters
        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }



}
