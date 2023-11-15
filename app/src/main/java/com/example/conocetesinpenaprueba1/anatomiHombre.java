package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class anatomiHombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomi_hombre);
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, anatomia.class);
        startActivity(inicio);}
}