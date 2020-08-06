package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Especialidad extends AppCompatActivity {

    /*LinearLayout ly_general;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_especialidad );


        /*ly_general = findViewById( R.id.ly_general );

        ly_general.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Especialidad.this, Horarios.class);
                startActivity( intent );
                finish();
            }
        } );*/





    }

    public void seleccionarEspecialidad( View v) {
        Intent intent = new Intent( Especialidad.this, Horarios.class);
        startActivity( intent );
        finish();
    }

}