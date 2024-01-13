package practice;

public class Sridharacharya {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 1;
		double r1, r2;
		
		double ds = (b*b) - (4 * a * c);
		
		if(ds == 0) {
			r1 = r2 = (-b) / 2 * a;
		}
		else if(ds > 0) {
			r1 = (-b + Math.sqrt(ds)) / 2 * a;
			r2 = (-b - Math.sqrt(ds)) / 2 * a;
		}
		else {
			r1 = (-b / 2 * a) + (Math.sqrt(-ds) / 2 * a);
			r2 = (-b / 2 * a) - (Math.sqrt(-ds) / 2 * a);
		}
		
		System.out.println("Roots are -> " + r1 + " and " + r2);

	}

}
