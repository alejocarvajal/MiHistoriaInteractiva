package com.cerok.mihistoriainteractiva.modelo;

/**
 * Created by cerok on 10/02/2017.
 */

public class Eleccion {
    private String mText;
    private int mProximaPagina;

    public Eleccion(String Text, int ProximaPagina){
        mText = Text;
        mProximaPagina = ProximaPagina;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getProximaPagina() {
        return mProximaPagina;
    }

    public void setProximaPagina(int proximaPagina) {
        mProximaPagina = proximaPagina;
    }
}
