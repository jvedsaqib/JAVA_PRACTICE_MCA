package linkedList;

import java.util.Scanner;

public class Prog1 {
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private ListNode top;

    public Prog1() {
        this.top = null;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public void display() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prog1 stack = new Prog1();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Popped value: " + poppedValue);
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 3:
                    try {
                        int peekedValue = stack.peek();
                        System.out.println("Top element: " + peekedValue);
                    } catch (Exception e) {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
