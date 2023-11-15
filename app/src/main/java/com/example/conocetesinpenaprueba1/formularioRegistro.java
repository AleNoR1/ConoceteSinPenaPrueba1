package com.example.conocetesinpenaprueba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.chip.Chip;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class formularioRegistro extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText correo;
    private EditText contrasena;
    private EditText año1;
    private EditText año2;
    private Integer a1=0,a2=0;
    private CheckBox check1;
    private Chip chip1,chip2,chip3,chip4,chip5,chip6;
    String c1,c2,c3,c4;

    public void onStart() {
        super.onStart();  //parte del firebase para conectar la valación de la aplicacion
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);
        mAuth = FirebaseAuth.getInstance();
        correo=findViewById(R.id.usuarioRegistro);
        contrasena=findViewById(R.id.passwordRegistro);
        año1=findViewById(R.id.curp4); //indica primer parte del año en la curp
        año2=findViewById(R.id.curp5);//indica segunda parte del año de la curp
        check1=findViewById(R.id.checkBox);
        chip1=findViewById(R.id.chip4);
        chip2=findViewById(R.id.chip5);
        chip3=findViewById(R.id.chip6);
        chip4=findViewById(R.id.chip7);
        chip5=findViewById(R.id.chip8);
        chip6=findViewById(R.id.chip9);
    }

    public void validarEdad(View view){
       Integer a11=Integer.parseInt (a1+año1.getText().toString());
        Integer a12=Integer.parseInt (a2+año2.getText().toString());

        if ((a11 == 0 && a12==3)  || (a11 == 0 && a12==4)  || (a11 == 0 && a12==5) || (a11 == 0 && a12==6) || (a11 == 0 && a12==7) || (a11 == 0 && a12==8) || (a11 == 0 && a12==9) || (a11 == 1 && a12==0)){
                Toast.makeText(getApplicationContext(), "ADOLESCENTE :D.",Toast.LENGTH_SHORT).show();

        }//cierre de if a11
        else {
            Toast.makeText(getApplicationContext(), "NO ERES ADOLESCENTE :C.",Toast.LENGTH_SHORT).show();
            Intent salir = new Intent(this, MainActivity.class);
            startActivity(salir);
            Toast.makeText(getApplicationContext(), "LO SENTIMOS NO CUMPLE LA EDAD PARA SER USUARIO",Toast.LENGTH_SHORT).show();
        }//cierre else
    }
    public void registrarUsuario(View view){

        if (check1.isChecked()==true){ //verificar que se aceptan los terminos y condiciones de lo contrario no puede generar la cuenta

        mAuth.createUserWithEmailAndPassword(correo.getText().toString(), contrasena.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                           // Log.d(TAG, "createUserWithEmail:success");
                            Toast.makeText(getApplicationContext(), "Usuario creado.", Toast.LENGTH_SHORT).show();
                            FirebaseUser user = mAuth.getCurrentUser();

                            Intent i= new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                            if (chip1.isChecked()==true){//if de seleccion de genero
                                Toast.makeText(getApplicationContext(), "Bienvenida Amiga", Toast.LENGTH_SHORT).show();

                            }else if (chip2.isChecked()==true){
                                Toast.makeText(getApplicationContext(), "Bienvenido Amigo", Toast.LENGTH_SHORT).show();
                            }else{

                            }//fin de if de genero

                            
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }

                        // ...
                    }
                });

        }
        else{
            Toast.makeText(getApplicationContext(), "Debe aceptar los términos y condiciones.",
                    Toast.LENGTH_SHORT).show();
        }
    }
    public void terminos(View view){
        Intent go = new Intent(this, terminosCondiciones.class);
        startActivity(go);
    }

}