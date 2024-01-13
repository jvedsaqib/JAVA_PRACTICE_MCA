package class_and_object;
import java.util.*;

/*	
  	 1. Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and
		display( ) operations on the stack. Create two stacks and write a menu-driven program to
		perform operations on the two stacks. Whenever the number of elements in the two stacks
		becomes equal, a message should automatically be generated displaying the number of elements
		in each stack.
 */


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
	
	public void push(int n){
		if(TOS > this.stack.length-1)
			System.out.println("Stack OVERFLOW");
		else{
			stack[TOS] = n;
			this.TOS++;
		}
	}
	
	public int pop(){
		if(TOS <= 0)
			System.out.println("Stack UNDERFLOW");
		else{
			int x = this.stack[TOS-1];
			TOS--;
			return x;
		}
		return 0;
	}
	
	public void display(){
		for(int i = 0; i < this.TOS; i++){
			System.out.print(stack[i] + " ");
		}
		System.out.println("\n");
	}
	
	public boolean equal(Stack stack2){
		boolean flag = true;
		if(this.TOS == stack2.getTOS()){
			for(int i = 0; i < this.TOS; i++){
				if(this.stack[i] != stack2.getAt(i))
					flag = false;
			}
		}else{
			flag = false;
		}
		
		return flag;
	}

}

public class Prog_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Stack s1 = new Stack(5);
		Stack s2 = new Stack(5);
		
		boolean flag = true;
		
		while(flag){
			System.out.println("Choose between two stacks : 1 or 2\ntype 0 to exit");
			System.out.println("Enter which stack you want to use : ");
			int stackOption = sc.nextInt();
			switch(stackOption){
			case 0:
				flag = false;
				break;
			case 1:
				System.out.println("1)push\n2)pop\n3)display\n4)equal?\n5)cancel");
				System.out.println("Enter which operation you want to use : ");
				int stackOperation = sc.nextInt();
				switch(stackOperation){
				case 1:
					System.out.println("Enter element : ");
					int elem = sc.nextInt();
					s1.push(elem);
					break;
				case 2:
					System.out.println("Element Popped -> " + s1.pop());
					break;
				case 3:
					s1.display();
					break;
				case 4:
					if(s1.equal(s2)){
						System.out.println("Equal Stacks\n");
						s1.display();
						s2.display();
					}else{
						System.out.println("Not Equal Stacks\n");
						s1.display();
						s2.display();
					}
						
				case 5:
					break;
				default:
					System.out.println("Invalid input, try again !!\n");
				}
				break;
			case 2:
				System.out.println("1)push\n2)pop\n3)display\n4)equal?\n5)cancel");
				System.out.println("Enter which operation you want to use : ");
				stackOperation = sc.nextInt();
				switch(stackOperation){
				case 1:
					System.out.println("Enter element : ");
					int elem = sc.nextInt();
					s2.push(elem);
					break;
				case 2:
					System.out.println("Element Popped -> " + s2.pop());
					break;
				case 3:
					s2.display();
					break;
				case 4:
					if(s2.equal(s1)){
						System.out.println("Equal Stacks\n");
						s1.display();
						s2.display();
					}else{
						System.out.println("Not Equal Stacks\n");
						s1.display();
						s2.display();
					}
						
				case 5:
					break;
				default:
					System.out.println("Invalid input, try again !!\n");
				}
				break;
			default:
				System.out.println("Invalid input, try again !!\n");
			}
		}
	}

}
