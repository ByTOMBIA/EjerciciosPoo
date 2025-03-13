
package juego;


public class Numeros {
    public Numeros(){
        for(int i=1;i<=100;i++){
         if (i%3==0 && i%5==0){
             System.out.println("FIZZBUZ");
         }else if(i%5==0){
             Fizzbuzz.imprimirfizz();
         }else if(i%3==0){
             Fizzbuzz.imprimirBuzz();
         }else{
             System.out.println(i);
         }
    }
    }
}
