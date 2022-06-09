package com.upchiapas.herenciaFigura.models;

public class Circulo extends Figura{
    private byte radio;

    public byte getRadio() {
        return radio;
    }

    public void setRadio(byte radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        // A = PI * r * r
        area = (float)(Math.PI * Math.pow((double)radio,2.0));
        return area;
    }
}
