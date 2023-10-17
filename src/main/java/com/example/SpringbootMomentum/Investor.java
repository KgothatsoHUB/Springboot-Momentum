package com.example.SpringbootMomentum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String personalInformation;
    private String address;
    private String contact;

    // Constructors
    public Investor() {
    }

    public Investor(String personalInformation, String address, String contact) {
        this.personalInformation = personalInformation;
        this.address = address;
        this.contact = contact;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(String personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

