

public class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean add(Node n){
        if (this.isEmpty()){ // case where there are currently no elements
            this.front = this.rear = n; 
        }
        else{
            this.rear.setNext(n); // link the current rear element to the new element
            this.rear = n; // set the new element as the rear
        }
        this.size++;
        return true;
    }

    public boolean addAll(Node[] arr){
        if (this.isEmpty()){
            this.front = this.rear = arr[0]; 
        }
        else{
            for (Node n : arr){
                this.add(n); // adds each element in arr
            }
        }
        this.size += arr.length; // updates size of queue
        return true;
    }

    public Node remove(){
        Node temp; 
        if (this.isEmpty()){ // case where there are currently no elements
            return null;
        }
        else{
            temp = this.front; // Node to be returned
            this.front = this.front.getNext(); // set next Node as new front
        }
        if (this.front == null){ // checking if there are any more elements
            this.rear = null; 
        }
        this.size--;
        return temp;
    }

    public Node peek(){ 
        return this.front;
    }

    public String toString(){
        if (this.isEmpty()){
            return "empty";
        }
        else{
            String output = "[";
            Node iter = this.front; // Node used to iterate through the queue
            while (iter != this.rear){
                output += iter.get() + ", ";
                iter = iter.getNext();
            }
            output += this.rear.get() + "]"; // adding the rear Node to the output string
            return output;
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }
}