package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class DatosPaciente extends AppCompatActivity {

    Spinner sp_paciente, sp_genero;
    EditText et_fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_datos_paciente );

        sp_paciente = findViewById( R.id.sp_paciente );
        sp_genero = findViewById( R.id.sp_genero );
        et_fecha = findViewById( R.id.et_fecha );

        et_fecha.setFocusable(false);
        et_fecha.setKeyListener(null);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.Pacientes, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        sp_paciente.setAdapter( adapter );

        ArrayAdapter<CharSequence> adapterGenero = ArrayAdapter.createFromResource( this, R.array.Genero, android.R.layout.simple_spinner_item );
        adapterGenero.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        sp_genero.setAdapter( adapterGenero );

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        et_fecha.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog( DatosPaciente.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month + 1;
                        String date = day + "/" + month + "/" + year;
                        et_fecha.setText( date );
                    }
                }, year, month, day );
                datePickerDialog.show();
            }
        } );


    }
}