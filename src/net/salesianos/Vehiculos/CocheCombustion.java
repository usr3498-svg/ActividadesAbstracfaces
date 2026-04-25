package Vehiculos;

public class CocheCombustion extends Vehiculo {

    private boolean motorEncendido;
    private double litrosCombustible; // DEMASIADO CARO

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula,
            double litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
        // DUDA PARA CORRECCIÓN:
        // En estos casos seria mejor la opción falsa ya que el coche
        // deberia estar apagado de primeras no?
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;

    }

    public void setLitrosCombustible(double litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible > 0) {
            motorEncendido = true;
            litrosCombustible--;
            System.out.println("El coche encendio, lo que queda en el deposito es " + litrosCombustible);
        } else {
            motorEncendido = false; // DEBERIA ESCRIBIRLO O CON EL PREDETERMINADO BASTA ¿?
            System.out.println("No queda combustible pibe a gastar 50€ el litro");

        }
    }

    public void pararMotor() {
    motorEncendido = false;
    System.out.println("El motor se ha detenido.");
}

    @Override
    public void mover() {
        if (motorEncendido = false) {
            System.out.println("No queda combustible mi niño");
            return;
        }

        if (litrosCombustible <= 0) { 
            System.out.println("No hay combustible, el coche no furula."); 
            motorEncendido = false; 
            return; 
        }

        litrosCombustible--; 
        System.out.println("La palo... digo el coche funcha. Combustible restante: " + litrosCombustible);
    }
    


}
