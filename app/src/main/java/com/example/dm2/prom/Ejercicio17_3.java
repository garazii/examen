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
    private TextView preg;
    private int contcorrec;
    private int contincorrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_3);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        txtres = (EditText) findViewById(R.id.txtres);
        preg = (TextView) findViewById(R.id.preg);

        random();

        contcorrec=0;
        contincorrec=0;
    }

    private void random()
    {
        int num1 = (int) (Math.random()*100+1);
        txtnum1.setText(String.valueOf(num1));
        int num2 = (int) (Math.random()*100+1);
        txtnum2.setText(String.valueOf(num2));
        txtres.setText("");
    }

    public void comprobar(View v)
    {
        if(txtres.getText().toString().equals(""))
        {
            Toast.makeText(this,"Introduce un resultado", Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent intent = new Intent(Ejercicio17_3.this, Ejercicio17_3a.class);
            intent.putExtra("n1",txtnum1.getText().toString());
            intent.putExtra("n2",txtnum2.getText().toString());
            intent.putExtra("resp",txtres.getText().toString());

            startActivityForResult(intent,1);
        }
    }

    protected  void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        if (requestCode==1 && resultCode==RESULT_OK)
        {
            random();
            String opc = data.getExtras().getString("opcion");

            if(opc.equalsIgnoreCase("correcto"))
            {
                contcorrec++;
            }
            else
            {
                contincorrec++;
            }
            preg.setText("Preguntas correctas: "+contcorrec+" incorrectas: "+contincorrec);
        }

    }
}
