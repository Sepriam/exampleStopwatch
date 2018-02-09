package com.example.matt.changelistonbtnfrags;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Matt on 11/08/2017.
 */

public class tab3Fragment extends Fragment {

    private static String[] coreEasy = {"sit-ups", "crunches", "knee raises"};
    private static String[] coreMedium = {"Leg Raises", "weighted Sit-ups", "Medicine Ball work"};
    private static String[] coreHard = {"Pull-overs", "Toes to bar", "Dragon Flag", "Human Flag"};
    private static String[] noCore = {"broken"};

    private static final String TAG = "tab3Fragment";

    private Button btrTEST;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment3,container,false);

        btrTEST = (Button) view.findViewById(R.id.button3);

        String Item = getActivity().getIntent().getExtras().getString("Difficulty");

        String[] arrayToLoad = decideArray(Item);

        listView = (ListView) view.findViewById(R.id.mListview3);

        ListAdapter myListAdapter =  new CustomAdapter3(getContext(), arrayToLoad);
        listView.setAdapter(myListAdapter);


        return view;
    }


    public String[] decideArray (String _difficulty)
    {
        //to do make a switch statement that will send the right array back

        switch (_difficulty){
            case "Easy":
                return coreEasy;
            case "Medium":
                return coreMedium;
            case "Hard":
                return coreHard;
        }
        return noCore;


    }

}
