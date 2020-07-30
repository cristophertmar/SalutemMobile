package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView tv_registro;
    Button bt_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        tv_registro = findViewById(R.id.tv_registro);
        bt_ingresar = findViewById(R.id.bt_ingresar);

        tv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(Login.this, Registro.class);
                startActivity(intent);
                finish();
            }
        });

        bt_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(Login.this, Especialidad.class);
                startActivity(intent);
                finish();
            }
        });



    }
}