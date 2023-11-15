package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sexualidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexualidad);
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, menuInicio.class);
        startActivity(inicio);
    }
    public void anticonceptivos(View view){
        Intent inicio=new Intent(this, anticonceptivos.class);
        startActivity(inicio);
    }
    public void video(View view){
        Intent inicio=new Intent(this, video.class);
        startActivity(inicio);}
    public void enfermedades(View view){
        Intent inicio=new Intent(this, enfermedades.class);
        startActivity(inicio);
    }
}