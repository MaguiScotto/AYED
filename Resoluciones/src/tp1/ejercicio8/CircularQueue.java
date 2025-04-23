package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{
    public T shift (){
        T x = super.dequeue();
        super.enqueue(x);
        return x;
    }
    
}
