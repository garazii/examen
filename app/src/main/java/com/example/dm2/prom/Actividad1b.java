package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad1b extends AppCompatActivity {

    private TextView nombre,provincia,sexo,conocimientos;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1b);



        nombre = (TextView) findViewById(R.id.nombre);
        provincia = (TextView) findViewById(R.id.provincia);
        sexo = (TextView) findViewById(R.id.sexo);
        conocimientos = (TextView) findViewById(R.id.conocimientos);

        Bundle extras = getIntent().getExtras();
        String nom = extras.getString("nombre");
        String prov = extras.getString("provincia");
        String sex = extras.getString("sexo");

        String php = "";
        String java = "";
        String html = "";
        String css = "";
        if(extras.getString("php")!=null)
        {
            php = extras.getString("php");
        }
        if(extras.getString("java")!=null)
        {
            java = extras.getString("java");
        }
        if(extras.getString("html")!=null)
        {
            html = extras.getString("html");
        }
        if(extras.getString("css")!=null)
        {
            css = extras.getString("css");
        }

        nombre.setText("Nombre: "+nom);
        provincia.setText("Provinica: "+prov);
        sexo.setText("Seco: "+sex);
        conocimientos.setText("Conociminetos: "+php+"\n"+java+"\n"+html+"\n"+css);

        intent = new Intent();


    }

    public void aceptar(View v) {
        intent.putExtra("opcion", "aceptar");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void rechazar(View v) {
        finish();
    }
}
