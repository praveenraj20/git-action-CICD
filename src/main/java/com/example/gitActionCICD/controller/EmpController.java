package com.example.gitActionCICD.controller;

import com.example.gitActionCICD.entity.Employee;
import com.example.gitActionCICD.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;



    @PostMapping(value = "/saveEmp")
    public Employee saveEmployee(@RequestBody Employee employee){
        return empService.saveEmployee(employee);
    }
}
