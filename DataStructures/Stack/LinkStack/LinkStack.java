package DataStructures.Stack.LinkStack;

import javax.management.relation.RoleUnresolved;

public class LinkStack<T> {

    class Node<T> {
        T val;
        Node<T> next = null;
        public Node(T val){
            this.val = val;
            this.next = null;
        }
    }
    Node<T> head = null;                                                //初始化head结点
    Node<T> top = null;                                                 //初始化top结点作为尾哨兵结点

    /**
     * 入栈
     */
    public void push(T val){
        Node<T> newNode = new Node<>(val);
        Node<T> tmp = head;
        if(isEmpty()){
            head = newNode;
            top = head;
        }else{
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
            top = newNode;
        }
    }

    /**
     * 出栈
     */
    public T pop(){                                                 //不加哨兵头结点处理有些麻烦！
        if(isEmpty()){
            throw new RuntimeException("我空的老哥！");
        }
        Node<T> tmp = head;
        if(tmp.next == null){
            T data = head.val;
            head = null;
            return data;
        }
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        tmp.next = null;
        T data = top.val;
        top = tmp;
        return data;
    }

    /**
     * 获取栈顶数据
     */
    public T top(){
        return top.val;
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }

    /**
     * 打印链表
     */
    public String toString(){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        return null;
    }
}
