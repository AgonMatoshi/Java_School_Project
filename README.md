# Java_School_Project
Repository for java project Agon Matoshi Jon Kurtishi
Java_project Agon Matoshi Jon Kurtishi

*The project that we have done is about implementing crudoperatin and oop logice with 
java technology.
*In our application we have sucesfuly imoplemented the crud operations for every tabel 
that we have in our database, using java syntax.
*In order to run this aplication first you will need to download the project localy, 
than you have to make sure that you have started the MySql and Apache from xampp and 
you need to import the database in phpmyadmin(the database is already in the project 
file).

*Dependencies used:
spring-boot-starter-data-jpa
mysql-connector-java
spring-boot-starter-web
spring-boot-starter-test
junit 4.13.12

*Data Source:
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mysql://localhost:3306/java_project_db
spring.datasource.username=root

spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect


Usage 
 For the usage we are going to show the end poits of only one controller.

Products
1.URL FOR GETING ALL PRODUCTS:http://localhost:8080/products //Get Method
2.URL FOR GETING PRODUCT BY ID:http://localhost:8080/products/{id} //Get Method
3.URL FOR CRETING A PRODUCT:http://localhost:8080/create/product //POST Method
4.URL FOR UPDATRING A PRODUCT BY ID:http://localhost:8080/update/product/{id} //Put Method 
5.URL FOR DELETING A PRODUCT BY ID:http://localhost:8080/delete/product/{id} //Delete Method
