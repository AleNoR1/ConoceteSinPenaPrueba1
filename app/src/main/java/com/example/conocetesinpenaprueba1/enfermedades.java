package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class enfermedades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfermedades);
    }
    public void clamidia(View view) {
        Intent go = new Intent(this, clamidia.class);
        startActivity(go);
    }
    public void verruga(View view) {
        Intent go = new Intent(this, verruga.class);
        startActivity(go);
    }
    public void hepatitis(View view) {
        Intent go = new Intent(this, hepatitis.class);
        startActivity(go);
    }

    public void gonorrea(View view) {
        Intent go = new Intent(this, gonorrea.class);
        startActivity(go);
    }
    public void herpes(View view) {
        Intent go = new Intent(this, herpes.class);
        startActivity(go);
    }
    public void vih(View view) {
        Intent go = new Intent(this, vih.class);
        startActivity(go);
    }
    public void papiloma(View view) {
        Intent go = new Intent(this, papiloma.class);
        startActivity(go);
    }

    public void sifilis(View view) {
        Intent go = new Intent(this, sifilis.class);
        startActivity(go);
    }
    public void tricomiasis(View view) {
        Intent go = new Intent(this, tricomoniasis.class);
        startActivity(go);
    }
    public void volver(View view) {
        Intent go = new Intent(this, Sexualidad.class);
        startActivity(go);
    }
}