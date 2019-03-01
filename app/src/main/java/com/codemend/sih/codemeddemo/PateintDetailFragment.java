package com.codemend.sih.codemeddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class PateintDetailFragment extends Fragment {
    private Button previousPrescriptionBtn, healthReportBtn,prescribeMedicineBtn,specialNotesBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pateint_detail,container,false);
        previousPrescriptionBtn = (Button)view.findViewById(R.id.previousPrescriptionBtn);
        healthReportBtn = (Button)view.findViewById(R.id.healthReportBtn);
        prescribeMedicineBtn = (Button)view.findViewById(R.id.prescribeMedicineBtn);
        specialNotesBtn = (Button)view.findViewById(R.id.specialNotesBtn);

        prescribeMedicineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),PrescribeMedicine.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
