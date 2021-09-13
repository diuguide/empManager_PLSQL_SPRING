package com.infosys.employeemanager.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Job {

    @Id
    @Column(name="job_id")
    private Integer job_id;

    @Column(name="job_title")
    private String job_title;

    @Column(name="min_salary")
    private Integer min_salary;

    @Column(name="max_salary")
    private Integer max_salary;

    public Job() {
    }

    public Job(Integer job_id, String job_title, Integer min_salary, Integer max_salary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public Integer getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Integer min_salary) {
        this.min_salary = min_salary;
    }

    public Integer getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Integer max_salary) {
        this.max_salary = max_salary;
    }
}
