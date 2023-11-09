package com.example.sqlitecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);
    }

    public void ListaPaciente (View view) {
        Intent listaPaciente = new Intent (this, MainActivity.class);
        startActivity(listaPaciente);
    }
    public void GPSMapasClinica (View view) {
        Intent gpsMapasClinica = new Intent (this, GPSMapas.class);
        startActivity(gpsMapasClinica);
    }
    public void CrearPacienteClinic (View view) {
        Intent crearPaciente = new Intent (this, MainActivity.class);
        startActivity(crearPaciente);
    }
}