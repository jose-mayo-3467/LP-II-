public class PruebaVehiculos {
   public static void probarVehiculo (Vehiculo vehiculo, double distancia) {
    System.out.println("\nProbando vehiculo de tipo " + vehiculo.getClass().getSimpleName() + " : ");
    vehiculo.mover(distancia);
    System.out.println("Autonomia restante: " + vehiculo.calcularAutonomia() + " km ");
    System.out.println("Kilometros recorridos: " + vehiculo.kilometrosRecorridos + " km ");
    System.out.println("-----------------------------------------------------------");
   } 

   public static void main(String[] args) {
    Coche coche = new Coche (50,500);
    Camion camion = new Camion (100, 800);
    Bicicleta bicicleta = new Bicicleta();

    probarVehiculo(coche, 100);
    probarVehiculo(camion, 100);
    probarVehiculo(bicicleta, 50);
   }
}
