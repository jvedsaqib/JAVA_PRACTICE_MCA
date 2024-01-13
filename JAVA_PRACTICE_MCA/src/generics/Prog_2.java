package generics;

import java.util.ArrayList;

public class Prog_2<T> {
    private ArrayList<T> queue;

    public Prog_2() {
        queue = new ArrayList<>();
    }

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        Prog_2<Integer> integerQueue = new Prog_2<>();

        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        integerQueue.display();

        System.out.println("Dequeue: " + integerQueue.dequeue());

        integerQueue.display();
        
        System.out.println("\n\n");
        
        Prog_2<Double> doubleQueue = new Prog_2<>();
        doubleQueue.enqueue(10.5);
        doubleQueue.enqueue(20.2);
        doubleQueue.enqueue(30.6);

        doubleQueue.display();

        System.out.println("Dequeue: " + doubleQueue.dequeue());

        doubleQueue.display();
    }
}

