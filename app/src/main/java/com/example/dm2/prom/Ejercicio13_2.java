package com.example.dm2.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Ejercicio13_2 extends AppCompatActivity {

    private EditText txtprimer;
    private EditText txtsegun;
    private TextView txtresult;
    private Button btnsuma;
    private Button btnresta;
    private Button btnpor;
    private Button btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13_2);
        txtprimer = (EditText) findViewById(R.id.txtprimer);
        txtsegun = (EditText) findViewById(R.id.txtsegun);
        txtresult = (TextView) findViewById(R.id.txtresult);

    }
    public void operar(View v)
    {
        Button btn= (Button)v;
        if (btn.getText().toString().equals("+"))
        {
            txtresult.setText("RESULTADO: "+(Double.parseDouble(txtprimer.getText().toString())+Double.parseDouble(txtsegun.getText().toString())));
        }
        else if (btn.getText().toString().equals("-"))
        {
            txtresult.setText("RESULTADO: "+(Double.parseDouble(txtprimer.getText().toString())-Double.parseDouble(txtsegun.getText().toString())));
        }
        else if (btn.getText().toString().equals("*"))
        {
            txtresult.setText("RESULTADO: "+(Double.parseDouble(txtprimer.getText().toString())*Double.parseDouble(txtsegun.getText().toString())));
        }
        else if (btn.getText().toString().equals("/"))
        {
            txtresult.setText("RESULTADO: "+(Double.parseDouble(txtprimer.getText().toString())/Double.parseDouble(txtsegun.getText().toString())));
        }
    }
}
