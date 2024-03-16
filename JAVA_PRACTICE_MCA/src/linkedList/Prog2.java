package linkedList;

import java.util.Scanner;

public class Prog2 {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode front;
    private ListNode rear;

    public Prog2() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removedValue;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prog2 queue = new Prog2();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    try {
                        int dequeuedValue = queue.dequeue();
                        System.out.println("Dequeued value: " + dequeuedValue);
                    } catch (Exception e) {
                        System.out.println("Queue is empty");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}

