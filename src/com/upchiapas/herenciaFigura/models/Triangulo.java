package com.upchiapas.herenciaFigura.models;

public class Triangulo extends Figura{
    private byte base;
    private byte altura;

    public Triangulo() {
    }

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
        // A = b * a / 2
        area = (float) ((base * altura) / 2.0);
        return area;
    }
}
