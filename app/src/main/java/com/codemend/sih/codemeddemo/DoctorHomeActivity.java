package com.codemend.sih.codemeddemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

public class DoctorHomeActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView ;
    private ImageButton qrscanBtn;

    String[] patients = {"Karan","Kuldeep","Ashif","Devansh","Mayank","Rakshita","Avdesh","Durga"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_doctor_home);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autocompletetextview);
        qrscanBtn = (ImageButton)findViewById(R.id.qrscanBtn);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,patients);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(arrayAdapter);

        qrscanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                PateintDetailFragment pateintDetailFragment = new PateintDetailFragment();

                fragmentTransaction.add (R.id.doctorFrame, pateintDetailFragment);
                fragmentTransaction.commit ();


            }
        });
    }
}
