package com.example.clinicfinder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class ClinicDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_details);

        Intent intent = getIntent();
        String clinicName = intent.getStringExtra("clinicName");

        // Retrieve the clinic details using ClinicUtils.getClinicByName()
        Clinic clinic = ClinicUtils.getClinicByName(clinicName);

        // Now, use the clinic object to display the clinic details in the TextViews
        TextView tvName = findViewById(R.id.textViewClinicName);
        TextView tvAddress = findViewById(R.id.textViewClinicAddress);
        TextView tvContact = findViewById(R.id.textViewClinicContact);
        TextView tvWorkingHours = findViewById(R.id.textViewClinicWorkingHours);
        TextView tvServices = findViewById(R.id.textViewClinicServices);

        if (clinic != null) {
            tvName.setText(clinic.getName());
            tvAddress.setText(clinic.getAddress());
            tvContact.setText(clinic.getContact());
            tvWorkingHours.setText(clinic.getWorkingHours());
            tvServices.setText(clinic.getServices());
        } else {
            // Handle case where clinic not found (Optional)
            // You can show an error message or handle it as you see fit
        }
    }
}