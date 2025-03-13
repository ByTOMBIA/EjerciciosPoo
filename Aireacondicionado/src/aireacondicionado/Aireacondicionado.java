
package aireacondicionado;

import java.util.Random;

public class Aireacondicionado {
    public static Random random = new Random();
    public static int humedad = random.nextInt(100) + 1;
    public static int temperatura=random.nextInt(50)+1;
    
    
    public static void Validartemperatura(){
        if (humedad>60 && temperatura>28 && temperatura<=34){
            System.out.println(".");
            Sensor.Encenderaire();
        }else if (temperatura>34){
            Sensor.Encenderaire();
        }else{
            Sensor.Apagaraire();
        }
    }
}
