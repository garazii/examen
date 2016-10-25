package com.example.dm2.prom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ejercicio13_5 extends AppCompatActivity implements Button.OnClickListener {

    private ImageView imglogo;
    private Button btnbi;
    private Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio13_5);
        imglogo = (ImageView)findViewById(R.id.imglogo);
        btnbi = (Button)findViewById(R.id.btnbi);
        btngo = (Button)findViewById(R.id.btngo);

        btnbi.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View v)
            {
                imglogo.setImageResource(R.drawable.bing);
            }
        });

        btngo.setOnClickListener(this);
    }

    public void clic(View v)
    {
        imglogo.setImageResource(R.drawable.yahoo);
    }

    public void onClick(View v)
    {
        imglogo.setImageResource(R.drawable.google);
    }
}
