
package carros;

import java.util.Scanner;


public class Vehiculo {
    private String nombre;
    private double[] tiempo;
    private int numVueltas;
    
    public Vehiculo (String nombre, int numVueltas ){
        this.nombre= nombre;
        this.tiempo = new double [numVueltas];
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void ingresarTiempos(Scanner entrada){
       
        System.out.println("Ingrese el tiempo recorrido en la vuelta ");
        for (int i=0; i<tiempo.length; i++){
            System.out.println("Tiempo de la vuelta " + (i+1) + ":");
            tiempo[1] = entrada.nextDouble();
            
        }
    }
    
    public double velocidadPromedio(double distanciaTotal){
        double tiempoTotal=0;
        for(int i=0; i<tiempo.length; i++){
            tiempoTotal+= tiempo[i];
        }
        return distanciaTotal/tiempoTotal;
    }
}
