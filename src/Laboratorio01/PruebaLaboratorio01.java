package Laboratorio01;

import java.util.Scanner;

public class PruebaLaboratorio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un numero: ");
        valor = entrada.nextInt();      
                  
        System.out.println("FIBONACCI MEDIANTE RECURSIVIDAD");
        System.out.println("Resultado: "+Laboratorio01.fibonacciRecursivo(valor));
        System.out.println("Tiempo de ejecucion: "+Laboratorio01.getContadorTiempo());
        
        System.out.println("FIBONACCI MEDIANTE ITERACIONES");
        System.out.println("Resulatdo: "+Laboratorio01.fibonacciIterativo(valor));
        System.out.println("Tiempo de ejecucion: "+Laboratorio01.getContadorTiempo());
    }
    
}
