
package calculadora;

import java.util.Scanner;

public class Numeros {
    private static int numero;
    private static int numero2;
    private static String operacion;
    public Scanner objSacnner=new Scanner(System.in);
    
    public Numeros(){
        System.out.println("ingrese un numero");
        numero=objSacnner.nextInt();
        System.out.println("ingrese otro numero");
        numero2=objSacnner.nextInt();
        System.out.println("ingre una de las siguientes operaciones (+ , - , X , / ");
        objSacnner.nextLine();
        operacion=objSacnner.nextLine();
        Calculadora.haceroperacion(numero,numero2,operacion);
    }
}
