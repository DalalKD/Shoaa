package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.Timer;
import java.util.TimerTask;

public class Score extends AppCompatActivity {

    Timer timer;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();



        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            Intent intent = new Intent(Score.this, Question2.class);
            startActivity(intent);
            finish();
            }
        },3000);

        userID = mAuth.getCurrentUser().getUid();

        int score1;
        fStore
                .collection("users")
                .document(mAuth.getUid())
                .update("ScoreNumber",score1=25);
}
}
