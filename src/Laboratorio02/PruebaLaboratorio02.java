package Laboratorio02;

import java.util.Scanner;

public class PruebaLaboratorio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;   
        
        //Probando Hanoi          
        System.out.println("Torre de Hanoi");
        System.out.println("--------------");
        System.out.println("Ingrese un numero entero positivo: ");
        valor = entrada.nextInt();  
        Laboratorio02.torresHanoi(valor, 1, 2, 3);
        System.out.println("Tiempo de ejecucion: "+Laboratorio02.getContadorTiempo());
       
    }
    
}
