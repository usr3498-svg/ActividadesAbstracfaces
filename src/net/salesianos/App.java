import java.util.Scanner;

import CalculoGeometrico.Circulo;
import CalculoGeometrico.Rectangulo;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo");
        double base = sc.nextDouble();

        System.out.println("Introduce la altura del rectangulo");
        double altura = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("El perimetro del rectangulo es igual a: " + rectangulo.Perimetro());
        System.out.println("El area del rectangulo es igual a: " + rectangulo.Area());

        System.out.println("Introduce el radio del círculo:");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("El perimetro del circulo es igual a: " + circulo.Perimetro());
        System.out.println("El area del circulo es igual a: " + circulo.Area());


    }

}
