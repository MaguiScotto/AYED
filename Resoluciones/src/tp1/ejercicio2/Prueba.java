package tp1.ejercicio2;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ; 
        System.out.println("Ingrese un numero");
        int n = s.nextInt();
        int [] vector = Clase.punto2(n);
        Clase.imprimir(vector, n);
    }
    
}
