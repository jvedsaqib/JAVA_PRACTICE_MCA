package linkedList;
import java.util.*;

public class SLL {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("No Data");
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public int getHead() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        return head.data;
    }

    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void addNodeAtFront(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Data inserted at front!");
    }

    public void addNodeAtLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            System.out.println("Data inserted at last!");
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Data inserted at last!");
    }

    public void deleteNodeAtFront() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
    }

    public void deleteNodeAtLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void addNodeAtSpecificPosition(int data, int pos) {
        if (pos < 0 || pos > getSize()) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (pos == 0) {
            addNodeAtFront(data);
            return;
        }
        if (pos == getSize()) {
            addNodeAtLast(data);
            return;
        }

        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Data inserted at position " + pos);
    }

    public void deleteNodeAtSpecificPosition(int pos) {
        if (pos < 0 || pos >= getSize()) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (pos == 0) {
            deleteNodeAtFront();
            return;
        }
        if (pos == getSize() - 1) {
            deleteNodeAtLast();
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public boolean searchNode(int key) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public ListNode reverseList() {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    
    public void concatenate(SLL list2) {
        if (head == null) {
            head = list2.head;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2.head;
    }


    // <-----MAIN----->

    public static void main(String args[]) {
        SLL sll = new SLL();
        
        SLL sll2 = new SLL();
        sll2.addNodeAtFront(5);
        sll2.addNodeAtFront(10);
        sll2.addNodeAtFront(15);
        
        Scanner sc = new Scanner(System.in);
        int data;

        int choice;
        int sub_choice;
        boolean flag = true;

        while (flag) {
            System.out.println("0) Exit \n1) Display \n2) Insert \n3) Delete \n4) Search \n5) Reverse List \n6) Concat");
            System.out.println("Choose - ");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    flag = false;
                    break;
                case 1:
                    sll.display();
                    break;
                case 2:
                    System.out.println("0) Back \n1) Insert at front \n2) Insert at last \n3) Insert at specific position");
                    System.out.println("Choose - ");
                    sub_choice = sc.nextInt();
                    switch (sub_choice) {

                        case 0:
                            break;
                        case 1:
                            System.out.println("Enter Data - ");
                            data = sc.nextInt();
                            sll.addNodeAtFront(data);
                            System.out.println();
                            sll.display();
                            break;
                        case 2:
                            System.out.println("Enter Data - ");
                            data = sc.nextInt();
                            sll.addNodeAtLast(data);
                            System.out.println();
                            sll.display();
                            break;
                        case 3:
                            System.out.println("Enter Data - ");
                            data = sc.nextInt();
                            System.out.println("Enter Position - ");
                            int add_pos = sc.nextInt();
                            sll.addNodeAtSpecificPosition(data, add_pos);
                            System.out.println();
                            sll.display();
                            break;

                    }
                    break;

                case 3:
                    System.out.println("0) Back \n1) Delete front \n2) Delete last \n3) Delete specific position");
                    System.out.println("Choose - ");
                    sub_choice = sc.nextInt();
                    switch (sub_choice) {

                        case 0:
                            break;
                        case 1:
                            sll.deleteNodeAtFront();
                            System.out.println();
                            sll.display();
                            break;
                        case 2:
                            sll.deleteNodeAtLast();
                            System.out.println();
                            sll.display();
                            break;
                        case 3:
                            System.out.println("Enter Position - ");
                            int del_pos = sc.nextInt();
                            sll.deleteNodeAtSpecificPosition(del_pos);
                            System.out.println();
                            sll.display();
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Enter Element - ");
                    int key = sc.nextInt();
                    System.out.println(sll.searchNode(key));
                    break;
                case 5:
                	sll.reverseList();
                	sll.display();
                	break;
                case 6:
                	sll.concatenate(sll2);
                	sll.display();
                	break;

            }


        }


    }

}
