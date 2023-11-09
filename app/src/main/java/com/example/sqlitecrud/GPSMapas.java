package com.example.sqlitecrud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GPSMapas extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLongi, txtLati;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpsmapas);

        txtLati=findViewById(R.id.txtLatitud);
        txtLongi=findViewById(R.id.txtLongitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng ClinicaAlemana = new LatLng(-38.736733, -72.6136615);
        mMap.addMarker(new MarkerOptions().position(ClinicaAlemana).title("Clinica Alemana Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ClinicaAlemana));
    }

    @Override //Utilizan este metodo para manejar los eventos del click largo en el mapa
    public void onMapClick(@NonNull LatLng latLng) {
        txtLati.setText(""+latLng.latitude);
        txtLongi.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLati.setText(""+latLng.latitude);
        txtLongi.setText(""+latLng.longitude);
    }
}