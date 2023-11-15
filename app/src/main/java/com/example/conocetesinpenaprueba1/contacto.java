package com.example.conocetesinpenaprueba1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class contacto extends AppCompatActivity {
private TextView t;
private Button _btn_link;
String _url="https://www.facebook.com/people/AxoloTec/100087379982916/";//declaración de la variable que contiene el link
    ///media player libreria de multimedia pesada
    //declaro variables
    Button play;
    SoundPool ap;
    int son_rep;
    //variables correo
    String correo="equipoaxolotec@gmail.com";
    String asunto="CONÓCETE SIN PENA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        //código para audio
        play=(Button)findViewById(R.id.pool);
        ap=new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        son_rep=ap.load(this,R.raw.audioapp,1);
        //fin codigo de audio
    }
    public void inicio(View view){
        Intent inicio=new Intent(this, menuInicio.class);
        startActivity(inicio);
    }
    public void facebook(View view){  //codigo para enlazar link a la cuenta oficial
        Uri _link=Uri.parse(_url);
        Intent i =new Intent(Intent.ACTION_VIEW,_link);
        startActivity(i);
    }
    public void AudioMediaPlayer(View view){//codigo para boton de reproducir spot
        MediaPlayer ap=MediaPlayer.create(this,R.raw.audioapp);
        ap.start();
    }
    public void gmail(View view){//codigo para enviar correo electronico al correo de la empresa axolotec
    //definir item y uso del objeto action send

    Intent intent=new Intent(Intent.ACTION_SEND);
    //definir valores de string con funcion put extra
   intent.putExtra(Intent.EXTRA_EMAIL,new String[]{correo}); //debe llevar el new String para poder insertarlo en la barra de correo :D
   intent.putExtra(Intent.EXTRA_SUBJECT,asunto);

    //ESTABLECER EL TIPO DE ITENT
    intent.setType("menssage/rfc822");
    //SELECTOR DE CLIENTE DE CORREOS
    startActivity(
            Intent.createChooser(intent, "elige un cliente de correo: "));
    }
    public void llamar(View arg0) {
        Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+522711081148"));
        //i.setData(Uri.parse("tel:+522711081148"));
        //startActivity(i);
       // if (ActivityCompat.checkSelfPermission(contacto.this, Manifest.permission.CALL_PHONE) !=
              //  PackageManager.PERMISSION_GRANTED)
           // return;
        startActivity(i);
    }
        }

