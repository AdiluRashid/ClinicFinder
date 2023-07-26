package com.example.clinicfinder;



public class Clinic  {
    private final String name;
    private final String address;
    private final String contact;
    private final String workingHours;
    private final String services;

    public Clinic(String name, String address, String contact, String workingHours, String services) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.workingHours = workingHours;
        this.services = services;
    }

    // Add getter methods for accessing clinic attributes
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getWorkingHours() {
        return workingHours;
    }
    public String getServices() {
        return services;
    }
}
