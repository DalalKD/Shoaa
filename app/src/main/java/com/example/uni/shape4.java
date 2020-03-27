package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
public class shape4 extends AppCompatActivity {

    ImageButton BackButton8 ;
    TextView Q8Text ;
    ImageView RectangleView , LineView8;
    Button AnswerButtonF, AnswerButtonG , AnswerButtonH ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape4);

        BackButton8=(ImageButton)findViewById(R.id.BackButton8);
        Q8Text=(TextView)findViewById(R.id.Q8Text);
        RectangleView=(ImageView)findViewById(R.id.RectangleView);
        LineView8=(ImageView)findViewById(R.id.LineView8);
        AnswerButtonF=(Button)findViewById(R.id.AnswerButtonF);
        AnswerButtonG=(Button)findViewById(R.id.AnswerButtonG);
        AnswerButtonH=(Button)findViewById(R.id.AnswerButtonH);
    }

    public void Back8 (View v) {
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }

public void Answer4 (View v) {
        Intent i = new Intent(this, ShapeScore4.class);
        startActivity(i);
    }
}

