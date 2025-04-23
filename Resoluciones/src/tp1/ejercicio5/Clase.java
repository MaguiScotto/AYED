package tp1.ejercicio5;

public class Clase {
    private static int max= Integer.MIN_VALUE;
    private static int min= Integer.MAX_VALUE;
    private static double prom;
    private static int suma=0;
    private static Valores val;
    
    public static String puntoA(int[]v){
        for (int i=0; i<v.length;i++){
            if (v[i] > max)
                max= v[i];
            if (v[i]<min)
                min=v[i];
            suma= suma+v[i];
        }
        prom= (double) suma/v.length;
        return "Maximo: "+max+", Minimo: "+min+", Promedio: "+prom;
    }
    
    public static void puntoB (int[]v, Valores val){
        for (int i=0; i<v.length;i++){
            if (v[i] > max)
                max= v[i];
            if (v[i]<min)
                min=v[i];
            suma= suma+v[i];
        }
        prom= (double) suma/v.length;
        val.setMax(max);
        val.setMin(min);
        val.setProm(prom);
    }
    
    public static void puntoC (int[]v){
        for (int i=0; i<v.length;i++){
            if (v[i] > max)
                max= v[i];
            if (v[i]<min)
                min=v[i];
            suma= suma+v[i];
        }
        prom= (double) suma/v.length;
         val= new Valores(max,min,prom); 
    }

    public static Valores getVal() {
        return val;
    }
}
