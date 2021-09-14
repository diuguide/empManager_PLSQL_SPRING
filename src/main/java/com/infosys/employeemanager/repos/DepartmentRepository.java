package com.infosys.employeemanager.repos;

import com.infosys.employeemanager.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
