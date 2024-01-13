package collection;
import java.util.ArrayList;

public class Prog_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);		arr.add(2);		arr.add(3);		arr.add(4);
		
		for(Integer i : arr) {
			System.out.print(i + " ");
		}

	}

}
