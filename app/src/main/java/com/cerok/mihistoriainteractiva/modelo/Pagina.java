package com.cerok.mihistoriainteractiva.modelo;

/**
 * Created by cerok on 10/02/2017.
 */

public class Pagina {
    private int mImagenId;
    private String mText;
    private Eleccion mEleccion1;
    private Eleccion mEleccion2;
    private boolean band = false;

    public boolean isBand() {
        return band;
    }

    public void setBand(boolean band) {
        this.band = band;
    }

    public Pagina(int imagenId, String Text, Eleccion Eleccion1, Eleccion Eleccion2){
        mImagenId=imagenId;
        mText=Text;
        mEleccion1=Eleccion1;
        mEleccion2=Eleccion2;
    }
    public Pagina(int imagenId, String Text){
        mImagenId=imagenId;
        mText=Text;
        mEleccion1=null;
        mEleccion2=null;
        band = true;
    }
    public int getImagenId() {
        return mImagenId;
    }

    public void setImagenId(int imagenId) {
        mImagenId = imagenId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Eleccion getEleccion1() {
        return mEleccion1;
    }

    public void setEleccion1(Eleccion eleccion1) {
        mEleccion1 = eleccion1;
    }

    public Eleccion getEleccion2() {
        return mEleccion2;
    }

    public void setEleccion2(Eleccion eleccion2) {
        mEleccion2 = eleccion2;
    }

}
