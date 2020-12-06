package gr.codehub.team7.propertywebapp.service;

import gr.codehub.team7.propertywebapp.domain.Repair;
import gr.codehub.team7.propertywebapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RepairServiceImpl implements RepairService{

    @Autowired
    private RepairRepository repairRepository;

    @Override
    public List<Repair> findAll() {
        return repairRepository.findAll();
    }

    @Override
    public List<Repair> findByRepairDate(LocalDate date) {
        return repairRepository.findByRepairDate(date);
    }

    @Override
    public List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2) {
        return repairRepository.findByRepairDateBetween(date1, date2);
    }


    @Override
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }


}
