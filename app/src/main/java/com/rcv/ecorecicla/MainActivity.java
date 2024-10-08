package com.rcv.ecorecicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registrar = findViewById(R.id.btn_register);
        btn_registrar.setOnClickListener(v -> {
            Intent intent_register = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent_register);
            Toast.makeText(getApplicationContext(),"Estas en registrarse", Toast.LENGTH_SHORT).show();
        });

        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gestion_reciclajeActivity.class);
                startActivity(intent);
            }
        });


    }
}