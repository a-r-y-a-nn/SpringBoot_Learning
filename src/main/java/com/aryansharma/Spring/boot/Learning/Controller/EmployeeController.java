package com.aryansharma.Spring.boot.Learning.Controller;

import com.aryansharma.Spring.boot.Learning.DTO.employeeDTO;
import org.springframework.web.bind.annotation.*;

//restController Annotation ==> will make sure that the mapping defined inside the controller
//==> are rest in Nature.

//restController ==>@controller+@responseBody
//meaning all the methods in the controller will return JSON+XML directly to response body

@RestController
public class EmployeeController {

    // @GetMapping(path = "/getSecretMessage")

    // public String getMySuperSecretMessage() {
    // return "Secret Message: Hello World!";
    // }

    // we can use EmployeeDTO to transfer the Data from out springboot
    // Application.
    // so this will return EmployeeDTO || and (i can call get Employee by id)
    @GetMapping("/employee/{employeeID}")

    public employeeDTO getEmployee(@PathVariable Long employeeID) {
        // here i can take ID as Input.
        return new employeeDTO(1L, "Aryan", "aryansharma@gmail.com", "password", 23, java.time.LocalDateTime.now(),
                true);
    }

    @GetMapping(path = "/employees" )
    public String getAllEmployees(@RequestParam Integer age) {
        return "Hi age: " + age;
    }


    //==> Post Mapping Are Generally used whenever you want to create an Employee
    @PostMapping
    public String CreateNewEmployee(){
        return "Hello From New Employee";
    }

    //==>Put Mapping are Generally used whenever you want to update an Employee
    @PutMapping
    public String UpdateEmployee(){
        return "Hello From Update";
    }

}

//==>