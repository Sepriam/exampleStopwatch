package com.example.matt.prototypecvcheckboxes;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Matt on 12/08/2017.
 */

public class CustomAdapter extends ArrayAdapter<Exercises> {

    public ArrayList<Exercises> exerciseList;

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<Exercises> _exerciseList) {
        super(context, resource, _exerciseList);
        this.exerciseList = new ArrayList<Exercises>();
        this.exerciseList.addAll(_exerciseList);
    }


    /**
     * Embedding a class inside another class as seen below
     * REASONS:
     * <p>
     * It is logical to embed a class within another class if it is only useful to said class
     * <p>
     * embedding a class inside another class allows it access to the 'parent' classes private variables
     * <p>
     * It makes code a lot easier to read
     */

    public class ViewHolder {
        TextView name;
        CheckBox chckBox;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder = null;

        Log.v("ConvertView", String.valueOf(position));

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(getContext().LAYOUT_INFLATER_SERVICE);

            convertView = vi.inflate(R.layout.custom_list_view_element, null);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.mTextView);
            holder.chckBox = (CheckBox) convertView.findViewById(R.id.checkBox1);

            convertView.setTag(holder);

            holder.chckBox.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v) {
                    CheckBox cb = (CheckBox) v;
                    Exercises _exercises = (Exercises) cb.getTag();

                    _exercises.setSelected(cb.isChecked());

                }


            });


        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        Exercises exercises = exerciseList.get(position);

        holder.name.setText(exercises.getName());
        holder.chckBox.setChecked(exercises.getSelected());

        holder.chckBox.setTag(exercises);

        return convertView;

    }




}
