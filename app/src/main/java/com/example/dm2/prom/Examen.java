package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Examen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen);
    }


    public void act1(View v)
    {
        Intent intent = new Intent(Examen.this, Actividad1.class);
        startActivity(intent);
    }
    public void act2(View v)
    {
        Intent intent = new Intent(Examen.this, Actividad2.class);
        startActivity(intent);
    }
    public void act3(View v)
    {
        Toast.makeText(this,getString(R.string.toast), Toast.LENGTH_LONG).show();
    }
    public void fin(View v)
    {

    }
}
