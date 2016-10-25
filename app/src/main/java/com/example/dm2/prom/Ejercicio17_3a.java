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

        String mensaje;

        result = (TextView) findViewById(R.id.result);


        Bundle extras = getIntent().getExtras();
        Integer n1 = Integer.parseInt(extras.getString("n1"));
        Integer n2 = Integer.parseInt(extras.getString("n2"));
        Integer resp = Integer.parseInt(extras.getString("resp"));

        if((n1+n2)==resp)
        {
            result.setText(getString(R.string.result)+" CORRECTA");
            mensaje="correcto";
        }
        else
        {
            result.setText(getString(R.string.result)+" INCORRECTA");
            mensaje="incorrecto";
        }

        Intent intent = new Intent();
        intent.putExtra("opcion", mensaje);
        setResult(RESULT_OK, intent);
    }

    public void volver(View v)
    {
        finish();
    }
}
