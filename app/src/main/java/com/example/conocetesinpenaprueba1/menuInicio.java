package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class menuInicio extends AppCompatActivity {
String dato;
private EditText usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicio);
        usuario=findViewById(R.id.usuario);


    }
    public void anatomiaBasica(View view) {
        Intent anatomiaBasica = new Intent(this, anatomia.class);
        startActivity(anatomiaBasica);
    }
    public void sexualidad(View view) {
        Intent sexualidad = new Intent(this, Sexualidad.class);
        startActivity(sexualidad);
    }
    public void mitosytabus(View view) {
        Intent mitosytabus = new Intent(this, tabusMitos.class);
        startActivity(mitosytabus);
    }
    public void contacto(View view){
        Intent contacto=new Intent(this, contacto.class);
        startActivity(contacto);
    }
    public void salir(View view){
        Intent salir=new Intent(this, MainActivity.class);
        startActivity(salir);
    }
}