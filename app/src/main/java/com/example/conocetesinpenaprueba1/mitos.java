package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class mitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitos);
    }
    public void volver(View view) {
        Intent go = new Intent(this, tabusMitos.class);
        startActivity(go);
    }
    public void seleccion(View view){
        switch(view.getId()) {
            case R.id.b1:
                Toast.makeText(this, "¡FALSO! Aumenta el riesgo de ruptura o de que se pueda salir. Solo uno bien utilizado basta para que cumpla su función", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b2m:
                Toast.makeText(this, "¡FALSO! No es eficaz, si se toma después de la ovulación, pues no impide que el ovulo fecundado se anide en el útero materno", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b3:
                Toast.makeText(this, "¡CUIDADO! El líquido preseminal también contiene espermatozoides funcionales que pueden fecundar el óvulo.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b4:
                Toast.makeText(this, "Esto no es un método anticonceptivo. Puedes quedar embarazada desde la menarquia", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b5:
                Toast.makeText(this, "¡NO TE EQUIVOQUES! La presión del agua de la ducha tras el coito NO ELIMINA LOS ESPERMATOZOIDES. TODO LO CONTRARIO, los impulsa hacia el cuello útero", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b6:
                Toast.makeText(this, "EVITA RIESGOS, durante la menstruación también eres fértil", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b7:
                Toast.makeText(this, "¡FALSO!. Y es que el condón no disminuye ni afecta el placer sexual, mucho menos si recurrimos a los nuevos modelos que existen en el mercado", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b8:
                Toast.makeText(this, "No todas las mujeres sangran en su primera relación sexual penetrativa, ni a todas les resulta dolorosa e incómoda", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b9:
                Toast.makeText(this, "¡El tamaño no importa! Tu desempeño sexual no está ligado al tamaño o belleza de tus genitales, empieza por mejorar tu autoestima y cuidar tu cuerpo.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.b10:
                Toast.makeText(this, "¡Nada que ver! No es probable que la masturbación frecuente afecte la fertilidad en los hombres.", Toast.LENGTH_SHORT).show();
                break;

        }}
}