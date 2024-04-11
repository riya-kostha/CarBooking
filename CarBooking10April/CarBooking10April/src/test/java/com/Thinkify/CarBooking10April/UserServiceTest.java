package com.Thinkify.CarBooking10April;



import com.Thinkify.CarBooking10April.Models.User;
import com.Thinkify.CarBooking10April.Repo.UserRepository;
import com.Thinkify.CarBooking10April.Request.UserDetails;
import com.Thinkify.CarBooking10April.Service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ActiveProfiles;


import static org.mockito.Mockito.when;

@DataJpaTest
@ActiveProfiles("test")
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testCreateUser() {
        UserDetails userDetails=new UserDetails("john", 78592222,"M");
        User user=new User(userDetails.getName(), userDetails.getNumber(),userDetails.getGender());
        when(userRepository.save(user)).thenReturn(user);
      String message= userService.adduser(userDetails);
        Assertions.assertEquals("User Added SuccessFully",message);
    }


}


