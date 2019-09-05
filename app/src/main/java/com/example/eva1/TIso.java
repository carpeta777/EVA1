package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TIso extends AppCompatActivity {

    private EditText etBase, etAltura,etLado1,etLado2,etPerimetro,etResultado;
    private Button btnCalcular;
    private RadioButton rbArea, rbPerimetro, rbSemiperimetro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiso);

        etLado1 = (EditText) findViewById(R.id.etLado1);
        etLado2 = (EditText) findViewById(R.id.etLado2);

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
                   etResultado.setText(""+(base*altura)/2);
                }

                if (rbPerimetro.isChecked() == true){
                    //para sacar perimetro
                    double lado1  = Double.parseDouble(etLado1.getText().toString());
                    double lado2  = Double.parseDouble(etLado2.getText().toString());
                    etResultado.setText(""+Math.ceil((lado1+lado2)*2));

                }

                if (rbSemiperimetro.isChecked() == true){
                    //para sacar semiperimetro
                    double perimetro  = Double.parseDouble(etPerimetro.getText().toString());

                    etResultado.setText(""+(perimetro/2));

                }
            }
        });
    }
}
