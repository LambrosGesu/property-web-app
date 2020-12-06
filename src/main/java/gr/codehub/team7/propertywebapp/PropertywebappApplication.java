package gr.codehub.team7.propertywebapp;


import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

@SpringBootApplication
public class PropertywebappApplication implements CommandLineRunner {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private RepairService repairService;

    public static void main(String[] args) {
        SpringApplication.run(PropertywebappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("STARTING=============================");

        LOGGER.info("====Getting Repairs by owner SSN=======================");
        repairService.findByOwnerSSN("398135972").forEach(repair -> LOGGER.info(repair.toString()));

        LOGGER.info("====Getting Repairs by date=======================");
        repairService.findByRepairDate(LocalDate.of(2020, 1, 1)).forEach(repair -> LOGGER.info(repair.toString()));

        LOGGER.info("====Getting Repairs by date between 1200 and 1300(year)");
        repairService.findByRepairDateBetween( LocalDate.of(1200, 1, 1), LocalDate.of(1300, 1, 1)).forEach(repair -> LOGGER.info(repair.toString()));

    }
}
