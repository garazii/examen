package com.example.dm2.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Ejercicio13 extends AppCompatActivity {

    private EditText txtprimer;
    private EditText txtsegun;
    private TextView txtsuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13);

        txtprimer = (EditText) findViewById(R.id.txtprimer);
        txtsegun = (EditText) findViewById(R.id.txtsegun);
        txtsuma = (TextView) findViewById(R.id.txtsuma);
    }
    public void sumar(View v)
    {
        txtsuma.setText("La suma es: "+(Double.parseDouble(txtprimer.getText().toString())+Double.parseDouble(txtsegun.getText().toString())));
    }
}
