package com.example.clinicfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;
import java.util.List;
import android.widget.AdapterView;
import android.content.Intent;
import android.os.Bundle;


public class ClinicListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_list);

        // Fetch clinic names using ClinicUtils
        List<String> clinics = ClinicUtils.fetchClinics();

        // Set up the ListView and the custom adapter
        ListView listViewClinics = findViewById(R.id.listViewClinics);
        ClinicListAdapter adapter = new ClinicListAdapter(this, clinics);
        listViewClinics.setAdapter(adapter);

        // Handle item clicks on the ListView
        listViewClinics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected clinic name
                String selectedClinicName = clinics.get(position);

                // Start ClinicDetailsActivity and pass the clinic name as an extra
                Intent intent = new Intent(ClinicListActivity.this, ClinicDetailsActivity.class);
                intent.putExtra("clinicName", selectedClinicName);
                startActivity(intent);
            }
        });
    }
}