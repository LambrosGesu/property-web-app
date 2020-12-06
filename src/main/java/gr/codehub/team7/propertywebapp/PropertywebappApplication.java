package gr.codehub.team7.propertywebapp;

import gr.codehub.team7.propertywebapp.domain.Owner;
import gr.codehub.team7.propertywebapp.service.OwnerService;
import gr.codehub.team7.propertywebapp.service.RepairService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.Optional;

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
//        LOGGER.info("=============================");
//        LOGGER.info("====Finding Author by Id====");
//        Optional<Owner> foundOwner = ownerService.findOwner((long) 1);
//        foundOwner.ifPresent(owner -> LOGGER.info(owner.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting All Owners====");
//        ownerService.getAllOwners().forEach(owner -> LOGGER.info(owner.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting Owner with Email====");
//        ownerService.findOwnerByEmail("test@test.com").ifPresent(owner -> LOGGER.info(owner.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting Owner with Afm====");
//        ownerService.findOwnerByAfm("123456789").ifPresent(owner -> LOGGER.info(owner.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting Repairs with id=1 ====");
//        repairService.findBook((long) 1).ifPresent(repair -> LOGGER.info(repair.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting All Repairs====");
//        repairService.findAll().forEach(repair -> LOGGER.info(repair.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
//
//        LOGGER.info("=============================");
//        LOGGER.info("====Getting Repairs by Date====");
//        repairService.findByRepairDate(Date.valueOf("2020-12-03")).forEach(repair -> LOGGER.info(repair.toString()));
//        LOGGER.info("=============================");
//        LOGGER.info("=============================");
    }
}
