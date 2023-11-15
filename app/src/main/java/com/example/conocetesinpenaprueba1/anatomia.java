package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class anatomia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomia);
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, menuInicio.class);
        startActivity(inicio);
    }
    public void irM(View view){
        Intent ir=new Intent(this, anatomiMujer.class);
        startActivity(ir);
    }
    public void irH(View view){
        Intent ir=new Intent(this, anatomiHombre.class);
        startActivity(ir);
    }
}
