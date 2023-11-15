package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //a partir de aqui codigo para video
        videoView = (VideoView)findViewById(R.id.anticonceptivosvideo);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.anticonceptivosvideo));//busca video
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
}