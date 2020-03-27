package com.example.uni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class Pro extends AppCompatActivity {

    TextView profileFName, profileLName, profileEmail, ProfileDOB, verifyMsg, profile, profileScore;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;
    Button resendCode, log;
    ImageView imageView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        profileFName = findViewById(R.id.profileFName);
        profileLName = findViewById(R.id.profileLName);
        profileEmail = findViewById(R.id.profileEmail);
        ProfileDOB = findViewById(R.id.ProfileDOB);
        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        resendCode = findViewById(R.id.resendCode);
        log = findViewById(R.id.log);
        verifyMsg = findViewById(R.id.verifyMsg);
        profile = findViewById(R.id.profile);
        imageView10 = findViewById(R.id.imageView10);



        userID = mAuth.getCurrentUser().getUid();
        final FirebaseUser user = mAuth.getCurrentUser();

        if (!user.isEmailVerified()) {
            verifyMsg.setVisibility(View.VISIBLE);
            resendCode.setVisibility(View.VISIBLE);

            resendCode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {

                    user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(v.getContext(), "Verification Email Has Been Sent", Toast.LENGTH_SHORT);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("TAG", "OnFailure: Email not sent" + e.getMessage());
                        }
                    });


                }
            });
        }


        DocumentReference documentReference = fStore.collection("users").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                profileFName.setText(documentSnapshot.getString("FN2"));
                profileLName.setText(documentSnapshot.getString("LN2"));
                profileEmail.setText(documentSnapshot.getString("Email2"));
                ProfileDOB.setText(documentSnapshot.getString("DOB2"));
            }
        });


    }

    public void log(View view) {
        //FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(), SignIn.class));
        finish();

    }

    public void parent(View view) {
        startActivity(new Intent(getApplicationContext(), ParentPage.class));
    }

    public void chi(View view) {
        startActivity(new Intent(getApplicationContext(), Game1.class));
    }
}