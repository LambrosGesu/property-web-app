package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.enums.Role;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.model.OwnerModel;
import gr.codehub.team7.propertywebapp.repository.OwnerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ActiveProfiles("test")
@SpringBootTest
class OwnerServiceImplTest {

    @Autowired
    private OwnerService ownerService;

    @MockBean
    private OwnerRepository ownerRepository;

    @Test
    @DisplayName("Test findOwnerByEmail:")
    void findOwnerByEmail() {
        Owner owner = new Owner("1234567","kirios","xi","downthereinmexico","6999999999","kiriosx@","xxxx", PropertyType.APPARTMENT, Role.USER,null);

        doReturn(Optional.of(owner)).when(ownerRepository).findOwnerByEmail("kiriosx@");
        Optional<OwnerModel> returnedOwners = ownerService.findOwnerByEmail("kiriosx@");


        // Assert the response
        Assertions.assertEquals(Optional.of(owner), returnedOwners, "Not equal lists");
    }

    @Test
    @DisplayName("Test findOwnerBySSN")
    void findOwnerBySsn() {
        Owner owner = new Owner("1234567","kirios","xi","downthereinmexico","6999999999","kiriosx@","xxxx", PropertyType.APPARTMENT,Role.USER,null);

        doReturn(Optional.of(owner)).when(ownerRepository).findOwnerBySsn("1234567");
        Optional<OwnerModel> returnedOwners = ownerService.findOwnerBySsn("1234567");

        // Assert the response
        Assertions.assertEquals(Optional.of(owner), returnedOwners, "Not equal lists");
    }

    @Test
    @DisplayName("Test deleteOwnerByID :")
    void deleteOwnerById() {

    }
}