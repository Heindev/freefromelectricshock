package com.ttu_it.freefromelectricshock;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class category extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        ImageButton btn1=(ImageButton)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",0);
                startActivity(intent);
            }
        });
        ImageButton btn2=(ImageButton)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",1);
                startActivity(intent);
            }
        });
        ImageButton btn3=(ImageButton)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",2);
                startActivity(intent);
            }
        });
        ImageButton btn4=(ImageButton)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",3);
                startActivity(intent);
            }
        });
        ImageButton btn5=(ImageButton)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",4);
                startActivity(intent);
            }
        });
        ImageButton btn6=(ImageButton)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(category.this,activity_four.class);
                intent.putExtra("index",5);
                startActivity(intent);
            }
        });

    }
}
