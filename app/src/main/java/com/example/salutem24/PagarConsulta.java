package com.example.salutem24;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.whiteelephant.monthpicker.MonthPickerDialog;

import java.util.Calendar;

public class PagarConsulta extends AppCompatActivity {

    EditText et_fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pagar_consulta );

        et_fecha = findViewById( R.id.et_fecha );
        et_fecha.setFocusable(false);
        et_fecha.setKeyListener(null);
    }

    public void MonthYearShow( View view ) {
        final Calendar today = Calendar.getInstance();

        MonthPickerDialog.Builder builder = new MonthPickerDialog.Builder(PagarConsulta.this,
                new MonthPickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(int selectedMonth, int selectedYear) {
                        et_fecha.setText( (selectedMonth+1) + "/" + selectedYear );
                    }
                    }, today.get(Calendar.YEAR), today.get(Calendar.MONTH));

        builder.setActivatedMonth(Calendar.JULY)
                .setMinYear(today.get(Calendar.YEAR))
                .setActivatedYear(today.get(Calendar.YEAR))
                .setMaxYear(today.get(Calendar.YEAR) + 10)
                .setTitle("Selecciona mes y año")
                .build()
                .show();



    }





}