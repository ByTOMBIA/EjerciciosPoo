package luces;

import java.util.Random;

public class Sensorluces {
    public static Random random = new Random();
    public static int numeroAleatorio;
    public static String tiempo;

    public Sensorluces() {
    }

    public static void Validarmovimiento() {
        String resultado;
        for (int i = 1; i <= 4; i++) {
            Sensorluces.numeroAleatorio = random.nextInt(2) + 1;
            switch (Sensorluces.numeroAleatorio) {
                case 1:
                    Sensorluces.tiempo = "noche";
                    System.out.println(Sensorluces.tiempo);
                    break;
                case 2:
                    Sensorluces.tiempo = "dia";
                    System.out.println(Sensorluces.tiempo);
                    break;
                default:
                    throw new AssertionError();
            }

            int numerosensor = random.nextInt(2) + 1;

            if (numerosensor==1 && Sensorluces.tiempo.equals("noche")) {
                System.out.println("luces encendidas");
                try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            } else if (numerosensor!=1 || !Sensorluces.tiempo.equals("noche")) {
                System.out.println("luces apagadas");
                try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
            }
        }
    }
}
