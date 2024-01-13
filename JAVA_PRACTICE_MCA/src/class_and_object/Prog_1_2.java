package class_and_object;

/**
2. Create a class Queue to implement queue data structure with constructors. Define suitable
	methods for insertion & deletion of elements to & from the queue. Write a program for this,
	clearly specifying the overflow & underflow conditions.
*/

class Queue{
	private int queue[];
	private int front = -1;
	private int rear = -1;
	
	public Queue(int n){
		this.queue = new int[n];
		this.front = 0;
		this.rear = 0;
	}
	
	public int getAt(int index){
		return this.queue[index];
	}
	
	public void enqueue(int n){
		if(this.rear > this.queue.length-1)
			System.out.println("Queue OVERFLOW");
		else if(this.rear == -1){
			this.rear = this.front = 0;
			this.queue[rear] = n;
			this.rear++;
		}
		else{
			this.queue[rear] = n;
			this.rear++;
		}
		
	}
	
	public int dequeue(){
		if(this.front == -1)
			System.out.println("Queue UNDERFLOW");
		else if(this.front == this.rear)
			this.front = this.rear = -1;
		else{
			int x = this.queue[front];
			this.front++;
			return x;
		}
		return 0;
	}
	
	public void display(){
		System.out.print("QUEUE : ");
		for(int i = this.front; i < this.rear; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println("Front : " + this.front + " | " + "Rear : " + this.rear);
//		System.out.println("\n");
	}
}

public class Prog_1_2 {
	public static void main(String[] args) {
		Queue q1 = new Queue(5);
		
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.display();
		q1.enqueue(6); /* OVERFLOW */
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.dequeue();
		
		q1.display();
		q1.enqueue(5);
		q1.display();
	}

}
