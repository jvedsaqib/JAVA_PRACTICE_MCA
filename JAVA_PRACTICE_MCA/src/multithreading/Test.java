package multithreading;

class ThreadExample {

	Thread t = new Thread(() -> {
		int c = 0;
		boolean flag = false;

		while (flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			c++;
			System.out.println(Thread.currentThread().getName() + " " + c);
		}
		flag = true;
		notify();
	}, "A");

	Thread t2 = new Thread(() -> {
		int c = 0;
		boolean flag = true;

		while (!flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			c++;
			System.out.println(Thread.currentThread().getName() + " " + c);
		}
		flag = false;
		notify();
	}, "B");

}

public class Test {

	public static void main(String[] args) {

	}

}
