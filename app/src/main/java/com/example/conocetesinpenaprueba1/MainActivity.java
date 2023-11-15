package com.example.conocetesinpenaprueba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText correo,contrasena;
    private FirebaseAuth mAuth;

    public void enviar(View view){
        EditText usuario=findViewById(R.id.usuario);
        EditText password=findViewById(R.id.contrasena);

        Log.i("nombre:",usuario.getText().toString());
        Log.i( "password:",password.getText().toString());
        Toast.makeText( this, "save" + usuario.getText().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
         correo=findViewById(R.id.usuario);
         contrasena=findViewById(R.id.contrasena);
    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }
    public void siguiente(View view) {
        Intent siguiente = new Intent(this, menuInicio.class);
        startActivity(siguiente);
    }
    public void registrar(View view){
        Intent registrar=new Intent(this,formularioRegistro.class);
        startActivity(registrar);
    }
    public void iniciarSesion(View view){
        mAuth.signInWithEmailAndPassword(correo.getText().toString(), contrasena.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i= new Intent(getApplicationContext(),menuInicio.class);
                            startActivity(i);
                           // updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                           // Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                           // updateUI(null);
                        }

                        // ...
                    }
                });
    }
}