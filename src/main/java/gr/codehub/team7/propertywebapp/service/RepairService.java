package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Repair;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RepairService {

    List<Repair> findAll();

    List<Repair> findByRepairDate(LocalDate date);

    List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2);

    Repair insertRepair(Repair repair);

    Repair updateRepair(Repair repair, Long id);

    List<Repair> findByOwnerSSN(String SSN);

    void deleteRepairById(Long id);

}
