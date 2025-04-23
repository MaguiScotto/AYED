package tp2.ejercicio3;

import java.util.*;
import tp2.ejercicio1y2.BinaryTree;

public class ContadorArbol {
    private BinaryTree <Integer> arbol;

    public ContadorArbol(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }
    
    public List <Integer> numerosParesA (){
        List <Integer> lista = new ArrayList();
        this.inOrden(arbol, lista);
        return lista;
    }
    
    private void agregarSiCumple(int x, List<Integer> lista){
        if (x % 2 == 0)
            lista.add(x);
    }
    
    private void inOrden (BinaryTree<Integer> arbol, List <Integer> lista){
        if (arbol.hasLeftChild())
            this.inOrden(arbol.getLeftChild(), lista);
       this.agregarSiCumple(arbol.getData(), lista);
        if(arbol.hasRightChild())
            this.inOrden(arbol.getRightChild(), lista);      
    }
    
    public List<Integer> numerosParesB(){
        List<Integer> lista = new LinkedList();
        this.postOrden(arbol, lista);
        return lista;
    }
    
    private void postOrden (BinaryTree<Integer> arbol, List<Integer> lista){
        if (arbol.hasLeftChild())
            this.postOrden(arbol.getLeftChild(), lista);
        if (arbol.hasRightChild())
            this.postOrden(arbol.getRightChild(), lista);
        this.agregarSiCumple(arbol.getData(), lista);
    }
}
