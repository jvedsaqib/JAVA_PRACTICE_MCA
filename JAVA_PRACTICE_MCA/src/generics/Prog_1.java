package generics;

import java.util.ArrayList;

public class Prog_1<T> {
    private ArrayList<T> stack;

    public Prog_1() {
        stack = new ArrayList<>();
    }

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
        	System.out.println("Stack underflow");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Prog_1<Integer> integerStack = new Prog_1<>();

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Display the stack
        integerStack.display();

        // Peek
        System.out.println("Peek: " + integerStack.peek());

        // Deletion
        System.out.println("Pop: " + integerStack.pop());

        // Display the updated stack
        integerStack.display();
        
        
        System.out.println("\n\n");
        
        Prog_1<String> stringStack = new Prog_1<>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");

        // Display the stack
        stringStack.display();

        // Peek
        System.out.println("Peek: " + stringStack.peek());

        // Deletion
        System.out.println("Pop: " + stringStack.pop());

        // Display the updated stack
        stringStack.display();
        
    }
}

