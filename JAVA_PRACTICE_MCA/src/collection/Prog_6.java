package collection;
import java.util.ArrayList;

/*
 * Write a java program to check the number where 
 * the difference between every adjacent digit should be 1 using ArrayList.
 */
public class Prog_6 {

	public static void main(String[] args) {
		Integer num = 543;
		ArrayList<Integer> a = new ArrayList<>();
		
		Integer temp = num;
		
		while(temp > 0) {
			a.add(temp % 10);
			temp = temp / 10;
		}
		System.out.println(a);
		
		boolean flag = true;
		
		for(int i = 0; i < a.size() - 1; i++) {
			if(Math.abs(a.get(i) - a.get(i+1)) == 1)
				continue;
			else {
				flag = false;
			}
		}
		
		System.out.println(flag ? "Yes" : "No");
		
	}

}
