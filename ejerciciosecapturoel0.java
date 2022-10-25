
package prueba;

import java.util.Scanner;

public class ejerciciosecapturoel0 {

    public static void main(String[] args) {
      int num , cont = 0 , suma;
        Scanner leer = new Scanner(System.in);
        
        do {            
            System.out.println("Por Favor ingrese un numero");
            num = leer.nextInt();
            cont = cont + num;
            
            if (num == 0) {
            System.out.println("Se capturo el numero 0");
            break;
            }
            
        } while (num > 0 || num < 20);
        suma = cont;
        System.out.println("La suma de todos los numeros ingresados es: " + suma);
        
}    
}
