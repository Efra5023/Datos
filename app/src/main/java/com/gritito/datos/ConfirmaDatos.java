package com.gritito.datos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmaDatos extends AppCompatActivity {

    private TextView ConfirmaNombre;
    private TextView ConfirmaFecha;
    private TextView ConfirmaTelefono;
    private TextView ConfirmaEmail;
    private TextView ConfirmaDescripcion;

    public View.OnClickListener botonedit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onBackPressed();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_datos);

        Bundle datos = getIntent().getExtras();
        String nombreC = datos.getString("NombreConf");
        int fechaDC = datos.getInt("FechaDConf");
        int fechaMC = datos.getInt("FechaMConf");
        int fechaAC = datos.getInt("FechaAConf");
        String telefonoC = datos.getString("TelefonoConf");
        String emailC = datos.getString("EmailConf");
        String descripcionC = datos.getString("DescripcionConf");

        ConfirmaNombre = (TextView) findViewById(R.id.ConfirmaNombre);
        ConfirmaFecha = (TextView) findViewById(R.id.ConfirmaFecha);
        ConfirmaTelefono = (TextView) findViewById(R.id.ConfirmaTelefono);
        ConfirmaEmail = (TextView) findViewById(R.id.ConfirmaEmail);
        ConfirmaDescripcion = (TextView) findViewById(R.id.ConfirmaDescripcion);

        ConfirmaNombre.setText(nombreC);
        if (fechaDC<=9){
            if (fechaMC<=9){
                ConfirmaFecha.setText("0" + fechaDC + "/0" + fechaMC + "/" + fechaAC);
            }
            else {
                ConfirmaFecha.setText("0" + fechaDC + "/" + fechaMC + "/" + fechaAC);
            }
        }
        else {
            if (fechaMC<=9){
                ConfirmaFecha.setText(fechaDC + "/0" + fechaMC + "/" + fechaAC);
            }
            else {
                ConfirmaFecha.setText(fechaDC + "/" + fechaMC + "/" + fechaAC);
            }
        }
        ConfirmaTelefono.setText(telefonoC);
        ConfirmaEmail.setText(emailC);
        ConfirmaDescripcion.setText(descripcionC);

        Button BotonEditar = (Button) findViewById(R.id.BotonEditar);
        BotonEditar.setOnClickListener(botonedit);
    }
}