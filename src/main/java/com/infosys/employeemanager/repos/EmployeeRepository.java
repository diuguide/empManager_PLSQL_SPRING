package com.infosys.employeemanager.repos;

import com.infosys.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(nativeQuery = true, value = "SELECT get_emp_count FROM dual")
    int get_emp_count();
}
