

public class QueueClient{
    public static void main (String[] args){
        /*
        Queue q = new Queue();
        q.add(new Node(10));
        q.add(new Node(20));
        System.out.print("this is the queue: ");
        System.out.println(q);
        System.out.println(q.remove().get());
        System.out.println(q.remove().get());
        System.out.println(q);
        */

        QueueArrayList q =  new QueueArrayList();
        q.add(5);
        q.add(10);
        System.out.println("size: " + q.size());
        System.out.println("current front: " + q.peek());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.isEmpty());
        int [] arr = new int[]{1, 2, 3};
        q.addAll(arr);
        System.out.println(q.isEmpty());
        System.out.println(q);


    }
} 