package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Timer;
import java.util.TimerTask;

public class Score3 extends AppCompatActivity {

    Timer timer;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score3);

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();



        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Score3.this,Resault.class);
                startActivity(intent);
                finish();
            }
        },3000);

        userID = mAuth.getCurrentUser().getUid();

        int score1;
        fStore
                .collection("users")
                .document(mAuth.getUid())
                .update("ScoreNumber",score1=100);



    }




}
