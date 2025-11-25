package com.aryansharma.Spring.boot.Learning.DTO;

//==>DTO stands for Data Transfer Object;

//==> These are used when you wanted to transfer the Data
//==> Client --> Controller --> Service
//==> DTO stays between the Presentation Layer and Service Layer

//==> inside Employee we can define the fields that can employee have.

import java.time.LocalDate;
import java.time.LocalDateTime;

public class employeeEntity {

    private long id;
    private String name;
    private String email;
    private String password;
    private Integer age;
    private LocalDateTime dateofjoinning;
    private Boolean isactive;

    // ==> and to Expose outside we need to call the Getters and Setters
    // ==> i can also define some constructor.
    // ==> default constructor

    // ---> so This basically the POJO class , Plain Object Java Class
    // ==> These are used to Decide some entities inside the code

    // --> Default Construtor

    public employeeEntity() {
    }

    // --> all Argument Constructor
    public employeeEntity(long id, String name, String email, String password, Integer age,
            LocalDateTime dateofjoinning, Boolean isactive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.dateofjoinning = dateofjoinning;
        this.isactive = isactive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDateofjoinning() {
        return dateofjoinning;
    }

    public void setDateofjoinning(LocalDateTime dateofjoinning) {
        this.dateofjoinning = dateofjoinning;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }
}
