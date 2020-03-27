package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class Question3 extends AppCompatActivity {

    ImageButton ThreeButtonA , SixButtonA , FifthButtonA , BackButtonF ;
    ImageView StarsViewA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);


        ThreeButtonA=(ImageButton)findViewById(R.id.ThreeButtonA);
        SixButtonA=(ImageButton)findViewById(R.id.SixButton);
        FifthButtonA=(ImageButton)findViewById(R.id.FifthButtonA);
        BackButtonF=(ImageButton)findViewById(R.id.BackButtonF);

        StarsViewA=(ImageView)findViewById(R.id.StarsViewA);
    }

    public void Six1(View v)
    {
        Intent i=new Intent(this,Score2.class);
        startActivity(i); }

    public void Back3 (View v )
    {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }
}
