package com.example.matt.tabfragcustomlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Matt on 11/08/2017.
 */

public class tab1Fragment extends Fragment {
    private static final String TAG = "tab1Fragment";

    String[] exercisesList = {"squat", "Lunge", "split squat", "Weighted Squat"};

    private Button btrTEST;
    private ListView lvTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main,container,false);

        btrTEST = (Button) view.findViewById(R.id.button1);

        ListAdapter myListAdapter = new CustomAdapter1(getContext(), exercisesList);
        lvTEST = (ListView) view.findViewById(R.id.listview1);
        lvTEST.setAdapter(myListAdapter);


        return view;
    }
}
