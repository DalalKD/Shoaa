package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View ;
import android.widget.Button;
import android.widget.ImageView ;
import android.widget.TextView ;

public class Analysis extends AppCompatActivity {


    Button press;
    ImageView image, image1, image3;
    TextView tx1, tx2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);


        press = findViewById(R.id.press);
        image = findViewById(R.id.image);
        image1 = findViewById(R.id.image1);
        image3 = findViewById(R.id.image3);
        tx1 = findViewById(R.id.tx1);
        tx2 = findViewById(R.id.tx2);

    }

    public void Go (View view){

        startActivity(new Intent(getApplicationContext(),SignIn.class));
}

}
