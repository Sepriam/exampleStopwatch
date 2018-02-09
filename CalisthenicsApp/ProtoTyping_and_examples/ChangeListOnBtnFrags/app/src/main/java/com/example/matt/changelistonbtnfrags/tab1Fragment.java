package com.example.matt.changelistonbtnfrags;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Matt on 11/08/2017.
 */

public class tab1Fragment extends Fragment {

    private static String[] legsEasy = {"Squats", "lunges", "Bulgarian Split squat"};
    private static String[] legsMedium = {"Squat Jumps", "Weighted Squats", "Step-ups"};
    private static String[] legsHard = {"Backflip burpess", "weighted step-ups", "Crab walks", "heavy weighted squats"};
    private static String[] noLegs = {"no legs"};


    private static final String TAG = "tab1Fragment";

    private Button btrTEST;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main,container,false);

        btrTEST = (Button) view.findViewById(R.id.button1);

        listView = (ListView) view.findViewById(R.id.mListview1);

        String Item = getActivity().getIntent().getExtras().getString("Difficulty");

        String[] arrayToLoad = decideArray(Item);

        ListAdapter myListAdapter =  new CustomAdapter1(getContext(), arrayToLoad);
        listView.setAdapter(myListAdapter);


        return view;
    }


    public String[] decideArray (String _difficulty)
    {
        //to do make a switch statement that will send the right array back

        switch (_difficulty){
            case "Easy":
                return legsEasy;
            case "Medium":
                return legsMedium;
            case "Hard":
                return legsHard;
        }
        return noLegs;


    }

}
