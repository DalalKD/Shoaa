package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PrivateEducation extends AppCompatActivity {

    Button button2;
    ImageView bac1, bac2, apple;
    TextView txt2 , txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_education);


        button2 =  findViewById(R.id.button2);
        bac1 = findViewById(R.id.bac1);
        bac2 = findViewById((R.id.bac2));
        apple = findViewById(R.id.apple);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);


    }


    public void button2 (View v){
        startActivity(new Intent(getApplicationContext(),Analysis.class));
    }
}





