package com.example.matt.tabswithseparatefrags3;

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

public class tab3Fragment extends Fragment {
    private static final String TAG = "tab3Fragment";

    private Button btrTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment3,container,false);

        btrTEST = (Button) view.findViewById(R.id.button3);



        return view;
    }
}
