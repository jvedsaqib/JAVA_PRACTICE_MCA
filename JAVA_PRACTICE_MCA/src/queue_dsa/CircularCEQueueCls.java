package queue_dsa;

public class CircularCEQueueCls<T> {

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
			for (i = this.front; i != this.rear; i = (i + 1) % this.SIZE)
				System.out.print(this.data[i] + " ");
			System.out.println(this.data[i]);
		}
		return "";
	}

	CircularCEQueueCls(int SIZE) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = -1;
		this.name = "Queue";
	}

	CircularCEQueueCls(int SIZE, String name) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = -1;
		this.name = name;
	}

	boolean isEmpty() {
		return this.front == -1;
	}

	boolean isFull() {
		return this.rear >= this.SIZE;
	}

	public void insert(T elem) throws QueueOverflowException {
		if ((this.front == 0 && this.rear == this.SIZE - 1) || this.front == this.rear + 1)
			throw new QueueOverflowException();
		else if (this.front == -1 && this.rear == -1) {
			this.front = 0;
			this.rear = 0;
			this.data[this.rear] = elem;
		} else if (this.front != 0 && this.rear == this.SIZE - 1) {
			this.rear = 0;
			this.data[this.rear] = elem;
		} else {
			this.rear++;
			this.data[this.rear] = elem;
		}
	}

	public T serve() throws QueueUnderflowException {
		if (this.front == -1 && this.rear == -1)
			throw new QueueUnderflowException();
		T val = this.data[this.front];
		if (this.front == this.rear)
			this.front = this.rear = -1;
		else {
			if (this.front == this.SIZE - 1)
				this.front = 0;
			else {
				this.front++;
			}
		}
		return val;
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
