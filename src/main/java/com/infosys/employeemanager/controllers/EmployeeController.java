package com.infosys.employeemanager.controllers;

import com.infosys.employeemanager.models.Employee;
import com.infosys.employeemanager.repos.EmployeeRepository;
import com.infosys.employeemanager.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeRepository employeeRepository;
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
        this.employeeRepository = employeeRepository;
        this.employeeService=employeeService;
    }

    @GetMapping(value="/all", produces = APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value="/count")
    public int getEmpCount() {
        return employeeRepository.get_emp_count();
    }

    /**
     * Required Fields:
     *      - employee_id
     *      - last_name
     *      - email
     *      - hire_date
     *      - job_id
     * @param emp
     * @return
     */
    @PostMapping(value="/addEmp", produces=APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {
        Employee newEmp = employeeService.addEmployee(emp);
        return ResponseEntity.ok().body(newEmp);
    }

    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<?> removeEmp(@PathVariable Integer id) {
        employeeService.removeEmployee(id);
        return ResponseEntity.ok().body(String.format("Employee %s has Been Removed", id));
    }

}
