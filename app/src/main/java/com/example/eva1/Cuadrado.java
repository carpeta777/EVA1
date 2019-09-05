package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Cuadrado extends AppCompatActivity {

    private EditText etLado,etResultado;
    private Button btnCalcular;
    private RadioButton rbArea,rbPerimetro,rbDiagonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);



        etLado = (EditText) findViewById(R.id.etLado);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        rbArea = (RadioButton) findViewById(R.id.rbArea);
        rbDiagonal  = (RadioButton) findViewById(R.id.rbDiagonal);
        rbPerimetro  = (RadioButton) findViewById(R.id.rbPerimetro);






        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double lado = Double.parseDouble(etLado.getText().toString());


                if (rbArea.isChecked() == true){
                    etResultado.setText(""+(Math.ceil(lado*lado)));
                }
                if (rbPerimetro.isChecked() == true){
                    etResultado.setText(""+(Math.ceil(lado*4)));
                }

                if (rbDiagonal.isChecked() == true){
                    etResultado.setText(""+(Math.ceil(Math.sqrt(Math.pow(lado,2)+Math.pow(lado,2)))));
                }
            }
        });
    }

}
