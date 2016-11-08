package com.example.dm2.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Ejercicio17_4 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidos;
    private RadioGroup grupo;
    private CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_4);

        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellidos);

    }

    public void enviar(View v)
    {
        if(nombre.getText().toString().equals("") || apellidos.getText().toString().equals(""))
        {
            Toast.makeText(this,"El nombre y el apellido no pueden estar vacios", Toast.LENGTH_LONG).show();
        }
        else
        {

        }
    }
}
