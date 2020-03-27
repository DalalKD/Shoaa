package com.example.uni;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firestore.v1beta1.UpdateDocumentRequest;
import com.google.firestore.v1beta1.WriteResult;

import java.util.HashMap;
import java.util.Map;

public class Resault<puplic> extends AppCompatActivity {

    TextView complete;
    int score;
    Button TryAgain;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;
    private static final String TAG = Resault.class.getName();
    private Object UpdateDocumentRequest;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resault);

        complete = findViewById(R.id.complete);
        TryAgain = findViewById(R.id.TryAgain);
        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userID = mAuth.getCurrentUser().getUid();
        fStore
                .collection("users")
                .document(mAuth.getUid())
                .update("Score",score=100);

   }

    public void playGame(View view) {
        Intent i=new Intent(this,Game1.class);
        startActivity(i); }
    }



