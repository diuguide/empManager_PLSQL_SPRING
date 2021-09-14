package com.infosys.employeemanager.controllers;

import com.infosys.employeemanager.models.Country;
import com.infosys.employeemanager.models.Location;
import com.infosys.employeemanager.models.Region;
import com.infosys.employeemanager.repos.CountryRepository;
import com.infosys.employeemanager.repos.LocationRepository;
import com.infosys.employeemanager.repos.RegionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final Logger logger = LoggerFactory.getLogger(LocationController.class);
    private final CountryRepository countryRepository;
    private final LocationRepository locationRepository;
    private final RegionRepository regionRepository;

    public LocationController(CountryRepository countryRepository, LocationRepository locationRepository, RegionRepository regionRepository) {
        this.countryRepository = countryRepository;
        this.regionRepository = regionRepository;
        this.locationRepository = locationRepository;
    }

    @GetMapping(value="/allLocations", produces=APPLICATION_JSON_VALUE)
    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }

    @GetMapping(value="/allRegions", produces=APPLICATION_JSON_VALUE)
    public List<Region> getAllRegions(){
        return regionRepository.findAll();
    }

    @GetMapping(value="/allCountries", produces = APPLICATION_JSON_VALUE)
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }




}
