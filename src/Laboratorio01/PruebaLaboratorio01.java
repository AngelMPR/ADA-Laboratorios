package Laboratorio01;

import java.util.Scanner;

public class PruebaLaboratorio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un numero: ");
        valor = entrada.nextInt();      
                  
        System.out.println("Busqueda de un elemento de un vector");
        System.out.println("Resultado: "+Laboratorio01.BusquedaSecuencial(valor));
        System.out.println("Tiempo de ejecucion: "+Laboratorio01.getContadorTiempo());
        
    }
    
}
