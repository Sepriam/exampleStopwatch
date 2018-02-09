package com.example.matt.tabswithseparatefrags2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Matt on 11/08/2017.
 */

public class tab1Fragment extends Fragment {
    private static final String TAG = "tab1Fragment";

    private Button btrTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main,container,false);

        btrTEST = (Button) view.findViewById(R.id.button1);

        return view;
    }
}
