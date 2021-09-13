package com.infosys.employeemanager.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @Colunn(name="department_id")

}
