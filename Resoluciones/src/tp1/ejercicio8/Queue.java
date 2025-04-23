
package tp1.ejercicio8;

import java.util.*;

public class Queue <T> extends Sequence {
    protected List <T> data;

    public Queue(List<T> data) {
        this.data = data;
    }
    
    public void enqueue (T dato){
        data.add(dato);
    }
    
    public T dequeue (){
        return data.remove(0);
    }
    
    public T head (){
        return data.get(0);
    }
    
    @Override
    public int size(){
        return data.size();
    }
    
    @Override
    public boolean isEmpty (){
        return data.isEmpty();
    }

    @Override
    public String toString() {
        String str = "Elementos:";
        for (T n : data)
            str += " " + n;
        return str;
    }
    
}
