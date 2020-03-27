package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageButton;

public class Game1 extends AppCompatActivity {

    ImageView SkyViewA;
    ImageButton ParentButtonB, ScoreButtonC, NumberButtonD, ShapeButtonE;
    Button GameButtonB, GameButtonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        SkyViewA = findViewById(R.id.SkyViewA);
        SkyViewA.setImageResource(R.drawable.sky);

        ParentButtonB = findViewById(R.id.ParentButtonB);
        NumberButtonD = findViewById(R.id.NumberButtonD);
        ShapeButtonE = findViewById(R.id.ShapeButtonE);

        GameButtonB =  findViewById(R.id.GameButtonB);
        GameButtonC = findViewById(R.id.GameButtonC);

    }

    public void Game(View v) {

        Intent i = new Intent(this, Question1.class);
        startActivity(i);
    }


    public void start(View view) {
        Intent i = new Intent(this, Resault.class);
        startActivity(i);
    }

    public void parent(View view) {
        Intent i = new Intent(this, ParentPage.class);
        startActivity(i);
    }

    public void shape(View view) {
        Intent i = new Intent(this, shape1.class);
        startActivity(i);
    }

    public void Logout(View view) {
        Intent i = new Intent(this, SignIn.class);
        startActivity(i);
    }

}



