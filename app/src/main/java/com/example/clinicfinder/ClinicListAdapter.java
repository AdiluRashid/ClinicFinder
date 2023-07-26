package com.example.clinicfinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class ClinicListAdapter extends ArrayAdapter<String> {

    private List<String> clinics;

    public ClinicListAdapter(Context context, List<String> clinics) {
        super(context, 0, clinics);
        this.clinics = clinics;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_clinic, parent, false);
        }

        // Get the data item for this position
        String clinicName = clinics.get(position);

        // Set the clinic name in the TextView
        TextView textViewClinicName = convertView.findViewById(R.id.textViewClinicName);
        textViewClinicName.setText(clinicName);

        return convertView;
    }
}
