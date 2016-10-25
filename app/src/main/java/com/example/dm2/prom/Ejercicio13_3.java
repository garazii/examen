package com.example.dm2.prom;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ejercicio13_3 extends AppCompatActivity {

    private LinearLayout fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13_3);

        fondo = (LinearLayout) findViewById(R.id.fondo);
    }

    public void encender(View v)
    {
        fondo.setBackgroundColor(Color.YELLOW);
    }
    public void apagar(View v)
    {
        fondo.setBackgroundColor(Color.GRAY);
    }
}
