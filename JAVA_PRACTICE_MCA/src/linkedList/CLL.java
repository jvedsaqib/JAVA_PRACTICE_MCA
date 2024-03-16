package linkedList;
import java.util.*;

public class CLL {
    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public void display(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(Head)");
    }

    public ListNode addNodeAtFront(int data, ListNode head) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }

        ListNode last = head.prev;
        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
        return newNode;
    }

    public ListNode addNodeAtLast(int data, ListNode head) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }

        ListNode last = head.prev;
        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
        return head;
    }

    public ListNode addNodeAtSpecificPosition(int data, int position, ListNode head) {
        if (head == null && position != 0) {
            throw new IllegalStateException("List is empty");
        }

        if (position < 0) {
            throw new IllegalArgumentException("Invalid position");
        }

        if (position == 0) {
            return addNodeAtFront(data, head);
        }

        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == head) {
                throw new IllegalArgumentException("Invalid position");
            }
        }

        ListNode newNode = new ListNode(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        return head;
    }

    public ListNode deleteFrontNode(ListNode head) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.next == head) {
            return null;
        }

        ListNode last = head.prev;
        last.next = head.next;
        head.next.prev = last;
        return head.next;
    }

    public ListNode deleteLastNode(ListNode head) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.next == head) {
            return null;
        }

        ListNode last = head.prev;
        ListNode newLast = last.prev;
        newLast.next = head;
        head.prev = newLast;
        return head;
    }

    public ListNode deleteNodeAtSpecificPosition(int position, ListNode head) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (position < 0) {
            throw new IllegalArgumentException("Invalid position");
        }

        if (position == 0) {
            return deleteFrontNode(head);
        }

        ListNode current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
            if (current == head) {
                throw new IllegalArgumentException("Invalid position");
            }
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        return head;
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        ListNode head = null;
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add node at front");
            System.out.println("2. Add node at last");
            System.out.println("3. Add node at specific position");
            System.out.println("4. Delete front node");
            System.out.println("5. Delete last node");
            System.out.println("6. Delete node at specific position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = scanner.nextInt();
                    head = cll.addNodeAtFront(data, head);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    head = cll.addNodeAtLast(data, head);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = scanner.nextInt();
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    head = cll.addNodeAtSpecificPosition(data, position, head);
                    break;
                case 4:
                    head = cll.deleteFrontNode(head);
                    break;
                case 5:
                    head = cll.deleteLastNode(head);
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    position = scanner.nextInt();
                    head = cll.deleteNodeAtSpecificPosition(position, head);
                    break;
                case 7:
                    cll.display(head);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}

