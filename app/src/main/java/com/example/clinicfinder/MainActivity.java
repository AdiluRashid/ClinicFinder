package com.example.clinicfinder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClinicUtils.addClinics();

        // Set up a button click listener
        findViewById(R.id.buttonGoToClinicList).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ClinicListActivity when the button is clicked
                startActivity(new Intent(MainActivity.this, ClinicListActivity.class));
            }
        });
    }
}