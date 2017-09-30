package com.ttu_it.freefromelectricshock;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3 * 1000);
                    Intent intent1 = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent1);
                    finish();
                } catch (Exception e) {

                }
            }
        };
        thread.start();
    }
}
