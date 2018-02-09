package com.example.matt.ptlventriestonxtact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = (TextView)findViewById(R.id.mTextView2);

        ArrayList<String> exerciseList = getIntent().getExtras().getStringArrayList("exerciseList");

        String newString = "";

        mTextView.setText(newString);

        for (String e: exerciseList)
        {
            newString = newString + e + "\n";
        }

        mTextView.setText(newString);


    }
}
