package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView  ;
import android.widget.TextView ;


public class pop extends AppCompatActivity {
    Button button ;
    ImageView logo ;
    TextView txt1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);


        button = findViewById(R.id.button);
        logo = findViewById(R.id.logo);
        txt1 = findViewById(R.id.txt1);


    }

    public void next(View view) {
        startActivity(new Intent(getApplicationContext(),PrivateEducation.class));
    }
}
















