package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetFace1 extends AppCompatActivity {


    Button e1;
    ImageView aa,arrow ;
    TextView w1 , w2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_face1);

        e1 = findViewById(R.id.e1);
        aa = findViewById(R.id.aa);
        w1 = findViewById(R.id.w1);
        w2 = findViewById(R.id.w2);
        arrow = findViewById(R.id.arrow);
    }

    public void GO (View v) {
        startActivity(new Intent(getApplicationContext(),GetFace.class));
    }

    public void Parent(View view) {
        startActivity(new Intent(getApplicationContext(),ParentPage.class));
    }

    public void click(View view) {
        startActivity(new Intent(getApplicationContext(),CapturePicture.class));
    }
}
