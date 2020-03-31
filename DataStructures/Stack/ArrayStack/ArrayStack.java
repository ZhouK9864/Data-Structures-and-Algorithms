package DataStructures.Stack.ArrayStack;

import javax.management.relation.RoleUnresolved;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayStack<T> {
    private Integer MAX_SIZE = 16;
    private T[] stack = (T[]) new Object[MAX_SIZE];
    private Integer size = 0;

    /**
     * 入栈
     */
    public void push(T val){
        if(size > MAX_SIZE){
            MAX_SIZE = MAX_SIZE * 2;
            T[] newStack = (T[]) new Object[MAX_SIZE];              //实现动态扩容
            stack = newStack;
        }
        stack[size] = val;
        size++;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }

    /**
     * 出栈
     * @return
     */
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("你的栈空了！");              //判断栈是否为空
        }
        T tmp = stack[size - 1];
        stack[size -1] = null;
        size--;
        return tmp;
    }

    /**
     * 返回栈顶元素
     * @return
     */
    public T top(){
        if(isEmpty()){
            throw new RuntimeException("你栈空的！！！！");
        }
        return stack[size - 1];
    }

    /**
     * 多个元素一起入栈
     * @return
     */
    public void pushAll(Iterable<? extends T> src){                 //生产者 + 通配符 + extends + 泛型
        for(T a : src){
            push(a);
        }
    }

    /**
     * 所有元素出栈
     * @return
     */
    public void popAll(Collection<? super T> src){                  //消费者 + 通配符 + super + 泛型
        while(!isEmpty()){
            src.add(pop());
        }
    }


    public String toString(){                                       //重写toString方法实现栈中数据打印
        System.out.println("栈顶：");
        for(int z = size - 1; z > 0; z--){
            System.out.println(stack[z]);
        }
        return null;
    }
}

