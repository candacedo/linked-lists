

public class Node {
    private int data;
    private Node next;
    //maya was here
    public Node (int d) {
        this.data = d;
        this.next = null;
    }

    public int get() {
        return this.data;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public Node getNext(){
        return this.next;
    }

}