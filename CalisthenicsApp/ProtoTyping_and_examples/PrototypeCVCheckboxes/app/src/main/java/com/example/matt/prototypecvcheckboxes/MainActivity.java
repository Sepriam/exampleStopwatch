package com.example.matt.prototypecvcheckboxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    CustomAdapter customAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExercises();

        checkButtonClick();

    }


    private void createExercises()
    {

        ArrayList<Exercises> exerciseList = new ArrayList<>();

        Exercises _newExercise = new Exercises("Squat", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Bar-kip", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Pull-over", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Push-up", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Pull-up", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Muscle-up", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Deadlift", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Weighted Pull-ups", false);
        exerciseList.add(_newExercise);
        _newExercise = new Exercises("Explosive Pull-ups", false);
        exerciseList.add(_newExercise);


        customAdapter = new CustomAdapter(this, R.layout.custom_list_view_element, exerciseList);
        ListView listView = (ListView) findViewById(R.id.listView1);

        listView.setAdapter(customAdapter);

    }


    private void checkButtonClick()
    {

        Button myButton = (Button) findViewById(R.id.button1);

        myButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {

                StringBuffer responseText = new StringBuffer();
                responseText.append("The following were selected...\n");

                ArrayList<Exercises> stateList = customAdapter.exerciseList;

                for(int i=0;i<stateList.size();i++)
                {
                    Exercises state = stateList.get(i);

                    if(state.getSelected())
                    {
                        responseText.append("\n" + state.getName());
                    }
                }

                Toast.makeText(getApplicationContext(),
                        responseText, Toast.LENGTH_LONG).show();
            }
        });
    }
}
