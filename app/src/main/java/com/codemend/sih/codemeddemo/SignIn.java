package com.codemend.sih.codemeddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
     private EditText name,password;
     private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_sign_in);

        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        loginBtn = (Button)findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String username = name.getText().toString();
            String userpassword = password.getText().toString();
            if(username.equals("doctor") && userpassword.equals("doctor123")){
             Intent intent = new Intent(getApplicationContext(),DoctorHomeActivity.class);
             startActivity(intent);
            }
            }
        });

    }
}
