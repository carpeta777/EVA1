package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Circulo extends AppCompatActivity {

    private EditText etRadio,etResultado;
    private Button btnCalcular;
    private RadioButton rbArea,rbPerimetro,rbDiagonal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);




        etRadio = (EditText) findViewById(R.id.etLado);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        rbArea = (RadioButton) findViewById(R.id.rbArea);
        rbDiagonal  = (RadioButton) findViewById(R.id.rbDiagonal);
        rbPerimetro  = (RadioButton) findViewById(R.id.rbPerimetro);






        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double radio = Double.parseDouble(etRadio.getText().toString());


                if (rbArea.isChecked() == true){
                    etResultado.setText(""+(3.14*(Math.ceil(Math.pow(radio,2)))));
                }
                if (rbPerimetro.isChecked() == true){
                    etResultado.setText(""+(Math.ceil(2*3.14*radio)));
                }

                if (rbDiagonal.isChecked() == true){
                    etResultado.setText(""+(Math.ceil(2*radio)));
                }
            }
        });
    }
    }

