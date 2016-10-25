package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.widget.Toast;
import android.view.View;

public class Ejercicio17_3 extends AppCompatActivity {

    private EditText txtnum1;
    private EditText txtnum2;
    private EditText txtres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_3);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        txtres = (EditText) findViewById(R.id.txtres);

        int num1 = (int) (Math.random()*100+1);
        txtnum1.setText(String.valueOf(num1));
        int num2 = (int) (Math.random()*100+1);
        txtnum2.setText(String.valueOf(num2));
    }

    public void comprobar(View v)
    {
        if(txtres.getText().toString().equals(""))
        {
            Toast.makeText(this,"Introduce un resultado", Toast.LENGTH_LONG).show();

        }
        else
        {
            int n1 = Integer.parseInt(txtnum1.getText().toString());
            int n2 = Integer.parseInt(txtnum2.getText().toString());
            int sum = n1+n2;
            if (sum==Integer.parseInt(txtres.getText().toString()))
            {
                Intent intent = new Intent(Ejercicio17_3.this, Ejercicio17_3a.class);
                intent.putExtra("result", "CORRECTA");
                startActivity(intent);
            }
            else
            {
                Intent intent = new Intent(Ejercicio17_3.this, Ejercicio17_3a.class);
                intent.putExtra("result", "INCORRECTA");
                startActivity(intent);
            }
        }
    }
}
