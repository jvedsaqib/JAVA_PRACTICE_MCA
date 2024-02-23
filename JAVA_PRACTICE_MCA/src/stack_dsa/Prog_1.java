/*
 * 1. Write a program to implement a Stack class (use a Array to store the elements of the stack).
		[Implement Stack Overflow and Underflow by user defined Exception]. 
		Write a method to check two stack are carrying similar elements or not.
		(Repetition of the elements are not consider)
 */

package stack_dsa;

class StackOverflowException extends Exception {

	String msg;

	StackOverflowException() {
		this.msg = "Stack Overflow";
	}

	StackOverflowException(String msg) {
		this.msg = msg;
	}
}

class StackUnderflowException extends Exception {

	String msg;

	StackUnderflowException() {
		this.msg = "Stack Underflow";
	}

	StackUnderflowException(String msg) {
		this.msg = msg;
	}
}

class StackCls <T>{

	private T[] data;
	private int size;
	private int TOS = -1;
	private String name = null;

	public String toString() {
		if(this.name == null)
			System.out.print("Stack -- ");
		else
			System.out.print(this.name + " -- ");
			
		for (int i = 0; i < this.TOS; i++) {
			System.out.print(this.data[i] + " ");
		}
		return "";
	}

	public StackCls(int size) {
		this.data = (T[])new Object[size];
		this.size = size;
	}
	
	public StackCls(int size, String name) {
		this.data = (T[])new Object[size];
		this.size = size;
		this.name = name;
	}

	public void push(T elem) throws StackOverflowException {

		if (this.TOS == this.data.length - 1)
			throw new StackOverflowException();

		if (this.TOS < 0)
			this.TOS = 0;

		this.data[TOS] = elem;
		TOS++;

	}

	public T pop() throws StackUnderflowException {

		if (this.TOS < 0)
			throw new StackUnderflowException();

		T elem = this.data[TOS - 1];
		TOS--;
		return elem;

	}

	public T peek() throws StackUnderflowException {

		if (this.TOS < 0)
			throw new StackUnderflowException();
		return this.data[TOS - 1];
	}

	public boolean equals(StackCls that) {

		if (this.size != that.size)
			return false;
		else {
			for (int i = 0; i < this.size; i++) {
				if (this.data[i] == that.data[i])
					continue;
				else
					return false;
			}
		}
		return true;

	}

	public int getSize() {
		return size;
	}

	public int getTOS() {
		return TOS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

public class Prog_1 {

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

		StackCls obA = new StackCls(5, "StackA");
		StackCls obB = new StackCls(5, "StackB");
		
		obA.push(1);
		obA.push(2);
		obA.push(3);

		obB.push(1);
		obB.push(2);
		obB.push(3);
		
		System.out.println(obA);
		System.out.println(obB);

		System.out.println(obA.equals(obB));
		
	}

}
