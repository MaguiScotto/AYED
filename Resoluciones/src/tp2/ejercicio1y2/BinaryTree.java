package tp2.ejercicio1y2;

import java.util.*;

public class BinaryTree <T>{
    private T data;
    private BinaryTree<T> leftChild;
    private BinaryTree<T> rightChild;

    public BinaryTree(){
        super();
    }
    
    public BinaryTree(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTree<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTree<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTree<T> rightChild) {
        this.rightChild = rightChild;
    }
    
    public void addLeftChild(BinaryTree<T> child){
        this.leftChild=child;
    }
    
    public void addRighttChild(BinaryTree<T> child){
        this.rightChild=child;
    }
   
    public void removeLeftChild() {
        this.leftChild = null;
    }
    
    public void removeRightChild() {
        this.rightChild = null;
    }
    public boolean isEmpty(){
        return (this.isLeaf() && this.getData() == null);
    }
    public boolean isLeaf() {
        return (!this.hasLeftChild() && !this.hasRightChild());
    }
    
    public boolean hasLeftChild() {
        return this.leftChild!=null;
    }
    
    public boolean hasRightChild() {
        return this.rightChild!=null;
    }
    
    @Override
    public String toString() {
        return this.getData().toString();
    }
    
    public int contarHojas(){
        int cantL =0;
        int cantR =0;
        if (this.isEmpty())
            return 0;
        if (this.isLeaf())
            return 1;
        if (this.hasLeftChild())
            cantL = this.getLeftChild().contarHojas();
        if (this.hasRightChild())
            cantR = this.getRightChild().contarHojas();
        return cantL + cantR;      
    }
    
    public BinaryTree<T> espejo(){
        BinaryTree<T> arbE = new BinaryTree<T>(this.getData());
        if (this.hasLeftChild())
            arbE.addLeftChild(this.getLeftChild().espejo());
        if (this.hasRightChild())
            arbE.addRighttChild(this.getRightChild().espejo());
        return arbE;
    }
    
    public void entreNiveles(int n, int m){
        if (this.isEmpty() || n < 0 || m < n) //Veo si esta vacia o n y m son invalidos
            System.out.println("No es posible"); 
        else {
            Queue <BinaryTree<T>> cola = new LinkedList();//Creo una cola que almacenara los nodos a procesar.
        cola.add(this);//Agrego la raiz del arbol a la cola
        int nivelActual = 0;
        
        while(!cola.isEmpty()) {
            int nodoNivel = cola.size(); //Calcula cuántos nodos hay en el nivel actual. 
            if(nivelActual >=n && nivelActual <= m) { //Reviso que el nivel este dentro del rango 
                for(int i=0; i < nodoNivel; i++) {
                    BinaryTree<T> nodo = cola.remove(); //Remueve un nodo de la cola para procesarlo.
                    System.out.print(nodo.getData() + " | ");
                    if(nodo.hasLeftChild()) 
                        cola.add(nodo.getLeftChild());
                    if(nodo.hasRightChild()) 
                        cola.add(nodo.getRightChild());
                }
            } 
            nivelActual++;//Avanzo al siguiente nivel.
            System.out.println("");//Imprimo salto de linea.
        }
        }
    }
}
