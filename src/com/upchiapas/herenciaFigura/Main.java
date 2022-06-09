package com.upchiapas.herenciaFigura;

import com.upchiapas.herenciaFigura.models.*;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio((byte)5);
        System.out.println("Area círculo: " + circulo.calcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase((byte)10);
        triangulo.setAltura((byte)5);
        System.out.println("Area triangulo: " + triangulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase((byte)5);
        rectangulo.setAltura((byte)10);
        System.out.println("Area rectangulo: " + rectangulo.calcularArea());
    }

}
