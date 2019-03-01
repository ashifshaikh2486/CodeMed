package com.codemend.sih.codemeddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class SplashScreen extends AppCompatActivity {

    private LinearLayout linearLayout;
    private static  int splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_splash_screen);

        linearLayout = (LinearLayout)findViewById(R.id.layout_splashscreen);

        if(splashImage==0){
            linearLayout.setBackgroundResource(R.drawable.background_icon);
        }else{
            linearLayout.setBackgroundResource(splashImage);
        }
        Thread myThread = new Thread() {
            @Override
            public void run(){
                try {
                    sleep(1000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }
}
