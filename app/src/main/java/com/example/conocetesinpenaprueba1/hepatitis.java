package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hepatitis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hepatitis);
    }
    public void volver(View view) {
        Intent go = new Intent(this, enfermedades.class);
        startActivity(go);
    }
}