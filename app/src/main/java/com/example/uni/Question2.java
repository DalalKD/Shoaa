package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.RatingBar;


public class Question2 extends AppCompatActivity {

    TextView Q2Text;
    ImageView FishView ;
    ImageButton FourButtonB , SevenButton , SixButton , BackButtonB ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


        Q2Text=(TextView)findViewById(R.id.Q2Text);
        FishView=(ImageView)findViewById(R.id.FishView);
        FishView.setImageResource(R.drawable.fish);

        FourButtonB=(ImageButton)findViewById(R.id.FourButtonB);
        SevenButton=(ImageButton)findViewById(R.id.SevenButton);
        SixButton=(ImageButton)findViewById(R.id.SixButton);
        BackButtonB=(ImageButton)findViewById(R.id.BackButtonB);


    }

    public void Six(View v)
    {
        Intent i=new Intent(this,Score1.class);
        startActivity(i); }

    public void Back2(View v)
    {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }
}
