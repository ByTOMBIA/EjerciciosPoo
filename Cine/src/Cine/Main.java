
package Cine;

import java.util.Scanner;
public class Main {

 public static Scanner objscanner=new Scanner(System.in);
 public static String nombre=" ";
 public static int edad=0;
 public static int cedula=0;
 public static String correo;
 
    public static void main(String[] args) {
        System.out.println("ingrese su nombre porfavor");
        Main.nombre=objscanner.nextLine();
        System.out.println("ingrese su edad");
        Main.edad=objscanner.nextInt();
        System.out.println("ingrese su cedula sin puntos o comas porfavor");
        Main.cedula=objscanner.nextInt();
        System.out.println("ingrese su correo electronico");
        objscanner.nextLine();
        Main.correo=objscanner.nextLine();
        Usuario objusuario=new Usuario(Main.nombre,Main.edad,Main.cedula,Main.correo);
        objusuario.Reservar(Main.correo);
        objusuario.imprimirdatos(Main.correo);
    }
    
}
