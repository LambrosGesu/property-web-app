package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.forms.EditRepairForm;
import gr.codehub.team7.propertywebapp.forms.RepairSearchForm;
import gr.codehub.team7.propertywebapp.model.RepairModel;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RepairService {

    List<RepairModel> findAll();

    List<RepairModel> findFirstTenUnfinished();

    List<Repair> findByRepairDate(LocalDate date);

    List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2);

    Optional<Repair> findById(Long id);

    Repair insertRepair(Repair repair);

    Repair updateRepair(EditRepairForm repair, Long id);

    List<Repair> findByOwnerSSN(String SSN);

    List<Repair> findByOwnerId(Long id);

    List<RepairModel> findBySearchForm(RepairSearchForm form);

    void deleteRepairById(Long id);

}
