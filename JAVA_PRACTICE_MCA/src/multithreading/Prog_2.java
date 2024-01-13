package multithreading;

import java.util.Random;

class Display {
	public synchronized void display(String s) {
		for (int i = 0; i < new Random().nextInt(10); i++) 
			System.out.print(" ");
		
		System.out.print(s);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Prog_2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Display ob = new Display();
				for(int i = 1; i <= 5; i++)
					ob.display("Ping");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Display ob = new Display();
				for(int i = 1; i <= 5; i++)
					ob.display("Pong");
			}
		});
		
		t1.start();
//		try { t1.join(); } catch(Exception e) {}
		t2.start();
		
	}

}
