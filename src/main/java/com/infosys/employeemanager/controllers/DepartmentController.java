package com.infosys.employeemanager.controllers;

import com.infosys.employeemanager.models.Department;
import com.infosys.employeemanager.repos.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
    private final DepartmentRepository departmentRepo;

    public DepartmentController(DepartmentRepository departmentRepo) { this.departmentRepo = departmentRepo;}

    @GetMapping(value="/all", produces=APPLICATION_JSON_VALUE)
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @PostMapping(value="/add", produces = APPLICATION_JSON_VALUE, consumes=APPLICATION_JSON_VALUE)
    public Department addDepartment(@RequestBody Department dept) {
        return departmentRepo.save(dept);
    }

    @DeleteMapping(value="/delete/{id}")
    public void removeDepartment(@PathVariable int id) {
        departmentRepo.deleteById(id);
    }



}
