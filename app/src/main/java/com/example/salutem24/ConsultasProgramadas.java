package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConsultasProgramadas extends AppCompatActivity {

    TextView tv_cerrarFiltro;
    Button btn_editarFiltros, btn_buscar;
    LinearLayout ly_filtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_consultas_programadas );

        tv_cerrarFiltro = findViewById( R.id.tv_cerrarFiltro );
        btn_editarFiltros = findViewById( R.id.btn_editarFiltros );
        btn_buscar = findViewById( R.id.btn_buscar );
        ly_filtros = findViewById( R.id.ly_filtros );

        btn_editarFiltros.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly_filtros.setVisibility( View.VISIBLE );
                btn_editarFiltros.setVisibility( View.GONE );
            }
        } );

        btn_buscar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly_filtros.setVisibility( View.GONE );
                btn_editarFiltros.setVisibility( View.VISIBLE );
            }
        } );

        tv_cerrarFiltro.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ly_filtros.setVisibility( View.GONE );
                btn_editarFiltros.setVisibility( View.VISIBLE );
            }
        } );

    }


    public void ingresarConsulta( View v) {
        Intent intent = new Intent( ConsultasProgramadas.this, ConsultaOnline.class );
        startActivity(intent);
        finish();
    }



}