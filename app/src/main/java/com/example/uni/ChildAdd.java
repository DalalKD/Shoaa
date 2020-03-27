package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildAdd extends AppCompatActivity {
    Button c1 , c2 , c3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_add);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);

    }

    public void c1 (View v){
        startActivity(new Intent(getApplicationContext(),SignIn.class));
    }


    public void c2 (View v){
        startActivity(new Intent(getApplicationContext(),SignIn.class));
    }


    public void c3 (View v){
        startActivity(new Intent(getApplicationContext(),SignIn.class));
    }
}

