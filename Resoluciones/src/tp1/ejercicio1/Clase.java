package tp1.ejercicio1;
public class Clase {
    public static void puntoA(int a, int b){
        int i;
        for (i=a;i<=b;i++)
            System.out.println(i);
    }
    
    public static void puntoB(int a, int b){
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i= i+1;
        }
    }
    
    public static void puntoC (int a, int b){
        System.out.println(a);
        if (a < b){
            a++; //es lo mismo asi o pongo a+1?
            puntoC(a,b);
        }
    }
}
