package DataStructures.List.ArrayList;

import java.util.function.ObjIntConsumer;

public class ArrayList<T> {
    private Integer MAX_SIZE = 16;
    private Integer size = 0;
    private T[] array = (T[]) new Object[MAX_SIZE];

    public void add(T val){
        if(size >= MAX_SIZE){
            MAX_SIZE = MAX_SIZE * 2;
            T[] newArray = (T[]) new Object[MAX_SIZE];
            array = newArray;
        }
        array[size] = val;
        System.out.println(array[size]);
        size++;

    }

    public void delete(){
        array[size] = null;
        System.out.println(array[size]);
        size--;

    }
}
