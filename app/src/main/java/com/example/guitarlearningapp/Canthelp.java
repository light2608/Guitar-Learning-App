package com.example.guitarlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Canthelp extends AppCompatActivity {

    //Intialize Variable
    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canthelp);

        //Assign Variable
        videoView = findViewById(R.id.canthelpfallingvid);

        //Creating MediaController
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView)

        //Phrase Video Link
        Uri uri = Uri.parse("")

    }
}