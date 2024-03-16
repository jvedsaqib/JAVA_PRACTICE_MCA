/*
 * 1. Write a program to implement a Queue class 
   (use a list to store the elements of the Queue). 
	[Implement Queue Overflow and Underflow by Exception]. 
	Write a method to check two Queue are carrying similar elements or not. 
	(Repetition of the elements are not consider)
 */

package queue_dsa;

public class Prog1 {

	static <T> boolean checkQueue(QueueCls ob) {
		for (int i = ob.getFront(); i <= ob.getRear(); i++) {
			for (int j = i + 1; j <= ob.getRear(); j++) {
				if (ob.get(i) == ob.get(j) && ob.get(i) != null && ob.get(j) != null)
					System.out.println("Duplicate element exists");
				return false;
			}
		}
		return true;
	}

	static <T> boolean equals(QueueCls ob1, QueueCls ob2) {
		if (ob1.getSIZE() != ob2.getSIZE())
			return false;
		else if (checkQueue(ob1) || checkQueue(ob2)) {
			System.out.println("Duplicate Elements present in either of QUEUE");
			return false;
		} else {
			for (int i = ob1.getFront(); i <= ob1.getRear(); i++)
				if (ob1.get(i) == ob2.get(i))
					continue;
				else
					return false;
		}
		return true;
	}

	public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
		QueueCls<Integer> q1 = new QueueCls<Integer>(5, "queue-1");
		QueueCls<Integer> q2 = new QueueCls<Integer>(5, "queue-2");

		q1.insert(1);
		q1.insert(1);
		q1.insert(3);

		q2.insert(6);
		q2.insert(2);
		q2.insert(3);

		System.out.println(q1);
		System.out.println(q2);

		System.out.println(equals(q1, q2));

	}

}
