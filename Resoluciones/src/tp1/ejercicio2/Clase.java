package tp1.ejercicio2;

public class Clase {
    public static int[] punto2(int n){
        int [] v = new int [n];
        int k=1;
        for(int i=0;i<n;i++){
            v[i]=n*k;
            k=k+1;
        }
        return v;
    }
    
    public static void imprimir(int [] v, int n){
        for(int i=0; i<n;i++){
            System.out.println(v[i]);
        }
    }
}
