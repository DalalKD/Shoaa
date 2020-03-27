package com.example.uni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    private static final String TAG = Register.class.getName();
    ImageView gliter1,gliter2,gliter3;
    TextView childque,childQ;
    EditText FN2, LN2,DOB2,Email2,Pass1;
    Button createPro,LoginPro;
    ProgressBar progress;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userID;

    public void haveaccount (View v)
    {
        Intent i = new Intent(this, SignIn.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        gliter1 = findViewById(R.id.gliter1);
        gliter2 = findViewById(R.id.gliter2);
        gliter3 = findViewById(R.id.gliter3);

        childque = findViewById(R.id.childque);
        childQ = findViewById(R.id.childQ);
        FN2 = findViewById(R.id.FN2);
        LN2 = findViewById(R.id.LN2);
        DOB2 = findViewById(R.id.DOB2);
        Email2 = findViewById(R.id.Email2);
        Pass1 = findViewById(R.id.Pass1);

        createPro = findViewById(R.id.createPro);
        LoginPro = findViewById(R.id.LoginPro);

        progress = findViewById(R.id.progress);

        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        /*if(mAuth.getCurrentUser() !=null){
            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            finish();
        }*/

        createPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = Email2.getText().toString().trim();
                String password = Pass1.getText().toString().trim();
                final String FirstName = FN2.getText().toString();
                final String LastName = LN2.getText().toString();
                final String DateOfBirth = DOB2.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Email2.setError("يجب ادخال البريد الالكتروني");
                    return;

                }
                if(TextUtils.isEmpty(password)){
                    Pass1.setError("يجب ادخال كلمة المرور");
                    return;
                }

                if(password.length() <6){
                    Pass1.setError("كلمة المرور يجب ان تكون مكونه من ٦ أو اكثر ");
                    return;
                }

                progress.setVisibility(View.VISIBLE);

                //register the user in firebase

                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                      if(task.isSuccessful()){

                          // send verification link
                          FirebaseUser fuser = mAuth.getCurrentUser();
                          fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                              @Override
                              public void onSuccess(Void aVoid) {
                                  Toast.makeText(Register.this, "Verification Email Has Been Sent", Toast.LENGTH_SHORT).show();
                              }
                          }).addOnFailureListener(new OnFailureListener() {
                              @Override
                              public void onFailure(@NonNull Exception e) {
                              Log.d(TAG, "onFailure: Email not sent " + e.getMessage() );
                              }
                          });


                          Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();

                          userID = mAuth.getCurrentUser().getUid();
                          DocumentReference documentReference = fStore.collection("users").document(userID);
                          Map<String,Object> user = new HashMap<>();
                          user.put("FN2",FirstName);
                          user.put("LN2",LastName);
                          user.put("DOB2",DateOfBirth);
                          user.put("Email2",email);
                          int score1;
                          user.put("ScoreNumber",score1=0);
                          int score2;
                          user.put("ScoreShape",score2=0);
                          user.put("selectedImage", null);

                          documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {

                              @Override
                              public void onSuccess(Void aVoid) {
                                  Log.d(TAG, "onSuccess: user profile is created for" + userID);
                              }
                          });
                          startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                     
                      }else{
                          Toast.makeText(Register.this, "Error ! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                          progress.setVisibility(View.GONE);
                      }

                    }

                });


            }


        });


        }

}