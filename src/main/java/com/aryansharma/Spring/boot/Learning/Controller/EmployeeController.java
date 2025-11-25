package com.aryansharma.Spring.boot.Learning.Controller;

import com.aryansharma.Spring.boot.Learning.DTO.employeeEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

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

    // we can use EmployeeEntity to transfer the Data from out springboot
    // Application.
    // so this will return EmployeeDTO || and (i can call get Employee by id)
    @GetMapping("/employee/{employeeID}")

    public employeeEntity getEmployee(@PathVariable Long employeeID) {
        // here i can take ID as Input.
        return new employeeEntity(1L, "Aryan", "aryansharma@gmail.com", "password", 23, java.time.LocalDateTime.now(),
                true);
    }
}
