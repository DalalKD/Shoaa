package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;

public class shape3 extends AppCompatActivity {
    ImageButton BackButton7 ;
    TextView Q7Text ;
    ImageView TriangleView , LineView7;
    Button AnswerButtonA, AnswerButtonB , AnswerButtonC ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape3);
        BackButton7=(ImageButton)findViewById(R.id.BackButton7);
        Q7Text=(TextView)findViewById(R.id.Q7Text);
        TriangleView=(ImageView)findViewById(R.id.TriangleView);
        LineView7=(ImageView)findViewById(R.id.LineView7);
        AnswerButtonA =(Button)findViewById(R.id.AnswerButtonA);
        AnswerButtonB=(Button)findViewById(R.id.AnswerButtonB);
        AnswerButtonC=(Button)findViewById(R.id.AnswerButtonC);
    }
    public void Back7 (View v) {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }


public void Answer3 (View v) {
        Intent i = new Intent(this, ShapeScore3.class);
        startActivity(i);
    }
}
