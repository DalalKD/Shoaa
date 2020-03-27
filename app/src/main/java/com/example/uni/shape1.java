package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.ImageButton ;

public class shape1 extends AppCompatActivity {
    TextView Q5Text ;
    ImageView SequareView , LineView2 ;
    Button AnswerButton100 , AnswerButton200 , AnswerButton300 ;
    ImageButton BackView222 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape1);

        Q5Text=(TextView)findViewById(R.id.Q5Text);
        SequareView=(ImageView)findViewById(R.id.SequareView);
        LineView2=(ImageView) findViewById(R.id.LineView2);
        AnswerButton300=(Button) findViewById(R.id.AnswerButton300);
        AnswerButton200=(Button)findViewById(R.id.AnswerButton200);
        AnswerButton100=(Button)findViewById(R.id.AnswerButton100);
        BackView222=(ImageButton)findViewById(R.id.BackButton222);
    }

    public void Back5 (View v)
    {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);  }


   public void Answer1 (View v)
    {
        Intent i=new Intent(this , ShapeScore1.class);
        startActivity(i); }
}


