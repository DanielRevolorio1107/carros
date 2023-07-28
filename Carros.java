
package carros;

import java.util.Scanner;


public class Carros {
private static final int NUM_VUELTAS = 5;
    
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Ingrese una opcion");
        System.out.println("1.Velocidad Promedio");
        System.out.println("2.salir");
    
        int opcion = entrada.nextInt();
        switch (opcion){
        case 1:
        System.out.println("Ingrese la distanciqa Total de la pista en km");
        double distanciaTotal = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de vehiculo");
        int numVehiculo = entrada.nextInt();
        
        Vehiculo [] vehiculos = new Vehiculo[numVehiculo];
        for (int i=0; i<numVehiculo; i++){
            System.out.println("Ingrese el nombre de los vehiculos");
            System.out.println("Vehiculo " + (i+1) + ":");
            String nombreVehiculo = entrada.nextLine();
            nombreVehiculo = entrada.nextLine();
            vehiculos [i]= new Vehiculo(nombreVehiculo, NUM_VUELTAS);
            vehiculos [i].ingresarTiempos(entrada);
        }
        
        System.out.println("Resultados ");
            for (Vehiculo vehiculo: vehiculos){
             double velocidadPromedio= vehiculo.velocidadPromedio(distanciaTotal);
            System.out.println("Vehiculos "+ vehiculo.getNombre() + "velocidad Promedio : " + velocidadPromedio + "km/h");
            }
            break;
            case 2: 
                System.out.println("Gracias por usar este programa :)");
          
                
            }
    }
   
}
