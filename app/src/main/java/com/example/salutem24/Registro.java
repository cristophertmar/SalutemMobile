package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    Dialog terminos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registro );

        terminos = new Dialog( this );
    }

    public void mostrarTerminos( View v){
        TextView txtClose;
        terminos.setContentView( R.layout.terminos_condiciones );

        txtClose = (TextView) terminos.findViewById( R.id.txtClose );

        txtClose.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terminos.dismiss();
            }
        } );

        terminos.show();
    }

}