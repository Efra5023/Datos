package com.gritito.datos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity{

    public View.OnClickListener botonSig = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,ConfirmaDatos.class);
            TextInputEditText NombreRec1 = (TextInputEditText) findViewById(R.id.InputTextNombre);
            DatePicker FechaRec1 = (DatePicker) findViewById(R.id.Date);
            TextInputEditText TelefonoRec1 = (TextInputEditText) findViewById(R.id.InputTextTelefono);
            TextInputEditText EmailRec1 = (TextInputEditText) findViewById(R.id.InputTextEmail);
            TextInputEditText DescripcionRec1 = (TextInputEditText) findViewById(R.id.InputTextDescripcion);
            String NombreRec = NombreRec1.getText().toString();
            int FechaDRec = FechaRec1.getDayOfMonth();
            int FechaMRec = FechaRec1.getMonth()+1;
            int FechaARec = FechaRec1.getYear();
            String TelefonoRec = TelefonoRec1.getText().toString();
            String EmailRec = EmailRec1.getText().toString();
            String DescripcionRec = DescripcionRec1.getText().toString();
            intent.putExtra("NombreConf", NombreRec);
            intent.putExtra("FechaDConf",FechaDRec);
            intent.putExtra("FechaMConf", FechaMRec);
            intent.putExtra("FechaAConf", FechaARec);
            intent.putExtra("TelefonoConf",TelefonoRec);
            intent.putExtra("EmailConf",EmailRec);
            intent.putExtra("DescripcionConf",DescripcionRec);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BotonSiguiente = (Button) findViewById(R.id.BotonSiguiente);
        BotonSiguiente.setOnClickListener(botonSig);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //setContentView(R.layout.activity_main);

        Button BotonSiguiente = (Button) findViewById(R.id.BotonSiguiente);
        BotonSiguiente.setOnClickListener(botonSig);
    }
}


