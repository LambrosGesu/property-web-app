package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.enums.JobType;
import gr.codehub.team7.propertywebapp.enums.PropertyType;
import gr.codehub.team7.propertywebapp.enums.Role;
import gr.codehub.team7.propertywebapp.enums.Status;
import gr.codehub.team7.propertywebapp.repository.RepairRepository;
import org.apache.tomcat.jni.Local;
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
class RepairServiceImplTest {

    @Autowired
    private RepairService repairService;

    @MockBean
    private RepairRepository repairRepository;
    @MockBean
    private OwnerService ownerService;

    @Test
    @DisplayName("Test findByRepairDate:")
    void findByRepairDate() {
        Owner owner = new Owner("1234567","kirios","xi","downthereinmexico","6999999999","kiriosx@","xxxx", PropertyType.APPARTMENT, Role.USER,null);
        Repair repair1 = new Repair(LocalDate.of(2020,12,1), Status.PENDING, JobType.ELECTRICAL,600.23,"mexicocity","neededcomenewlights",owner);
        Repair repair2 = new Repair(LocalDate.of(2020,12,1), Status.PENDING, JobType.ELECTRICAL,600.23,"mexicocity","neededcomenewlights",owner);

        doReturn(Arrays.asList(repair1,repair2)).when(repairRepository).findByRepairDate(LocalDate.of(2020,12,1));

        List<Repair> returnedRepairs = repairService.findByRepairDate(LocalDate.of(2020,12,1));

        // Assert the response
        Assertions.assertEquals(2, returnedRepairs.size(), "findbyRepairDate should return 2 repairs");
        Assertions.assertEquals(Arrays.asList(repair1,repair2), returnedRepairs, "Not equal lists");
    }

    @Test
    @DisplayName("Test findByRepairDate with no valid date:")
    void findByRepairDateInvalid() {
        doReturn(Arrays.asList()).when(repairRepository).findByRepairDate(LocalDate.of(2020,12,1));

        List<Repair> returnedRepairs = repairService.findByRepairDate(LocalDate.of(2020,12,1));

        // Assert the response
        Assertions.assertEquals(0, returnedRepairs.size(), "findbyRepairDate should return 0 repair");
        Assertions.assertEquals(Arrays.asList(), returnedRepairs, "Not equal lists");
    }

    @Test
    @DisplayName("Test findByRepairDateBetween:")
    void findByRepairDateBetween() {
        Owner owner = new Owner("1234567","kirios","xi","downthereinmexico","6999999999","kiriosx@","xxxx", PropertyType.APPARTMENT,Role.USER,null);
        Repair repair1 = new Repair(LocalDate.of(2020,12,1), Status.PENDING, JobType.ELECTRICAL,600.23,"mexicocity","neededcomenewlights",owner);
        Repair repair2 = new Repair(LocalDate.of(2014,7,7), Status.PENDING, JobType.ELECTRICAL,600.23,"mexicocity","neededcomenewlights",owner);

        doReturn(Arrays.asList(repair1,repair2)).when(repairRepository).findByRepairDateBetween(LocalDate.of(1996,3,22),LocalDate.of(2020,12,1));

        List<Repair> returnedRepairs = repairService.findByRepairDateBetween(LocalDate.of(1996,3,22),LocalDate.of(2020,12,1));

        // Assert the response
        Assertions.assertEquals(2, returnedRepairs.size(), "findbyRepairDate should return 2 repairs");
        Assertions.assertEquals(Arrays.asList(repair1,repair2), returnedRepairs, "Not equal lists");
    }

    @Test
    @DisplayName("Test findByOwnerSSN:")
    void findByOwnerSSN() {
        Owner owner = new Owner("1234567","kirios","xi","downthereinmexico","6999999999","kiriosx@","xxxx", PropertyType.APPARTMENT,Role.USER,null);
        Repair repair1 = new Repair(LocalDate.of(2020,12,1), Status.PENDING, JobType.ELECTRICAL,600.23,"mexicocity","neededSomenewlights",owner);

        doReturn(Optional.of(owner)).when(ownerService).findOwnerBySsn("1234567");
        doReturn(Arrays.asList(repair1)).when(repairRepository).findByOwner(owner);

        List<Repair> returnedRepairs = repairService.findByOwnerSSN("1234567");

        // Assert the response
        Assertions.assertEquals(1, returnedRepairs.size(), "findbyRepairDate should return 1 repairs");
        Assertions.assertEquals(Arrays.asList(repair1), returnedRepairs, "Not equal lists");

    }


    @Test
    @DisplayName("Test deleteRepairByID:")
    void deleteRepairById() {
    }
}