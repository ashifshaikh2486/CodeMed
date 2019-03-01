package com.codemend.sih.codemeddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class PrescribeMedicine extends AppCompatActivity {

    private AutoCompleteTextView medicineAutoCompleteTextView;

    String[] medicines = {"Crossin","Parasetamal","Zocon","Combiflame","Aciloc","Omid","Eno","Namecold"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_prescribe_medicine);

        medicineAutoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.medicineautocompletetextview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,medicines);
        medicineAutoCompleteTextView.setThreshold(1);
        medicineAutoCompleteTextView.setAdapter(arrayAdapter);


    }
}
