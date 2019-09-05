package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Rectangulo extends AppCompatActivity {

    private EditText etLado,etBase,etAltura,etLongitud,etAncho,etResultado;
    private Button btnCalcular;
    private RadioButton rbArea,rbPerimetro,rbDiagonal;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);


        etLado = (EditText) findViewById(R.id.etLado);
        etBase = (EditText) findViewById(R.id.etBase);
        etAltura= (EditText) findViewById(R.id.etAltura);
        etResultado = (EditText) findViewById(R.id.etResultado);
        etAncho = (EditText)findViewById(R.id.etAncho);
        etLongitud = (EditText) findViewById(R.id.etLognitud);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        rbArea = (RadioButton) findViewById(R.id.rbArea);
        rbDiagonal  = (RadioButton) findViewById(R.id.rbDiagonal);
        rbPerimetro  = (RadioButton) findViewById(R.id.rbPerimetro);












        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if (rbPerimetro.isChecked() == true){
                    //para sacar perimetro
                    double lado = Double.parseDouble(etLado.getText().toString());
                    etResultado.setText(""+((2*lado)+(2*lado)));
                }




                if (rbArea.isChecked() == true){
                    //para sacar area
                    double base  = Double.parseDouble(etBase.getText().toString());
                    double altura = Double.parseDouble(etAltura.getText().toString());
                    etResultado.setText(""+(base*altura));
                }

                if (rbDiagonal.isChecked() == true){
                    //sacar diagonal
                    double ancho = Double.parseDouble(etAncho.getText().toString());
                    double longuitud = Double.parseDouble(etLongitud.getText().toString());
                    etResultado.setText(""+(Math.sqrt(Math.pow(longuitud,2)+Math.pow(ancho,2))));
                }
            }
        });


    }



    }

