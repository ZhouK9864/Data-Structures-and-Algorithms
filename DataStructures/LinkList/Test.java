package DataStructures.LinkList;


public class Test {
    public static void main(String[] args) {
        LinkList<Integer> linkList = new LinkList<Integer>();
        linkList.addHead(0);
        linkList.addTail(0);
        linkList.insert(100);
        linkList.insert(10);
        linkList.delete(100);
        linkList.toString();


    }

}
