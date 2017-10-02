package com.ttu_it.freefromelectricshock;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "myanmar3.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "zawgyi.ttf");
        ImageButton infoImgBtn = (ImageButton) findViewById(R.id.infoImgBtn);
        infoImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,category.class);
                startActivity(i);
            }
        });
        ImageButton emerImgBtn=(ImageButton)findViewById(R.id.emerImgBtn);
        emerImgBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent callIntent=new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:192"));
                startActivity(callIntent);
            }
        });

        ImageButton tastImgBtn=(ImageButton)findViewById(R.id.tastImgBtn);
        tastImgBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent intent3=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent3);
            }
        });

    }
}