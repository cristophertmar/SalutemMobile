package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ConsultaOnline extends AppCompatActivity {

    TextView tv_mostrar, tv_ocultar, tv_salir;
    LinearLayout ly_informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_consulta_online );

        tv_mostrar = findViewById( R.id.tv_mostrar );
        tv_ocultar = findViewById( R.id.tv_ocultar );
        tv_salir = findViewById( R.id.tv_salir );
        ly_informacion = findViewById( R.id.ly_informacion );

        tv_ocultar.setPaintFlags(tv_ocultar.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv_salir.setPaintFlags(tv_salir.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        tv_mostrar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_ocultar.setVisibility( View.VISIBLE );
                ly_informacion.setVisibility( View.VISIBLE );
                tv_mostrar.setVisibility( View.GONE );
            }
        } );

        tv_ocultar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_ocultar.setVisibility( View.GONE );
                ly_informacion.setVisibility( View.GONE );
                tv_mostrar.setVisibility( View.VISIBLE );
            }
        } );


    }
}