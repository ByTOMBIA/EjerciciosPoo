
package Cine;
import java.util.Random;
import java.util.Scanner;

public class Persona {

    public  static Scanner objscanner=new Scanner(System.in);
    public static String nombre;
    public static int edad;
    public static int cedula;
    public static String controlador=" ";
    public static int silla=1;
    public static Random random=new Random();
    public int asignarsala;
    public static String pelicula;
    public static String correo;
    
    public Persona(String nombre,int edad,int cedula){
    Persona.nombre=nombre;
    Persona.edad=edad;
    Persona.cedula=cedula;
    }
    
    public void Reservar(String correo){
        String respuesta=" ";
        int control=1;
        Persona.correo=correo;
        this.asignarsala=random.nextInt(4)+1;
        switch (asignarsala) {
            case 1:
                Persona.pelicula="SONIC 3";
                break;
            case 2:
                Persona.pelicula="MUFASA";
                break;
            case 3:
                Persona.pelicula="Flow";
                break;
            case 4:
                Persona.pelicula="Fanf";
                break;
        }

        while (!Persona.controlador.equals("NO") && !Persona.controlador.equals("SI")) {
            System.out.println("Desea reservar un asiento (Si, No)");
            respuesta = objscanner.nextLine();
            Persona.controlador = respuesta.toUpperCase();

            if (!Persona.controlador.equals("NO") && !Persona.controlador.equals("SI")) {
                System.out.println("Error: opcion incorrecta, por favor ingrese 'Si' o 'No'.");
            }else if("SI".equals(Persona.controlador)){
               while (control==1){
                System.out.println("que asiento deseas? elige entre el 1 al 20");
                silla=objscanner.nextInt();
                if (Persona.silla<1 || Persona.silla>20){
                  System.out.println("ERROR, ingresaste un numero fuera del rango de 1 a 20.... intenta de nuevo");
                }else {
                  control=0;
                  Asientos objAsientos=new Asientos(silla, nombre);
                  Sala objsala=new Sala(asignarsala,pelicula);
                  Cine objcine=new Cine(Persona.nombre,Persona.edad,Persona.cedula,Persona.correo,Persona.silla,this.asignarsala,Persona.pelicula);
                }
                }
            }
        }
    }
    
    public void imprimirdatos(String correo){
        System.out.println("DATOS DEL USUARIO");
        System.out.println("nombre :"+Persona.nombre);
        System.out.println("edad:"+Persona.edad);
        System.out.println("cedula:"+Persona.cedula);
        System.out.println("correo electronico: "+correo);
        System.out.println("Reservo?:"+Persona.controlador);
        System.out.println("silla elegida:"+Persona.silla);
    }
}
    

