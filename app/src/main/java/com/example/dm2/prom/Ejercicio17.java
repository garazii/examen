package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ejercicio17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17);
    }

    public void actividad1(View v)
    {
        Intent intent = new Intent(Ejercicio17.this, Ejercicio17_1.class);
        startActivity(intent);
    }
    public void actividad2(View v)
    {
        Intent intent = new Intent(Ejercicio17.this, Ejercicio17_2.class);
        startActivity(intent);
    }
    public void actividad3(View v)
    {
        Intent intent = new Intent(Ejercicio17.this, Ejercicio17_3.class);
        startActivity(intent);
    }/*
    public void actividad4(View v)
    {
        Intent intent = new Intent(Ejercicio17.this, Ejercicio17_4.class);
        startActivity(intent);
    }*/
}
