
package prueba;

import java.util.Scanner;


public class ejerciciovalidadordenotas {

    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) {
     int num ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        num = leer.nextInt();
        
    while (num<0 || num>10){;
        System.out.println("La nota es invalida, ingrese otra nota");
        num = leer.nextInt();
        
    }
    
    }
    
}
