package com.example.matt.changelistonbtnfrags;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionPageAdapter;

    private ViewPager mViewPager;

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
                recievePreviousIntent = extras.getString("Difficulty");
            }
        }
        else {
            recievePreviousIntent = (String) savedInstanceState.getSerializable("Difficulty");
        }

        Log.d(TAG, "Oncreate: Starting.");

        mSectionPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //Set up the viewPager with the sections Adapter
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager(ViewPager viewPager)
    {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1Fragment(), "Legs");
        adapter.addFragment(new tab2Fragment(), "Chest");
        adapter.addFragment(new tab3Fragment(), "Core");
        viewPager.setAdapter(adapter);
    }
}

/**
 String[] thisArray = chooseArray(recievePreviousIntent);

 mListview = (ListView) findViewById(R.id.mListview);

 ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, thisArray);

 mListview.setAdapter(arrayAdapter);


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


 <ListView
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:id="@+id/mListview">


 </ListView>


 **/
