-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('121435904', 'Lambros', 'Gesoulis', 'Zakinthou 13','690000000', 'lg@test.gr', 'lg726925', 'MAISONETTE', 0);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('398135972', 'George', 'Dougkas', 'Dramas 4', 'gd@test.gr','690000000', 'gd726925', 'MAISONETTE', 0);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('461789591', 'Katerina', ' Kanellopoulou', 'Akratas 25','690000000', 'kk@test.gr', 'kk726925', 'FIRSTFLOOR', 1);
INSERT INTO OWNER (ssn, firstname, lastname, address, phone_number, email, password, property_type, isAdmin) VALUES ('731435934', 'Vasileios', 'Nikoulis', 'Evoias 11','690000000', 'vn@test.gr', 'vn726925', 'MAISONETTE', 0);

INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'PENDING', 'PAINTING', 35.5, 'Zakinthou 13', 'This is an Electrical repair', 1);
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'ONGOING', 'PAINTING', 50, 'Dramas 4', 'This is an Electrical repair', 2);
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'PENDING', 'ISOLATION', 68.2, 'Zakinthou 13', 'This is an Electrical repair', 3);
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'FINISHED','ISOLATION', 75.4, 'Evoias 11', 'This is an Electrical repair', 4);
INSERT INTO REPAIR (repair_date, status, job_type, price, address, description, owner_id) VALUES ('2020-01-01', 'FINISHED','PAINTING', 75.4, 'Evoias 11', 'This is an Electrical repair', 4);
