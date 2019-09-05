package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Rombo extends AppCompatActivity {

    private EditText etDiagonal,etResultado,etLado;
    private Button btnCalcular;
    private RadioButton rbArea,rbPerimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);


        etDiagonal = (EditText) findViewById(R.id.etDiagonal);
        etLado = (EditText)findViewById(R.id.etLado);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        rbArea = (RadioButton) findViewById(R.id.rbArea);
        rbPerimetro  = (RadioButton) findViewById(R.id.rbPerimetro);


        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {





                if (rbArea.isChecked() == true){
                    double diagonal = Double.parseDouble(etDiagonal.getText().toString());
                    etResultado.setText(""+((Math.ceil(diagonal*diagonal))));
                }
                if (rbPerimetro.isChecked() == true){
                    double lado = Double.parseDouble(etLado.getText().toString());
                    etResultado.setText(""+(Math.ceil(4*lado)));
                }


            }
        });


    }
}
