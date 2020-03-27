package com.example.uni;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignIn extends AppCompatActivity {

    ProgressBar progressBar2;
    ImageView back1, back2, back3;
    TextView Regi2;
    EditText Email2,Pass1;
    Button mLoginBtn, mCreateBtn,forgotpass;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        progressBar2 = findViewById(R.id.progressBar2);
        back1 = findViewById(R.id.back1);
        back2 = findViewById(R.id.back2);
        back3 = findViewById(R.id.back3);
        Regi2 = findViewById(R.id.Regi2);
        Email2 = findViewById(R.id.Email2);
        Pass1 = findViewById(R.id.Pass1);
        mLoginBtn = findViewById(R.id.mLoginBtn);
        mCreateBtn = findViewById(R.id.mCreateBtn);
        forgotpass = findViewById(R.id.forgotpass);
        mAuth = FirebaseAuth.getInstance();

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email2.getText().toString().trim();
                String password = Pass1.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Email2.setError("يجب ادخال البريد الإلكتروني");
                    return;
                }

                if(TextUtils.isEmpty(password)){
                    Pass1.setError("يجب ادخال كلمة المرور");
                    return;
                }

                if(password.length() < 6){
                    Pass1.setError("كلمة المرور يجب ان تكون مكونه من ٦ أو اكثر");
                    return;
                }

                progressBar2.setVisibility(View.VISIBLE);

                //authenticate the user

                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(SignIn.this, "User logged in isSuccessfulLY .", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Main2Activity.class) );
                        }
                        else{
                            Toast.makeText(SignIn.this, "Error !"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar2.setVisibility(View.GONE);
                        }




                    }
                });
            }


        });

        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
    });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),forgetpass.class));
            }
        });

}
}
