
import java.util.*;

public class QueueArrayList{
    private ArrayList<Integer> list; 

    public QueueArrayList(){
        list = new ArrayList<Integer>();
    }

    public boolean add(int n){
        list.add(n);
        return true;
    }

    public boolean addAll(int[] arr){
        for (int n : arr){
            list.add(n);
        }
        return true;
    }

    public int remove(){
        return list.remove(0);
    }

    public int peek(){
        return list.get(0);
    }

    public String toString(){
        return list.toString();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        if (list.size() == 0){
            return true;
        }
        return false;
    }
}