package com.example.gitActionCICD.service;

import com.example.gitActionCICD.entity.Employee;
import com.example.gitActionCICD.repo.EmpRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    EmpRepo empRepo;

    public Employee saveEmployee(Employee employee) {
        Employee emp = modelMapper.map(employee, Employee.class);
        return  empRepo.save(emp);
    }
}

