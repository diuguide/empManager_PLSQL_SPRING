package com.infosys.employeemanager.controllers;

import com.infosys.employeemanager.models.Job;
import com.infosys.employeemanager.repos.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final Logger logger = LoggerFactory.getLogger(JobController.class);
    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping(value="/all", produces=APPLICATION_JSON_VALUE)
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    @PostMapping(value="/addJob", produces=APPLICATION_JSON_VALUE, consumes=APPLICATION_JSON_VALUE)
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    @DeleteMapping(value="/deleteJob/{id}")
    public void deleteJob(@PathVariable int id){
        jobRepository.deleteById(id);
    }


}
