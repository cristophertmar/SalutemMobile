package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btn_especialidades, btn_consultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu );

        btn_especialidades = findViewById( R.id.btn_especialidades );
        btn_consultas = findViewById( R.id.btn_consultas );

        btn_especialidades.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Menu.this, Especialidad.class );
                startActivity(intent);
                finish();
            }
        } );

        btn_consultas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Menu.this, ConsultasProgramadas.class );
                startActivity(intent);
                finish();
            }
        } );

    }
}