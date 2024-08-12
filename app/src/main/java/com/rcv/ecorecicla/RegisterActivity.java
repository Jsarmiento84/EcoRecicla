package com.rcv.ecorecicla;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {
    Button aceptatar_terminos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        aceptatar_terminos = findViewById(R.id.btn_Aceptar_termino);
        aceptatar_terminos.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, TerminosActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Estas en aceptar terminos y condiciones", Toast.LENGTH_SHORT).show();
        });



    }




}