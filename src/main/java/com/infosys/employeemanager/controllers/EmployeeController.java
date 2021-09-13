package com.infosys.employeemanager.controllers;

import com.infosys.employeemanager.models.Employee;
import com.infosys.employeemanager.repos.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(value="/all", produces = APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value="/count")
    public int getEmpCount() {
        return employeeRepository.get_emp_count();
    }


}
