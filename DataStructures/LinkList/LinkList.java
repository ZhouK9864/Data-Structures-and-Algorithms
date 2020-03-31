package DataStructures.LinkList;

public class LinkList<T> {
    /**
     * 内部类实现Node
     */
    class Node<T>{
        Node<T> next = null;
        T val;
        public Node(T val){                         // 头尾结点插入的构造方法
            this.val = val;
            this.next = null;
        }
    }
    private Node<T> head = null;                    //初始化头结点,作为哨兵使用
    private Node<T> tail = null;                    //初始化尾结点，作为哨兵使用

    /**
     * 插入头结点
     * @param val
     */
    public void addHead(T val){
        head = new Node<T>(val);
        if(tail == null){
            tail = head;                             //若无尾结点，另尾结点与头结点一致
        }
    }

    /**
     * 插入尾结点
     */
    public void addTail(T val){
        tail = new Node<T>(val);
        head.next = tail;
    }

    /**
     * 实现数据从头插法插入链表
     */
    public void insert(T val){
        Node<T> ptrNext;                               //使用头插法，插入一个中间结点
        Node<T> newNode = new Node<>(val);
        if(head.next != null){
            ptrNext = head.next;
            head.next = newNode;
            newNode.next = ptrNext;
        }
    }

    /**
     * 删除链表同一数值的节点
     */
    public void delete(T val){
        Node<T> ptrNode = head;
        while(ptrNode.next != null){
            if(ptrNode.next.val == val){                //判断当前结点的下一节点是否和删除目标值相同，哨兵节点的优势展现出来了
                ptrNode.next = ptrNode.next.next;
            }
            ptrNode = ptrNode.next;
        }
    }

    /**
     * 从头打印链表
     * @return 返回链表节点数值
     */
    public String toString(){                           //遍历,重写toString();
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
        return null;
    }
}
