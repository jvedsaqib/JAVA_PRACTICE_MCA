package queue_dsa;

public class QueueUnderflowException extends Exception {
	String msg;

	QueueUnderflowException() {
		this.msg = "Queue Overflow";
	}

	QueueUnderflowException(String msg) {
		this.msg = msg;
	}

}
