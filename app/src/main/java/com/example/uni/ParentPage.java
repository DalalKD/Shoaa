package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ParentPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_page);
    }

    public void add (View view) {
        Intent i = new Intent(ParentPage.this, ChildAdd.class);
        startActivity(i);
    }

    public void chi(View view) {
        Intent i = new Intent(ParentPage.this, Game1.class);
        startActivity(i);
    }

    public void get(View view) {
        Intent i = new Intent(ParentPage.this, GetFace1.class);
        startActivity(i);

    }

    public void Day(View view) {
        Intent i = new Intent(ParentPage.this, Day.class);
        startActivity(i);
    }

    public void Week(View view) {
        Intent i = new Intent(ParentPage.this, Week.class);
        startActivity(i);
    }

    public void Get(View view) {
        Intent i = new Intent(ParentPage.this, GetFace1.class);
        startActivity(i);
    }

    public void Logout(View view) {
        Intent i = new Intent(ParentPage.this, SignIn.class);
        startActivity(i);
    }

    public void ddd(View view) {
        Intent i = new Intent(ParentPage.this, CapturePicture.class);
        startActivity(i);
    }

    public void pro(View view) {
        Intent i = new Intent(ParentPage.this, Pro.class);
        startActivity(i);
    }
}
