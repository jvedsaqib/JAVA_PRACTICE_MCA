package queue_dsa;

import java.util.*;

public class Prog2 {

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		Scanner sc = new Scanner(System.in);
		CircularLVQueueCls<Integer> q1 = new CircularLVQueueCls<Integer>(5);
		CircularCEQueueCls<Integer> q2 = new CircularCEQueueCls<Integer>(5);
		
		int choice = 0;
		int subchoice = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("Enter Choice - ");
			choice = sc.nextInt();
			switch(choice) {
			
			case 0:
				flag = false;
				break;
				
			case 1:
				System.out.print("Enter Sub-Choice - ");
				subchoice = sc.nextInt();
				switch(subchoice) {
				case 1:
					System.out.print("Element to insert - ");
					int elem = sc.nextInt();
					q1.insert(elem);
					System.out.println("Front = " + q1.getFront() + " -- " + "Rear = " + q1.getRear());
					break;
				case 2:
					System.out.println(q1.serve());
					System.out.println("Front = " + q1.getFront() + " -- " + "Rear = " + q1.getRear());
					break;
				case 3:
					System.out.println(q1);
					System.out.println("Front = " + q1.getFront() + " -- " + "Rear = " + q1.getRear());
					break;
				}
				break;
			
			case 2:
				System.out.print("Enter Sub-Choice - ");
				subchoice = sc.nextInt();
				switch(subchoice) {
				case 1:
					System.out.print("Element to insert - ");
					int elem = sc.nextInt();
					q2.insert(elem);
					System.out.println("Front = " + q2.getFront() + " -- " + "Rear = " + q2.getRear());
					break;
				case 2:
					System.out.println(q2.serve());
					System.out.println("Front = " + q2.getFront() + " -- " + "Rear = " + q2.getRear());
					break;
				case 3:
					System.out.println(q2);
					System.out.println("Front = " + q2.getFront() + " -- " + "Rear = " + q2.getRear());
					break;
				}
				break;
			
			}
		}
		
		sc.close();
	}

}
