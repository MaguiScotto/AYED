package tp1.ejercicio7;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
       //PUNTO A
        List <Integer> listado = new ArrayList ();
        int n;
        System.out.println("Ingrese numero para la lista o -1 para finalizar");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n!= -1){
            listado.add(n);
            System.out.println("Ingrese numero para la lista o -1 para finalizar");
            n = s.nextInt();
        }
        s.close();
        for (int num : listado)
            System.out.println(num);
    // PUNTO B: ArrayList: Utiliza un arreglo dinámico internamente. Almacena los elementos de forma contigua en memoria.
    //LinkedList: Está basado en una lista doblemente enlazada, donde cada nodo contiene un valor y referencias al nodo anterior y siguiente.
    // En ArrayList el acceso es mas rapido debido al uso del indice ya que simplemente calcula la posición en el arreglo. Mientras que en LinkedList es mas lento, porq debe recorrer toda la estructura.
    
    //PUNTO C: si, existen otras formas:
        for (int i=0; i < listado.size();i++)
            System.out.println(listado.get(i));
        
        Iterator <Integer> it = listado.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        
        // PUNTO D
        List<Estudiante> listaE = new ArrayList();
        Estudiante e1 = new Estudiante("Osi","Jara","UNLP",39957);
        listaE.add(e1);
        Estudiante e2 = new Estudiante("Mag","Scotto","UNLP",43254);
        listaE.add(e2);
        Estudiante e3 = new Estudiante("Luli","Blan","UNLP",1234);
        listaE.add(e3);
        List <Estudiante> clonLista = new ArrayList(listaE);
        for (Estudiante es : listaE)
            System.out.println(es.toString());
        for (Estudiante es : clonLista)
            System.out.println(es.toString());
        e2.setApe("Jara");
        for (Estudiante es : listaE)
            System.out.println(es.toString());
        for (Estudiante es : clonLista)
            System.out.println(es.toString());
        // Al modificar un estudiante, ese cambio se refleja en ambas listas, ya que son una referencia a dicho objeto.
        
        //PUNDO E
        boolean ok = false;
        Estudiante x = new Estudiante("Toti","Manguin","UNLP",222);
        for (int l : listado)
            if (x != listaE.get(l))
                ok=true;
        if (ok)
            listaE.add(x);
    
        for (Estudiante es : listaE)
            System.out.println(es.toString());
    }
}
