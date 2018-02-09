package com.example.matt.changelistonbtns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);


    }

    public void btn1Click(View view) {

        Intent intent1 = new Intent(this, Main2Activity.class);

        intent1.putExtra("BodyPart", "Core");

        startActivity(intent1);

    }

    public void btn2Click(View view) {
        Intent intent1 = new Intent(this, Main2Activity.class);

        intent1.putExtra("BodyPart", "Chest");

        startActivity(intent1);
    }

    public void btn3Click(View view) {
        Intent intent3 = new Intent(this, Main2Activity.class);

        intent3.putExtra("BodyPart", "Shoulders");

        startActivity(intent3);

    }

}
