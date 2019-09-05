package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button  btnCuadrado,btnRectangulo,btnCirculo,btnTriangulo,btnRombo,btnQS ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCuadrado =(Button) findViewById(R.id.btnCuadrado);
        btnRectangulo =(Button) findViewById(R.id.btnRectangulo);
        btnCirculo =(Button) findViewById(R.id.btnCirculo);
        btnTriangulo =(Button) findViewById(R.id.btnTriangulo);
        btnRombo =(Button) findViewById(R.id.btnRombo);
        btnQS = (Button) findViewById(R.id.btnQS);


        btnCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Cuadrado.class);
                startActivityForResult(intent, 0);

            }
        });


        btnRectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Rectangulo.class);
                startActivityForResult(intent, 0);

            }
        });

        btnCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Circulo.class);
                startActivityForResult(intent, 0);

            }
        });


        btnTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Triangulo.class);
                startActivityForResult(intent, 0);
            }
        });


        btnRombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Rombo.class);
                startActivityForResult(intent, 0);

            }
        });

        btnQS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), QuienesSomos.class);
                startActivityForResult(intent, 0);

            }
        });


    }


}
