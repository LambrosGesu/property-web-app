-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('121435904', 'Lambros', 'Gesoulis', 'Zakinthou 13', '6954123554', 'lg@test.gr', 'lg726925', 'MAISONETTE', 1);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('398135972', 'George', 'Dougkas', 'Dramas 4', '6954123554', 'gd@test.gr', 'gd726925', 'MAISONETTE', 0);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('461789591', 'Katerina', ' Kanellopoulou', 'Akratas 25', '6954123554', 'kk@test.gr', 'kk726925', 'MAISONETTE', 0);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('731435934', 'Vasileios', 'Nikoulis', 'Evoias 11', '6954123554', 'vn@test.gr', 'vn726925', 'MAISONETTE', 1);

INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-04', 'PENDING', 'PAINTING', 35.5, 'Zakinthou 13', 'This is an Electrical repair', '1');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-02', 'ONGOING', 'PAINTING', 50, 'Dramas 4', 'This is an Electrical repair', '2');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'PENDING', 'PAINTING', 68.2, 'Zakinthou 13', 'This is an Electrical repair', '3');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-03-04', 'FINISHED', 'PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', '4');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-04', 'PENDING', 'PAINTING', 35.5, 'Zakinthou 13', 'This is an Electrical repair', '1');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-02', 'ONGOING', 'PAINTING', 50, 'Dramas 4', 'This is an Electrical repair', '2');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'PENDING', 'PAINTING', 68.2, 'Zakinthou 13', 'This is an Electrical repair', '3');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-03-04', 'FINISHED', 'PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', '4');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-04', 'PENDING', 'PAINTING', 35.5, 'Zakinthou 13', 'This is an Electrical repair', '1');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-02', 'ONGOING', 'PAINTING', 50, 'Dramas 4', 'This is an Electrical repair', '2');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-11', 'PENDING', 'PAINTING', 68.2, 'Zakinthou 13', 'This is an Electrical repair', '3');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-03-04', 'FINISHED', 'PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', '4');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-03-04', 'FINISHED', 'PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', '4');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-04', 'PENDING', 'PAINTING', 35.5, 'Zakinthou 13', 'This is an Electrical repair', '1');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-02', 'ONGOING', 'PAINTING', 50, 'Dramas 4', 'This is an Electrical repair', '2');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-02-11', 'PENDING', 'PAINTING', 68.2, 'Zakinthou 13', 'This is an Electrical repair', '3');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-03-04', 'FINISHED', 'PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', '4');
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2019-02-11', 'PENDING', 'PAINTING', 68.2, 'Zakinthou 13', 'This is an Electrical repair', '3');



-- INSERT INTO PROPERTY (id, address, yearof, propertyType, owner_tid) VALUES ('2514236978', 'Zakinthou 13', '2020', 'Maisonette', '121435904');
-- INSERT INTO PROPERTY (id, address, yearof, propertyType, owner_tid) VALUES ('2514236978', 'Dramas 4', '2020', 'Maisonette', '398135972');
-- INSERT INTO PROPERTY (id, address, yearof, propertyType, owner_tid) VALUES ('2514236978', 'Akratas 25', '2020', 'FirstFloor', '461789591');
-- INSERT INTO PROPERTY (id, address, yearof, propertyType, owner_tid) VALUES ('2514236978', 'Evoias 11', '2020', 'Maisonette', '731435934');
