package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio17_3a extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_3a);

        Bundle extras = getIntent().getExtras();
        String str = extras.getString("result");

        result.setText(getString(R.string.result)+" "+str);
    }

    public void volver(View v)
    {
        Intent intent = new Intent(Ejercicio17_3a.this, Ejercicio17_3.class);
        startActivity(intent);
    }
}
