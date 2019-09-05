package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TEqui extends AppCompatActivity {

    private EditText etBase, etAltura,etLado1,etPerimetro,etResultado;
    private Button btnCalcular;
    private RadioButton rbArea, rbPerimetro, rbSemiperimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tequi);

        etLado1 = (EditText) findViewById(R.id.etLado1);

        etBase = (EditText) findViewById(R.id.etBase);
        etAltura = (EditText) findViewById(R.id.etAltura);
        etResultado = (EditText) findViewById(R.id.etResultado);
        etPerimetro = (EditText)findViewById(R.id.etPerimetro) ;
        rbArea = (RadioButton) findViewById(R.id.rbarea);
        rbSemiperimetro = (RadioButton) findViewById(R.id.rbSemiperimetro);
        rbPerimetro = (RadioButton) findViewById(R.id.rbPerimetro);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (rbArea.isChecked() == true){
                    //para sacar area
                    double base  = Double.parseDouble(etBase.getText().toString());
                    double altura = Double.parseDouble(etAltura.getText().toString());
                    Toast t = Toast.makeText(getApplicationContext(),"AREA = "+Math.ceil((base*altura)/2),Toast.LENGTH_LONG);
                    t.show();


                }

                if (rbPerimetro.isChecked() == true){
                    //para sacar perimetro
                    double lado1  = Double.parseDouble(etLado1.getText().toString());
                    Toast t = Toast.makeText(getApplicationContext(),"PERIMETRO = "+Math.ceil((lado1*3)),Toast.LENGTH_LONG);
                    t.show();


                }

                if (rbSemiperimetro.isChecked() == true){
                    //para sacar semiperimetro
                    double perimetro  = Double.parseDouble(etPerimetro.getText().toString());
                    Toast t = Toast.makeText(getApplicationContext(),"SEMIPERIMETRO = "+Math.ceil(perimetro/2),Toast.LENGTH_LONG);
                    t.show();


                }
            }
        });
    }
}
