package com.example.dm2.prom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class Actividad2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
    }

    public void aniana(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cuadriladeanana.es/anana"));
        startActivity(intent);
    }
    public void mundaka(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mundaka.org"));
        startActivity(intent);
    }
    public void gernika(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cuadriladeanana.es/anana"));
        startActivity(intent);
    }
    public void laguardia(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cuadriladeanana.es/anana"));
        startActivity(intent);
    }

}
