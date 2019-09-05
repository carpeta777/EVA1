package com.example.eva1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Triangulo extends AppCompatActivity {


   private  Button btnE,btnI,btnEqu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        btnEqu =(Button)findViewById(R.id.btnEq);
        btnE =(Button)findViewById(R.id.btnEs);
        btnI =(Button)findViewById(R.id.btnI);

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivity(new Intent(Triangulo.this,TEs.class));
            }
        });

        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Triangulo.this,TEqui.class));
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), TIso.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
