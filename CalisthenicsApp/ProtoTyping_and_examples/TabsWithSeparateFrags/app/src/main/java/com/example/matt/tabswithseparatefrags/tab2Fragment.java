package com.example.matt.tabswithseparatefrags;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Matt on 11/08/2017.
 */

public class tab2Fragment extends Fragment {
    private static final String TAG = "tab2Fragment";

    private Button btrTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment2,container,false);

        btrTEST = (Button) view.findViewById(R.id.button2);



        return view;
    }
}
