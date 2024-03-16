package queue_dsa;

public class CircularLVQueueCls<T> {

	private T[] data;
	private int SIZE;
	private int front;
	private int rear;
	private String name;

	public String toString() {

		System.out.print(this.name + " => ");

		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Elements -> ");
			for (i = this.front+1; i != this.rear; i = (i + 1) % this.SIZE)
				System.out.print(this.data[i] + " ");
			System.out.println(this.data[i]);
		}
		return "";
	}

	CircularLVQueueCls(int SIZE) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = 0;
		this.name = "Queue";
	}

	CircularLVQueueCls(int SIZE, String name) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = 0;
		this.name = name;
	}

	boolean isEmpty() {
		return this.rear == this.front;
	}

	boolean isFull() {
		return this.rear >= this.SIZE;
	}

	public void insert(T elem) throws QueueOverflowException {
		int new_rear = (this.rear + 1) % this.SIZE;

		if (this.isFull() || this.front == new_rear)
			throw new QueueOverflowException();
		
		this.rear = new_rear;
		this.data[rear] = elem;
	}

	public T serve() throws QueueUnderflowException {
		if (this.isEmpty())
			throw new QueueUnderflowException();
		this.front = (this.front + 1) % this.SIZE;
		return this.data[this.front];
	}
	
	public T get(int index) {
		return this.data[index];
	}

	public int getSIZE() {
		return this.SIZE;
	}

	public int getFront() {
		return this.front;
	}

	public int getRear() {
		return this.rear;
	}
	
}
