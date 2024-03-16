package linkedList;

import java.util.Scanner;

public class DLL {
    private ListNode head;
    private ListNode tail;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        ListNode(int data, ListNode prev) {
            this.data = data;
            this.prev = prev;
            this.next = null;
        }
    }

    public void display() {
        ListNode temp = head;
        if (temp == null) {
            System.out.println("No Data");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addNodeAtFront(int data) {
        ListNode newNode = new ListNode(data, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addNodeAtLast(int data) {
        ListNode newNode = new ListNode(data, tail);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteNodeAtFront() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteNodeAtLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add node at front");
            System.out.println("2. Add node at last");
            System.out.println("3. Delete node at front");
            System.out.println("4. Delete node at last");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = scanner.nextInt();
                    dll.addNodeAtFront(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    dll.addNodeAtLast(data);
                    break;
                case 3:
                    dll.deleteNodeAtFront();
                    break;
                case 4:
                    dll.deleteNodeAtLast();
                    break;
                case 5:
                    dll.display();
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
