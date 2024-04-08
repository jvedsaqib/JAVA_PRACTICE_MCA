package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Prog_3 {
	static ArrayList<String> a = new ArrayList<>();

	public static void createInpThread() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter string or 'exit' to exit\n");
			System.out.print("?- ");

			String s = sc.nextLine();
			if (!s.equals("exit"))
				a.add(s);
			else
				break;
		}
		sc.close();
	}

	public static void createSortThread() {
		Collections.sort(a);
		try {
			System.out.print("Sorting");
			for (int i = 0; i < new Random().nextInt(5); i++) {
				Thread.sleep(700);
				System.out.print(".");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createDisplayThread() {
		System.out.println("\n" + a);
	}

	public static void main(String[] args) {

		Thread inpThread = new Thread(() -> createInpThread());

		Thread sortThread = new Thread(() -> createSortThread());

		Thread displayThread = new Thread(() -> createDisplayThread());

		inpThread.start();

		try {
			inpThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		sortThread.start();

		try {
			sortThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		displayThread.start();

	}
}