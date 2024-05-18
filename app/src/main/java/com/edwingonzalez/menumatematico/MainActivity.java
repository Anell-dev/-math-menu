package com.edwingonzalez.menumatematico;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//nuevo
import android.view.View;
import android.widget.Toast;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    CardView cardViewHipotenusa, cardViewCalificacion, cardViewEcuacion, cardViewArea, cardViewBisiesto, cardViewMayor, cardViewSuma, cardViewPrimo, cardViewFactorial, cardViewComingSoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardViewHipotenusa = findViewById(R.id.cardViewHipotenusa);
        cardViewCalificacion = findViewById(R.id.cardViewCalificacion);
        cardViewEcuacion = findViewById(R.id.cardViewEcuacion);
        cardViewArea = findViewById(R.id.cardViewArea);
        cardViewBisiesto = findViewById(R.id.cardViewBisiesto);
        cardViewMayor = findViewById(R.id.cardViewMayor);
        cardViewSuma = findViewById(R.id.cardViewSuma);
        cardViewPrimo = findViewById(R.id.cardViewPrimo);
        cardViewFactorial = findViewById(R.id.cardViewFactorial);
        cardViewComingSoon = findViewById(R.id.cardViewComingSoon);

        cardViewHipotenusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para el CardView de Hipotenusa
                Toast.makeText(MainActivity.this, "Hipotenusa seleccionada", Toast.LENGTH_SHORT).show();
                Intent intentHipotenusa = new Intent(MainActivity.this, Hipotenusa.class);
                startActivity(intentHipotenusa);
            }
        });

        cardViewCalificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Calificación seleccionada", Toast.LENGTH_SHORT).show();
                Intent intentCalificacion = new Intent(MainActivity.this, Calificacion.class);
                startActivity(intentCalificacion);
            }
        });

        cardViewEcuacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ecuación seleccionada", Toast.LENGTH_SHORT).show();
                Intent intentEcuacion = new Intent(MainActivity.this, Ecuacion.class);
                startActivity(intentEcuacion);
            }
        });

        cardViewArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Cálculo de Área seleccionado", Toast.LENGTH_SHORT).show();
                Intent intentArea = new Intent(MainActivity.this, Area.class);
                startActivity(intentArea);
            }
        });

        cardViewBisiesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Año Bisiesto seleccionado", Toast.LENGTH_SHORT).show();
                Intent intentBisiesto = new Intent(MainActivity.this, Bisiesto.class);
                startActivity(intentBisiesto);
            }
        });

        cardViewMayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Número Mayor seleccionado", Toast.LENGTH_SHORT).show();
                Intent intentMayor = new Intent(MainActivity.this, NumMayor.class);
                startActivity(intentMayor);
            }
        });

        cardViewSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Suma de Dígitos seleccionada", Toast.LENGTH_SHORT).show();
                Intent intentSuma = new Intent(MainActivity.this, SumDigitos.class);
                startActivity(intentSuma);
            }
        });

        cardViewPrimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Número Primo seleccionado", Toast.LENGTH_SHORT).show();
                Intent intentPrimo = new Intent(MainActivity.this, NumPrimo.class);
                startActivity(intentPrimo);
            }
        });

        cardViewFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Factorial seleccionado", Toast.LENGTH_SHORT).show();
                Intent intentFactorial = new Intent(MainActivity.this, Factorial.class);
                startActivity(intentFactorial);
            }
        });

        cardViewComingSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Próximamente...", Toast.LENGTH_SHORT).show();
            }
        });

    }
}