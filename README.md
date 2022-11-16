# backend

### JDK Version
- jDK 11 

### Modify with your MySQL info 
`path` : src/main/resources/config/application.properties
```
spring.datasource.url=jdbc:mysql://YOUR_MYSQL_URL/employee?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

### MySQL DB
Create DB Name : employee
Create Table : employee
Columns : id, email_address, first_name, last_name

### maven build
mvn clean
mvn package