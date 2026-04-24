package CalculoGeometrico;

public class Circulo implements Figura2d {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double Area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * radio;
    }

}