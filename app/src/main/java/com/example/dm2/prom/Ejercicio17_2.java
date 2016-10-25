package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio17_2 extends AppCompatActivity {

    private EditText txtusu;
    private EditText txtcontr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_2);

        txtusu = (EditText) findViewById(R.id.txtusu);
        txtcontr = (EditText) findViewById(R.id.txtcontr);
    }

    public void iniciar(View v)
    {
        if(txtusu.getText().toString().equals("") || txtcontr.getText().toString().equals(""))
        {
            Toast.makeText(this,"El usuario y/o la contraseña no pueden estar vacios", Toast.LENGTH_LONG).show();
        }
        else {
            if (txtusu.getText().toString().equals("garazi") && txtcontr.getText().toString().equals("1234")) {
                Intent intent = new Intent(Ejercicio17_2.this, Ejercicio17_2a.class);
                intent.putExtra("opcion", "El usuario y la password son CORRECTAS");
                startActivity(intent);
            } else {
                Intent intent = new Intent(Ejercicio17_2.this, Ejercicio17_2a.class);
                intent.putExtra("opcion", "Usuario y/o password INCORRECTAS");
                startActivity(intent);
            }
        }
    }
}
