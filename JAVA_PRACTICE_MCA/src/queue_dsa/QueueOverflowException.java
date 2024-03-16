package queue_dsa;

public class QueueOverflowException extends Exception {
	String msg;

	QueueOverflowException() {
		this.msg = "Queue Overflow";
	}

	QueueOverflowException(String msg) {
		this.msg = msg;
	}
}
