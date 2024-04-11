package com.Thinkify.CarBooking10April.Repo;

import com.Thinkify.CarBooking10April.Models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
    public Driver findByCarNumber(String carNumber);
}
