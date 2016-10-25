package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio17_2a extends AppCompatActivity {

    private TextView opc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_2a);
        opc = (TextView) findViewById(R.id.opc);

        Bundle extras = getIntent().getExtras();
        String str = extras.getString("opcion");

        opc.setText(getString(R.string.opcion)+" "+str);
    }

    public void volver(View v)
    {
        Intent intent = new Intent(Ejercicio17_2a.this, Ejercicio17_2.class);
        startActivity(intent);
    }
}
