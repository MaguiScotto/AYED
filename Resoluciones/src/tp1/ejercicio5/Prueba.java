package tp1.ejercicio5;

public class Prueba {

    public static void main(String[] args) {
        Valores val = new Valores(0,0,0);
        System.out.println(Clase.puntoA(new int[]{5,8,10,150,1}));
        
        Clase.puntoB(new int[]{5,8,10,150,1,-1}, val);
        System.out.println(val.toString());
        
        Clase.puntoC(new int[]{5,8,10,150,1});
        System.out.println(Clase.getVal().toString());
    }
}
