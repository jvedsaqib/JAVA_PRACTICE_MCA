package linkedList;

import java.util.Scanner;

public class Prog3 {
    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private ListNode front;
    private ListNode rear;

    public Prog3() {
        this.front = null;
        this.rear = null;
    }

    public void insertFront(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            rear = newNode;
        } else {
            front.prev = newNode;
            newNode.next = front;
        }
        front = newNode;
    }

    public void insertRear(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
        }
        rear = newNode;
    }

    public int deleteFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int removedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        return removedValue;
    }

    public int deleteRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int removedValue = rear.data;
        rear = rear.prev;
        if (rear == null) {
            front = null;
        } else {
            rear.next = null;
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
        Prog3 deque = new Prog3();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Insert at front");
            System.out.println("2. Insert at rear");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at front: ");
                    int value = scanner.nextInt();
                    deque.insertFront(value);
                    break;
                case 2:
                    System.out.print("Enter value to insert at rear: ");
                    value = scanner.nextInt();
                    deque.insertRear(value);
                    break;
                case 3:
                    try {
                        int removedValue = deque.deleteFront();
                        System.out.println("Deleted value from front: " + removedValue);
                    } catch (Exception e) {
                        System.out.println("Deque is empty");
                    }
                    break;
                case 4:
                    try {
                        int removedValue = deque.deleteRear();
                        System.out.println("Deleted value from rear: " + removedValue);
                    } catch (Exception e) {
                        System.out.println("Deque is empty");
                    }
                    break;
                case 5:
                    deque.display();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
