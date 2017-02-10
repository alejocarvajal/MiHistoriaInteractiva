package com.cerok.mihistoriainteractiva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActividadHistoria extends AppCompatActivity {
    public static String TAG = ActividadHistoria.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_historia);
        Intent intento = getIntent();
        String nombre = intento.getStringExtra(getString(R.string.llave_nombre));
        if(nombre == null){
            nombre = "Amigo";
        }
        Log.d(TAG,nombre);
    }
}
