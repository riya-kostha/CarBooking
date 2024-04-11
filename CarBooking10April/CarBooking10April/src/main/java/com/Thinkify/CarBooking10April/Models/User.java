package com.Thinkify.CarBooking10April.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="_user")
@Data
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;


    @Column(name="number")
    private Integer number;

    @Column(name="gender")
    private String gender;

    public User(String name, Integer number, String gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
    }

}
