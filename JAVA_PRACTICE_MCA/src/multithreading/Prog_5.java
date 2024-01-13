package multithreading;

class PuchkaStall {
	int puchkaStock = 0;
	boolean flag = false;

	synchronized void puchkaGiven() {
		while(flag) {
			try { wait(); }catch (Exception e) {}
		}
			
		this.puchkaStock++;
		System.out.println("Puchka : " + puchkaStock);
		
		flag = true;
		notify();
	}

	synchronized void puchkaEaten() {
		while(!flag) {
			try { wait(); }catch (Exception e) {}
		}
		
		this.puchkaStock--;
		System.out.println(Thread.currentThread().getName() + "'s Plate : " + this.puchkaStock);
		
		flag = false;
		notify();
	}

}

class PuchkaWala implements Runnable {
	PuchkaStall p;

	public PuchkaWala(PuchkaStall p) {
		this.p = p;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true) {
			p.puchkaGiven();

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class KhaaneWala implements Runnable {
	PuchkaStall p;

	public KhaaneWala(PuchkaStall p, String s) {
		this.p = p;
		Thread t = new Thread(this, s);
		t.start();
	}

	public void run() {
		while (true) {
			p.puchkaEaten();
			
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		}
	}
}

public class Prog_5 {
	public static void main(String[] args) {
		PuchkaStall p = new PuchkaStall();
		new PuchkaWala(p);
		new KhaaneWala(p, "Disha");
		new KhaaneWala(p, "Saqib");
	}
}
