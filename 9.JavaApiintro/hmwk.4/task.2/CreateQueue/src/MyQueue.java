import java.util.LinkedList;

public class MyQueue<T> {
    LinkedList<T> ll = new LinkedList<>();


    public void enqueue(T element){
        // Напишите свое решение ниже
        ll.add(element);

    }

    public T dequeue(){
        // Напишите свое решение ниже
        return ll.pollFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return ll.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return ll;
    }
}
