package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class Horarios extends AppCompatActivity {

    Spinner sp_medico;
    EditText et_fecha;
    Button btn_editarFiltros, btn_buscar;
    LinearLayout ly_filtros;
    TextView tv_cerrarFiltro;

    Dialog curriculum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_horarios );

        curriculum = new Dialog( this );

        sp_medico = findViewById( R.id.sp_medico );
        et_fecha = findViewById( R.id.et_fecha );
        btn_editarFiltros = findViewById( R.id.btn_editarFiltros );
        ly_filtros = findViewById( R.id.ly_filtros );
        btn_buscar = findViewById( R.id.btn_buscar );
        tv_cerrarFiltro = findViewById( R.id.tv_cerrarFiltro );

        et_fecha.setFocusable(false);
        et_fecha.setKeyListener(null);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this, R.array.Medicos, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        sp_medico.setAdapter( adapter );

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);


        et_fecha.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog( Horarios.this, new DatePickerDialog.OnDateSetListener() {
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

    public void seleccionarHorario( View v) {
        Intent intent = new Intent( Horarios.this, DatosPaciente.class );
        startActivity(intent);
        finish();
    }

    public void mostrarPopup( View v){
        TextView txtClose;
        curriculum.setContentView( R.layout.custompoppup );

        txtClose = (TextView) curriculum.findViewById( R.id.txtClose );

        txtClose.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curriculum.dismiss();
            }
        } );

        curriculum.show();
    }
}