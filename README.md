# JAVA-SPRING-BOOT-WITH-CRUD-METHODS-ON-POSTGRES-DB
PLease Resue this Code and leave a comment THanks 

1. Create project structure → (web, Jpa and sql driver )
2. configure postgress sql
--→ we fo to app, properties under resources 
spring.datasource.url=jdbc:postgresql://localhost:5432/sankoreProducts
spring.datasource.username=eugenex
spring.datasource.password=sankore123
spring.jpa.show-sql=true
#HIbernate Properties
#the sql dialect makes hibernate generate better sql for the chosen db
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.postgreSQLDialect
HIbernate ddl auto (create, create drop , validate , update)
spring.jpa.hibernate.ddl-auto=update

3. define domain entity ---- Investment platforms .JAVA
4. cretae spring data repo – repo
5, controllwr --- to made valid work used this 
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

server.error.include-message=always
server.error.include-binding-errors=always

6. exception handling for restful service
a. create create a class under exception named error Details 
private Date timestamp;
private String message;
private String detail;
adding getters and setters , also constructors 
b. 

7. run the appicario
