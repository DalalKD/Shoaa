package com.example.uni;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.Timer;
import java.util.TimerTask;

public class picture extends AppCompatActivity {

    ImageView selectedImage;

    private StorageReference mStorageRef;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        selectedImage = findViewById(R.id.displayImageView);
        mStorageRef = FirebaseStorage.getInstance().getReference();


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Game1.class));
                finish();
            }
        }, 7000);
        Toast.makeText(picture.this, "The child is not engaged", Toast.LENGTH_SHORT).show();

    }




    }




