package queue_dsa;

public class QueueCls<T> {

	private T[] data;
	private int SIZE;
	private int front;
	private int rear;
	private String name;

	public String toString() {

		System.out.print(this.name + " => ");

		for (int i = this.front; i <= this.rear; i++) {
			if (this.data[i] != null)
				System.out.print(this.data[i] + " ");
		}
		return "";
	}

	QueueCls(int SIZE) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = -1;
		this.name = "Queue";
	}

	QueueCls(int SIZE, String name) {
		this.data = (T[]) new Object[SIZE];
		this.SIZE = SIZE;
		this.front = this.rear = -1;
		this.name = name;
	}

	boolean isEmpty() {
		return this.rear == this.front;
	}

	boolean isFull() {
		return this.rear >= this.SIZE;
	}

	public void insert(T elem) throws QueueOverflowException {
		if (this.isFull())
			throw new QueueOverflowException();
		if (this.rear == -1)
			this.front = this.rear = 0;

		this.data[rear++] = elem;

	}

	public T serve() throws QueueUnderflowException {
		if (this.isEmpty())
			throw new QueueUnderflowException();
		if (this.front == -1)
			this.front = 0;

		return this.data[front++];

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
