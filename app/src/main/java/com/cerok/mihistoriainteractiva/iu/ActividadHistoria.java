package com.cerok.mihistoriainteractiva.iu;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cerok.mihistoriainteractiva.R;
import com.cerok.mihistoriainteractiva.modelo.Historia;
import com.cerok.mihistoriainteractiva.modelo.Pagina;

public class ActividadHistoria extends AppCompatActivity {
    public static String TAG = ActividadHistoria.class.getSimpleName();
    private Historia mHistoria = new Historia();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton1;
    private Button mButton2;
    private String mNombre;
    private Pagina mPaginaActual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_historia);
        Intent intento = getIntent();
        mNombre = intento.getStringExtra("nombre");
        if(mNombre == null){
            mNombre = "Amigo";
        }
        mImageView = (ImageView) findViewById(R.id.imagenHistoria);
        mTextView = (TextView) findViewById(R.id.textoHistoria);
        mButton1 = (Button) findViewById(R.id.botonEleccion1);
        mButton2 = (Button) findViewById(R.id.botonEleccion2);
        cargarPagina(0);
    }

    private void cargarPagina(int eleccion){
        mPaginaActual = mHistoria.getPagina(eleccion);
        Drawable drawable = getResources().getDrawable(mPaginaActual.getImagenId());
        mImageView.setImageDrawable(drawable);
        String textPagina = mPaginaActual.getText();
        textPagina = String.format(textPagina,mNombre);
        mTextView.setText(textPagina);


        if (mPaginaActual.isBand()){
            mButton1.setVisibility(View.INVISIBLE);
            mButton2.setText("VOLVER A EMPEZAR");
            mButton2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    finish();
                }
            });
        }else{
            mButton1.setText(mPaginaActual.getEleccion1().getText());
            mButton2.setText(mPaginaActual.getEleccion2().getText());
            mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int ProximaPagina =  mPaginaActual.getEleccion1().getProximaPagina();
                    cargarPagina(ProximaPagina);
                }
            });
            mButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int ProximaPagina =  mPaginaActual.getEleccion2().getProximaPagina();
                    cargarPagina(ProximaPagina);
                }
            });
        }
    }
}
