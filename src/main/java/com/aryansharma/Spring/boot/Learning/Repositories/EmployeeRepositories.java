package com.aryansharma.Spring.boot.Learning.Repositories;


//==>
//==> Sprring Data jpa will define The CRUD Operations
//==> and also some more Queries with the help of JPQL
//==> so we no need to define our own implementaion  so we can make our own interface
//==> so this is an Interface it can extends from  JPA Repository
//==>inside the JPA Repository, we need to types:
//==>1. Which kind of Entity do you want to handel so, we need to handle (EmployeeEntity)
//==>2. What is the Type of ID of employeeEntity i.e (long)

import com.aryansharma.Spring.boot.Learning.Entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

public interface EmployeeRepositories extends JpaRepository <EmployeeEntity,Long>{

    //==> List of employee entity findbyname
    //==> then this method will be auto defined by JPA repository

//    List<EmployeeEntity> findByName(String name);
    // for i dont need to define these.


    //==>Controller
}
