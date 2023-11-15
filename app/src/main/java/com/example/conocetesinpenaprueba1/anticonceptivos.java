package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class anticonceptivos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anticonceptivos);
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, menuInicio.class);
        startActivity(inicio);
    }
    public void seleccion(View view){
        switch(view.getId()){
            case R.id.condon:
                Toast.makeText(this,"El preservativo o condón es un dispositivo de barrera" +
                        " con forma de funda utilizado durante una relación sexual para reducir la probabilidad de embarazo" +
                        " o el contagio de infecciones de transmisión sexual.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.condonf:
                Toast.makeText(this,"El condón femenino brinda protección contra el embarazo y también contra las " +
                        "infecciones que se propagan durante el contacto sexual, como el VIH. ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.diu:
                Toast.makeText(this,"El dispositivo intrauterino de cobre (DIU) es un método anticonceptivo " +
                        "seguro y eficaz que sirve para evitar temporalmente un embarazo.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.implante:
                Toast.makeText(this,"El implante anticonceptivo es una varilla pequeña y delgada, del tamaño de un cerillo (fósforo). " +
                        "El implante libera hormonas en tu cuerpo que previenen el embarazo hasta por 5 años",Toast.LENGTH_SHORT).show();
                break;
            case R.id.inyeccion:
                Toast.makeText(this,"Las inyecciones anticonceptivas contienen hormonas similares a las producidas por la mujer, evitan temporalmente" +
                        " el embarazo ya que impiden la ovulación y hacen que el moco que se produce en el cuello de la matriz se vuelva muy espeso impidiendo el paso de los espermatozoides.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ligadura:
                Toast.makeText(this,"La ligadura de trompas es una cirugía para cerrar las trompas de Falopio de una mujer." +
                        "Las trompas de Falopio conectan los ovarios con el útero. Una mujer que se someta a esta cirugía ya no podrá quedar en embarazo.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.parche:
                Toast.makeText(this,"Es un parche de plástico delgado, cuadrado, el cual se pega a la piel y libera hormonas similares a las que produce la mujer, inhibiendo la ovulación y haciendo más espeso el moco del cuello del útero.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pildora:
                Toast.makeText(this,"Las pastillas anticonceptivas, son un método seguro y efectivo para evitar temporalmente el embarazo, contienen pequeñas cantidades de hormonas femeninas parecidas a las que produce el organismo de la mujer.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pastilladiadespues:
                Toast.makeText(this,"Se le conoce también como píldora del día siguiente. Es un método anticonceptivo que puedes utilizar sólo en casos de emergencia, para prevenir un embarazo no planeado, y se toma en los tres días siguientes de una relación sexual sin protección.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.vasectomia:
                Toast.makeText(this,"Consiste en una pequeña operación que se realiza sin bisturí, con anestesia local, haciendo una punción en la piel de la bolsa escrotal por arriba de donde se encuentran los testículos, a través de la cual se localizan, ligan y cortan los conductos deferentes, sitio por donde pasan los espermatozoides.",Toast.LENGTH_SHORT).show();
                break;
}
    }
}