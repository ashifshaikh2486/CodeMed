package com.codemend.sih.codemeddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private static int backgroundiImage;
    private Button signInBtn, registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.main_Activity);
        signInBtn = (Button)findViewById(R.id.signinbtn);
        registerBtn = (Button)findViewById(R.id.registernbtn);
        if(backgroundiImage==0){
            relativeLayout.setBackgroundResource(R.drawable.background_icon);
        }else{
            relativeLayout.setBackgroundResource(backgroundiImage);
        }

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
        });

           }
}
