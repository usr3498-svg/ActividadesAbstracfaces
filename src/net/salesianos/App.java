import java.util.Scanner;

import CalculoGeometrico.Circulo;
import CalculoGeometrico.Rectangulo;
import Vehiculos.CocheCombustion;

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
        System.out.println("_________________________________________________________________");

        CocheCombustion coche = new CocheCombustion("Blanco", 4, 4, "Ford Fiesta", "1986AZB", 20 ); 

        System.out.println("Intento mover el coche sin arrancar:");
        coche.mover();
        System.out.println("------------");

        
        
        System.out.println("Arranco el coche:");
        coche.arrancar(); 
                System.out.println("------------");
        
        System.out.println("Muevo el coche varias veces:");
        coche.mover(); 
        coche.mover(); 
        coche.mover();
        coche.mover();
        coche.mover();
        System.out.println("------------");
       
        System.out.println("Combustible restante: " + coche.getLitrosCombustible());
        System.out.println("------------");
      
        System.out.println("Me roban la gasolina y me dejan solo 2 de combustible:");
        coche.setLitrosCombustible(2);
        System.out.println("------------");

        System.out.println("Muevo el coche 3 veces más:");
        coche.mover(); 
        coche.mover();
        coche.mover(); 


    }

}
