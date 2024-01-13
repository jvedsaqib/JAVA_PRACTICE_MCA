package exception;

/*
 * 3. Write a program to create a class called MyStack that includes functions to perform all
		operations on a stack as well as raises an exception whenever overflow/underflow error
		occurs.
 */

class stackOverflowException extends Exception{
	String message = "";
	stackOverflowException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}

class stackUnderflowException extends Exception{
	String message = "";
	stackUnderflowException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}

class Stack{
	private int stack[];
	private int TOS = -1;
	
	public Stack(int n){
		this.stack = new int[n];
		this.TOS = 0;
	}
	
	public int getTOS(){
		return this.TOS;
	}
	
	public int getAt(int index){
		return this.stack[index];
	}
	
	public void push(int n) throws stackOverflowException{
		if(TOS > this.stack.length-1)
			throw new stackOverflowException("Stack OVERFLOW");
		else{
			stack[TOS] = n;
			this.TOS++;
		}
	}
	
	public int pop() throws stackUnderflowException{
		if(TOS <= 0)
			throw new stackUnderflowException("Stack UNDERFLOW");
		else{
			int x = this.stack[TOS-1];
			TOS--;
			return x;
		}
	}
	
	public void display(){
		for(int i = 0; i < this.TOS; i++){
			System.out.print(stack[i] + " ");
		}
		System.out.println("\n");
	}

}

public class Prog_3 {

	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		try{
			s1.push(5);
			s1.push(4);
			s1.push(3);
			s1.push(2);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.pop();
		}catch(stackOverflowException | stackUnderflowException e){
			System.out.println(e.getMessage());
		}
		
		s1.display();
	}

}
