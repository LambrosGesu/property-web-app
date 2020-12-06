package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Repair;
import java.time.LocalDate;
import java.util.List;

public interface RepairService {

    List<Repair> findAll();

    List<Repair> findByRepairDate(LocalDate date);

    List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2);

    List<Repair> findByOwnerSSN(String SSN);

    void deleteRepairById(Long id);

}
