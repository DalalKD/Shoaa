package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.opencv.dnn.Net;

public class GetFace extends AppCompatActivity {

    Button nnext ;
    ImageView log ;
    TextView how , txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_face);

        nnext = findViewById(R.id.nnext);
        log = findViewById(R.id.log);
        log = findViewById(R.id.log);
        how = findViewById(R.id.how);
        txt = findViewById(R.id.txt);
    }

    public void Parent(View view) {
        Intent i = new Intent(GetFace.this, ParentPage.class);
        startActivity(i);
    }
}

