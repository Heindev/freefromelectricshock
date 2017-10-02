package com.ttu_it.freefromelectricshock;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    HashMap<String, List<String>> Article_category;
    List<String> Article_list;;
    firstAdapter adapter;
    ExpandableListView fir_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Typeface type=Typeface.createFromAsset(getAssets(),"zawgyi.ttf");

        TextView tv1=(TextView)findViewById(R.id.tv1);
        fir_list =(ExpandableListView)findViewById(R.id.fir_list);

        tv1.setTypeface(type);
        Article_category = DataProvider.getInfo();
        Article_list = new ArrayList<String>(Article_category.keySet());
        adapter = new firstAdapter(this, Article_category, Article_list);
        fir_list.setAdapter(adapter);

    }
}

