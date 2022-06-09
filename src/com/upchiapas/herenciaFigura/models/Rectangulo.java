package com.upchiapas.herenciaFigura.models;

public class Rectangulo extends Figura{
    private byte base;
    private byte altura;

    public byte getBase() {
        return base;
    }

    public void setBase(byte base) {
        this.base = base;
    }

    public byte getAltura() {
        return altura;
    }

    public void setAltura(byte altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        area = (float)(base * altura);
        return area;
    }
}
