package com.Thinkify.CarBooking10April;

import com.Thinkify.CarBooking10April.Models.Driver;
import com.Thinkify.CarBooking10April.Repo.DriverRepository;
import com.Thinkify.CarBooking10April.Request.DriverDetails;
import com.Thinkify.CarBooking10April.Service.DriverServiceImpl;
import com.Thinkify.CarBooking10April.enums.Gender;
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
public class DriverServiceTest {

    @InjectMocks
    private DriverServiceImpl driverService;

    @Mock
    private DriverRepository driverRepository;



    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);    // MockitoAnnotations.initMocks(this) is used to initialize the mocks.
    }

    @Test
    public void addDriver() {
        DriverDetails driverDetails=new DriverDetails("anirudh", Gender.M,29,"Swift","KA-01-12345",new Driver.Location(10, 1));
        Driver driver=new Driver(driverDetails.getName(),driverDetails.getGender().getGenderName(),driverDetails.getAge(),driverDetails.getCarModel(),driverDetails.getCarNumber(),driverDetails.getLocation());
        when(driverRepository.save(driver)).thenReturn(driver);
        String message = driverService.addDriver(driverDetails);

        Assertions.assertEquals("Driver Added SuccessFully", message);
    }

}
