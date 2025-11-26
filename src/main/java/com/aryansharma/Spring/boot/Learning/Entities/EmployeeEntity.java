package com.aryansharma.Spring.boot.Learning.Entities;


//==> This Entity will Comfirm the table inside my Database

import jakarta.persistence.*;

import java.time.LocalDateTime;

//--@Entity
//-->It will Tell the Spring Data JPA or hibernate ,
//-->that hey this is the java class(EmployeeEntity) that you need to convert to a table inside a database

//Table
//Table(Annotation name="Employee")


@Entity
@Table(name= "Employee")
public class EmployeeEntity  {

    //and the fields inside my Employee Entity and Those fields inside my Entity
    //will than we converted to the coloumns inside my rows of the Table.

    //--> i'm going to my EmployeeDTO , i'm going to copy my all the fields.
    //--> because those are required inside my entity as well.

    //==> @Id : Every Id need to have a primary key,so that they can be seprated out.
    //==> @GeneratedValue  : is for autoincrement . so generated value should be SEQUENCE

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private long id;
    private String name;
    private String email;
    private String password;
    private Integer age;
    private LocalDateTime dateofjoinning;
    private Boolean isactive;

    //-->inside the Employee Entity, you can have some sensitive information,
    //--> like the password of the employees and you dont want to expose data
    //--> To employeeDTO.
    //--> expose only the certain , data that you are sure , that these data can go to the
    //--> request or Respone,

    //==> Here, you can add certain validation,

    //--> For the Security Purpose
    //--> inside the EmployeeEntity, you can have some sensitive information




}
