package Laboratorio02;

public class Laboratorio02 {

    private static int contadorTiempo;

    public Laboratorio02() {
        contadorTiempo=0;
    }
    public static int getContadorTiempo() {
        return contadorTiempo;
    }

    public static void setContadorTiempo(int contadorTiempo) {
        Laboratorio02.contadorTiempo = contadorTiempo;
    }
    //Metodo recursivo para las Torres de Hanoi
    public static void torresHanoi(int discos, int torre1, int torre2, int torre3){      
        if(discos==1){
            
            System.out.println("Mover Disco de torre "+torre1+" a torre "+torre3);
            
        }
        else{
            
            torresHanoi(discos-1,torre1,torre3,torre2);
            System.out.println("Mover Disco de torre "+torre1+" a torre "+torre3);
            torresHanoi(discos-1,torre2,torre1,torre3);
        }  
        contadorTiempo++;
        
    }
    
 
    
    
}
