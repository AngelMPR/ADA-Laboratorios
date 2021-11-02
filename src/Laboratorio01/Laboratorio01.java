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
    
    public static boolean BusquedaSecuencial(int n){
        int arreglo[]={4,1,5,2,3};
        int i =0;
        boolean band = false;
        contadorTiempo=0;
        while (i<5 && band == false) {
            if(arreglo[i]==n){
                band=true;
            }
            i++;
            contadorTiempo++;
        }
        return band;    
    }     
}
