package com.infosys.employeemanager.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location {

    @Id
    @Column(name="location_id")
    private Integer location_id;

    @Column(name="street_address")
    private String address;

    @Column(name="postal_code")
    private String postal_code;

    @Column(name="city")
    private String city;

    @Column(name="state_province")
    private String state_province;

    @Column(name="country_id")
    private String country_id;

    public Location() {
    }

    public Location(Integer location_id, String address, String postal_code, String city, String state_province, String country_id) {
        this.location_id = location_id;
        this.address = address;
        this.postal_code = postal_code;
        this.city = city;
        this.state_province = state_province;
        this.country_id = country_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
}
