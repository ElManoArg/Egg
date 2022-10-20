
package prueba;

import java.util.Scanner;

public class EJERCICIO5 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        frase = leer.nextLine();
        System.out.println("La frase en MAYUSCULAS es " + frase.toUpperCase());
        System.out.println("La frase en minusculas es " + frase.toLowerCase());
        
        
    }
    
}
