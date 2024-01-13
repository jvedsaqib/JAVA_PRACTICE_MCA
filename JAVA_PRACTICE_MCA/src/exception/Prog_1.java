package exception;
import java.util.*;

/*
 * 1. Write a program called Factorial.java that computes factorials and catches the result in an
		array of type long for reuse. The long type of variable has its own range. For example 20!
		Is as high as the range of long type. So check the argument passes and “throw an
		exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
		Exception with a message “Value of x must be positive”.If x is above the length of the
		array throw an IllegalArgumentException with a message “Result will overflow”.
		Here x is the value for which we want to find the factorial.
 */

public class Prog_1 {
	
	public static long fact(long n){
		long factRes = 1;
		
		for(long i = n; i >= 1; i--){
			factRes = factRes * i;
		}
		
		return factRes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long factArr[] = new long[20];
		
		int n = 0;
		System.out.print("Enter range : - ");
		n = sc.nextInt();
		try{
			if(n < 0){
				throw new IllegalArgumentException("Value of x must be positive");
			}else if(n > 20){
				throw new IllegalArgumentException("Result will overflow");
			}
			else{
				for(int i = 1; i <= n; i++){
					factArr[i-1] = fact(i);
				}
				for(long i : factArr){
					if(i > 0)
						System.out.println(i);
				}
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}finally{
			sc.close();
		}
		
		

	}

}
