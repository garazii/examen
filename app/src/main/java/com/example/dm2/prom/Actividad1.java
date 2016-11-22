package com.example.dm2.prom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText txtnum1;
    private EditText txtnum2;
    private EditText txtres;
    private Spinner provincias;
    private EditText nombre;
    private RadioButton masc;
    private RadioButton fem;
    private CheckBox cbp;
    private CheckBox cbj;
    private CheckBox cbh;
    private CheckBox cbc;
    private int cont=0;
    private String prov;
    private int contcand=0;
    private TextView cand;
    private Button evaluar,salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        txtres = (EditText) findViewById(R.id.txtres);
        nombre = (EditText) findViewById(R.id.nombre);
        provincias = (Spinner) findViewById(R.id.provincias);
        masc = (RadioButton) findViewById(R.id.masc);
        fem = (RadioButton) findViewById(R.id.fem);
        cbp = (CheckBox) findViewById(R.id.cbphp);
        cbj = (CheckBox) findViewById(R.id.cbjava);
        cbh = (CheckBox) findViewById(R.id.cbhtml);
        cbc = (CheckBox) findViewById(R.id.cbcss);
        cand = (TextView) findViewById(R.id.cand);
        evaluar = (Button) findViewById(R.id.evaluar);
        salir = (Button) findViewById(R.id.salir);

        final String[] datos = new String[] {"Alava","Bizkaia","Gipuzkoa"};
        ArrayAdapter<String> adap = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);

        adap.setDropDownViewResource(android.R.layout.simple_spinner_item);
        provincias.setAdapter(adap);
        provincias.setOnItemSelectedListener(this);

        random();
    }

    public  void onItemSelected(AdapterView<?> adapterView,View v,int pos, long l)
    {
        TextView  tv=(TextView) v;
        prov= tv.getText().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void random()
    {
        int num1 = (int) (Math.random()*100+1);
        txtnum1.setText(String.valueOf(num1));
        int num2 = (int) (Math.random()*100+1);
        txtnum2.setText(String.valueOf(num2));
        txtres.setText("");
    }


    public void evaluar(View v)
    {
        if(txtres.getText().toString().equals("")||nombre.getText().toString().equals(""))
        {
            Toast.makeText(this,"Introduce los valores obligatorios", Toast.LENGTH_LONG).show();
        }
        else
        {
            Integer n1 = Integer.parseInt(txtnum1.getText().toString());
            Integer n2 = Integer.parseInt(txtnum2.getText().toString());
            Integer resp = Integer.parseInt(txtres.getText().toString());
            if((n1+n2)==resp) {
                Intent intent = new Intent(Actividad1.this, Actividad1b.class);
                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("provincia",prov);
                if (masc.isChecked()) {
                    intent.putExtra("sexo", masc.getText().toString());
                } else {
                    intent.putExtra("sexo", fem.getText().toString());
                }
                if (cbp.isChecked()) {
                    intent.putExtra("php", cbp.getText().toString());
                }
                if (cbj.isChecked()) {
                    intent.putExtra("java", cbj.getText().toString());
                }
                if (cbh.isChecked()) {
                    intent.putExtra("html", cbh.getText().toString());
                }
                if (cbc.isChecked()) {
                    intent.putExtra("css", cbc.getText().toString());
                }

                startActivityForResult(intent,1);
            }
            else
            {
                Toast.makeText(this,"El resultado de la operacion no es correcto", Toast.LENGTH_LONG).show();
                cont++;
                if(cont==3)
                {
                    Toast.makeText(this,"3 intentos fallidos", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        }
    }


    protected  void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        if (requestCode==1 && resultCode==RESULT_OK)
        {
            random();
            String opc = data.getExtras().getString("opcion");

            if(opc.equalsIgnoreCase("aceptar"))
            {
                contcand++;
            }
            cand.setText("Candidatos: "+contcand);
            if(contcand==4)
            {
                evaluar.setVisibility(View.INVISIBLE);
                salir.setVisibility(View.VISIBLE);
            }
        }
    }

    public void salir(View v){
        finish();
    }
}
