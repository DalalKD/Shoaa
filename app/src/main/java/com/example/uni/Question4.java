package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.RatingBar;


public class Question4 extends AppCompatActivity {

    TextView Q4Text;
    ImageView FlowersViewA ;
    ImageButton OneButton , TwoButton , ThreeButtonB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        Q4Text = (TextView) findViewById(R.id.Q4Text);
        FlowersViewA = (ImageView) findViewById(R.id.FlowesViewA);
        OneButton = (ImageButton) findViewById(R.id.OneButton);
        TwoButton = (ImageButton) findViewById(R.id.TwoButton);
        ThreeButtonB = (ImageButton) findViewById(R.id.ThreeButtonB);

    }

    public void Two (View v)
    {
        Intent i=new Intent(this,Score3.class);
        startActivity(i); }



    public void Back4 (View v)
    {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);  }
}
