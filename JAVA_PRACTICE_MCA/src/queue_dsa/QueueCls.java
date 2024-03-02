package queue_dsa;

public class QueueCls {
	
	int front;
	int rear;
	int size;
	int queue[];
	
	
	public QueueCls(int size) {
		this.size = size;
		this.front = this.rear = -1;
		this.queue = new int[size];
	}
	
	
	boolean isEmpty() {
		return this.rear == this.front;
	}

	boolean isFull() {
		return this.rear >= this.size;
	}
	
	void insert(int data) {
		if(this.isFull()) {
			System.out.println("Queue is full");
			return;
		}
		this.queue[++this.rear] = data;
	}
	
	void serve() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
