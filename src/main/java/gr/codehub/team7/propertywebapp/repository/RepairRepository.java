package gr.codehub.team7.propertywebapp.repository;

import gr.codehub.team7.propertywebapp.domain.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RepairRepository extends JpaRepository<Repair, Long> {

    List<Repair> findByRepairDate(LocalDate date);

    //void deleteRepairById(Long id);

//    @Query(value = "SELECT r from Repair r where r.repairDate between ?1 and ?2")
    List<Repair> findByRepairDateBetween(LocalDate date1, LocalDate date2); //check here LocalDate

//    @Query(value = "SELECT * from Repairs WHERE",nativeQuery = true)
//    List<Repairs> findRepairsByAfm();
}
