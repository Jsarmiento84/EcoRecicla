package com.rcv.ecorecicla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Gestion_reciclajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_reciclaje);

        Button btn_estadisticas = findViewById(R.id.estadisticas);
        btn_estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EstadisticaActivity.class);
                startActivity(intent);
            }
        });

        Button btn_consejo = findViewById(R.id.consejo);
        btn_consejo.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ConsejoActivity.class);
            startActivity(intent);
        });



    }
}