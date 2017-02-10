package com.cerok.mihistoriainteractiva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadPrincipal extends AppCompatActivity {
    private EditText mCampoNombre;
    private Button mBotonInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);
        mCampoNombre = (EditText) findViewById(R.id.NombreeditText);
        mBotonInicio = (Button) findViewById(R.id.botonInicio);
        mBotonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = mCampoNombre.getText().toString();
                Toast.makeText(ActividadPrincipal.this,nombre,Toast.LENGTH_LONG).show();
            }
        });
    }
}
