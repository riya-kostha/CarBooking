package com.Thinkify.CarBooking10April.Repo;

import com.Thinkify.CarBooking10April.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByNumber(Integer number);

}
