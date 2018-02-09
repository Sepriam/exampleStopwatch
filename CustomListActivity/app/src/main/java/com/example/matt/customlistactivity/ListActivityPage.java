package com.example.matt.customlistactivity;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivityPage extends AppCompatActivity{

    String[] exercisesList = {"push-up", "pull-up", "muscle-up", "skipping", "pull-over"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        ListAdapter myListAdapter = new CustomAdapter(this, exercisesList);

        ListView newListView = (ListView) findViewById(R.id.myListView);

        newListView.setAdapter(myListAdapter);



    }
}
