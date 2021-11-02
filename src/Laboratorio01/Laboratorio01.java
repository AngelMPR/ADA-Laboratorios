package Laboratorio01;

public class Laboratorio01 {

    private static int contadorTiempo;

    public Laboratorio01() {
        contadorTiempo=0;
    }
    public static int getContadorTiempo() {
        return contadorTiempo;
    }

    public static void setContadorTiempo(int contadorTiempo) {
        Laboratorio01.contadorTiempo = contadorTiempo;
    }
    //Metodo recursivo para la sucesion fibonacci 
    public static int fibonacciRecursivo(int n){      
        if(n==1 || n==2){
            contadorTiempo++;
            return 1;
        }
        else{
            contadorTiempo++;
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);  
        }         
    }
    
    //Metodo iterativo para la sucesion fibonacci 
    public static int fibonacciIterativo(int n){
        int fib=0, prim=1, seg=0;
        contadorTiempo=0;
        while(n>0){
            fib=prim+seg;
            prim=seg;
            seg=fib;
            n--;
            contadorTiempo++;
        }
        return fib;
    }
    
}
