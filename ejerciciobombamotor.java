
package prueba;

import java.util.Scanner;

public class ejerciciobombamotor {

   
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       int TipoMotor;
       System.out.println("Ingrese el tipo de Motor que quiere consultar");
       TipoMotor = leer.nextInt();
       
       switch (TipoMotor){
           case 1 :
           System.out.println("La bomba es una bomba de agua");
           break;
           
           case 2 :
           System.out.println("La bomba es una bomba de gasolina");
           break;
           
           case 3 :
           System.out.println("La bomba es una bomba de hormigón");
           break;
           
           case 4 :   
           System.out.println("La bomba es una bomba de pasta alimenticia");
           break;
           
           default:
           System.out.println("No existe un valor válido para tipo de bomba");
                           
    }
    
}
}
