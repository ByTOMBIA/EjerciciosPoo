
package Cine;

public class Usuario extends Persona{

    private static String correo;
    public Usuario(String nombre,int edad,int cedula,String correo){
        super(nombre, edad, cedula);
        Usuario.correo=correo;
    }
}

