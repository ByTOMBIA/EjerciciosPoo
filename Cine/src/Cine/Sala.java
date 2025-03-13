
package Cine;


public class Sala {
    public static int numerosala=0;
    public static String pelicula=" ";
    
    public Sala(int sala,String pelicula){
        Sala.numerosala=sala;
        Sala.pelicula=pelicula;
        System.out.println("Datos Reserva!!");
        System.out.println("numero de sala:"+sala);
        System.out.println("Pelicula:"+pelicula);
    }
    
}
