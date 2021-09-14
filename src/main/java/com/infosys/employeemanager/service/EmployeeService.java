package com.infosys.employeemanager.service;

import com.infosys.employeemanager.models.Employee;
import com.infosys.employeemanager.repos.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) { this.employeeRepository= employeeRepository;};

    public Employee addEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public void removeEmployee(Integer empId) {
        employeeRepository.deleteById(empId);
    }

    public Employee updateEmployeeRecord(Employee emp) {
        return employeeRepository.save(emp);
    }


}
