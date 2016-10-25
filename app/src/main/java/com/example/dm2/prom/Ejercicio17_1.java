package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio17_1 extends AppCompatActivity {

    private EditText txtnom;
    private EditText txtape;
    private TextView acept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_1);

        txtnom = (EditText)findViewById(R.id.txtnom);
        txtape = (EditText)findViewById(R.id.txtape);
        acept = (TextView) findViewById(R.id.acept);
    }

    public void verificar(View v)
    {
        Intent intent = new Intent(Ejercicio17_1.this, Ejercicio17_1a.class);
        intent.putExtra("nombre",txtnom.getText().toString());
        intent.putExtra("apellidos",txtape.getText().toString());
        startActivityForResult(intent, 1);
    }

    protected  void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        if (requestCode==1 && resultCode==RESULT_OK)
        {
            String condi = data.getExtras().getString("condicion");
            acept.setText(getString(R.string.condicion)+condi);
        }
    }

    public void volver(View v)
    {
        finish();
    }
}
