package com.example.matt.changelistonbtns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView mListview;

    String[] coreArray = {"Crunches", "sit-ups", "Leg Raises"};
    String[] chestArray = {"Dips", "Straight Bar Dips", "Push-ups"};
    String[] shouldersArray = {"Pike Push-up", "Shoulder Press", "Handstand Push-ups"};

    String[] mDefaultArray = {"No array"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String recievePreviousIntent;
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                recievePreviousIntent = null;
            }
            else
            {
                recievePreviousIntent = extras.getString("BodyPart");
            }
        }
        else {
            recievePreviousIntent = (String) savedInstanceState.getSerializable("BodyPart");
        }


        String[] thisArray = chooseArray(recievePreviousIntent);

        mListview = (ListView) findViewById(R.id.mListview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thisArray);

        mListview.setAdapter(arrayAdapter);
    }



    public String[] chooseArray (String bodyPart) {
        switch (bodyPart) {

            case "Chest":
                return chestArray;
            case "Core":
                return coreArray;
            case "Shoulders":
                return shouldersArray;

        }

        return mDefaultArray;
    }
}
