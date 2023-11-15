package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tabusMitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabus_mitos);
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, menuInicio.class);
        startActivity(inicio);
    }
    public void mito(View view) {
        Intent go = new Intent(this, mitos.class);
        startActivity(go);
    }
    public void tavu(View view) {
        Intent go = new Intent(this, tavu.class);
        startActivity(go);
    }
}