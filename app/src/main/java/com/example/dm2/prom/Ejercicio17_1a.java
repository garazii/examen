package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio17_1a extends AppCompatActivity {

    private TextView txt;
    private Button aceptar;
    private Button rechazar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_1a);

        txt = (TextView)findViewById(R.id.txt);
        aceptar = (Button) findViewById(R.id.btnacep);
        rechazar = (Button) findViewById(R.id.btnrecha);

        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("nombre");
        String ape = extras.getString("apellidos");

        txt.setText("Hola "+nom+" "+ape+" ¿ACEPTAS las condiciones?");
    }

    public void aceptar(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("condicion", "ACEPTADO");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void rechazar(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("condicion", "RECHAZADO");
        setResult(RESULT_OK, intent);
        finish();
    }
}
