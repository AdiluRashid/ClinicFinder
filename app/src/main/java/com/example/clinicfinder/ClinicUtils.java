package com.example.clinicfinder;

import java.util.ArrayList;
import java.util.List;

public class ClinicUtils {
    private static final List<Clinic> clinics = new ArrayList<>();

    // Method to add clinics to the list (You can add more clinics here)
    public static void addClinics() {
        clinics.add(new Clinic("Farsham Clinic", "Ring road plot 231", "TEL: 256 770 XXX XXX", "Everyday (7am - 10pm)","SERVICES OFFERED: Medical Consultation, Treatment, HIV Testing, COVID Testing, Pregnancy Testing"));
        clinics.add(new Clinic("DXM Clinic", "6th Avenue All Saints Building", "TEL: 256 700 XXX XXX", "Everyday (7am - 10pm)","SERVICES OFFERED: Medical Consultation, Treatment, HIV Testing, COVID Testing, Pregnancy Testing"));
        clinics.add(new Clinic("Eco Clinic", "Kisa Kya Maria Building", "TEL: 256 778 XXX XXX", "Everyday (7am - 10pm)","SERVICES OFFERED: Medical Consultation, Treatment, Dental, HIV Testing, COVID Testing, Pregnancy Testing"));
        clinics.add(new Clinic("Lifelink Clinic", "Ntinda Road plot 3456", "TEL: 256 750 XXX XXX", "Everyday (7am - 10pm)","SERVICES OFFERED: Medical Consultation, Treatment, HIV Testing, Dental, COVID Testing, Pregnancy Testing"));
        clinics.add(new Clinic("Mate Clinic", "Magambo Road plot 21445", "TEL: 256 755 XXX XXX", "Everyday (7am - 10pm)","SERVICES OFFERED: Medical Consultation, Treatment, HIV Testing, COVID Testing, Pregnancy Testing, ER Services, Eye Care"));
    }

    // Method to get the list of clinics
    public static List<String> fetchClinics() {
        List<String> clinics = new ArrayList<>();
        clinics.add("Farsham Clinic");
        clinics.add("DXM Clinic");
        clinics.add("Eco Clinic");
        clinics.add("Lifelink Clinic");
        clinics.add("Mate Clinic");
        return clinics;

    }

    // Method to get a specific clinic by name
    public static Clinic getClinicByName(String clinicName) {
        for (Clinic clinic : clinics) {
            if (clinic.getName().equals(clinicName)) {
                return clinic;
            }
        }
        return null; // Return null if clinic name not found
    }
}
