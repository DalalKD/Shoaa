package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Question1 extends AppCompatActivity {
    ImageView CarsViewA;
    TextView Q1Text;
    ImageButton TenButton, EightButton, FourButtonA, BackButtonA;
    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        CarsViewA = (ImageView) findViewById(R.id.CarsViewA);
        CarsViewA.setImageResource(R.drawable.thumbnail_cars);
        Q1Text = (TextView) findViewById(R.id.Q1Text);
        TenButton = (ImageButton) findViewById(R.id.TenButton);
        EightButton = (ImageButton) findViewById(R.id.EightButton);
        FourButtonA = (ImageButton) findViewById(R.id.FourButtonB);
        BackButtonA = (ImageButton) findViewById(R.id.BackButtonA);



        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), picture.class));
                finish();
            }
        }, 100000);

    }

    public void Four(View v) {
        Intent i = new Intent(this, Score.class);
        startActivity(i);

    }

    public void Back1 (View v)
    {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);


    }


}
