package com.example.dm2.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio13_4 extends AppCompatActivity {

    private EditText txtdni;
    private EditText txtletra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13_4);
        txtdni = (EditText) findViewById(R.id.txtdni);
        txtletra = (EditText) findViewById(R.id.txtletra);
    }

    public void validar(View v)
    {
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int pos=Integer.parseInt(txtdni.getText().toString())%23;
        char letra = letras.charAt(pos);

        if(txtletra.getText().toString().equalsIgnoreCase(String.valueOf(letra)))
        {
            Toast.makeText ( this,"DNI y letra correctos", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText ( this,"La letra no coincide con el DNI introducido", Toast.LENGTH_LONG).show();
        }
    }
}
