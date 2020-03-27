package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;

public class shape2 extends AppCompatActivity {

    ImageButton BackButton555 ;
    TextView Q6Text ;
    ImageView CircleView , LineView2;
    Button Button111 , Button222 , Button333 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape2);

        BackButton555=(ImageButton)findViewById(R.id.BackButton555);
        Q6Text=(TextView)findViewById(R.id.Q6Text);
        CircleView=(ImageView)findViewById(R.id.CircleView);
        LineView2=(ImageView)findViewById(R.id.LineView2) ;
        Button111 =(Button)findViewById(R.id.Button111);
        Button222=(Button)findViewById(R.id.Button222);
        Button333=(Button)findViewById(R.id.Button333);

    }

    public void Back6 (View v) {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }


   public void Answer2 (View v) {
        Intent i = new Intent(this, ShapeScore2.class);
        startActivity(i);}

}
