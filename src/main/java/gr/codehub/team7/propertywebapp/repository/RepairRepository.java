package gr.codehub.team7.propertywebapp.repository;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> findByRepairDate(LocalDate date);

    List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2); //check here LocalDate

    List<Repair> findByOwner(Owner owner);


}
