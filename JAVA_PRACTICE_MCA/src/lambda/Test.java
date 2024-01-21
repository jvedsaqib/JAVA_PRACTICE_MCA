package lambda;


/*
 * Write the following methods that return a lambda expression performing a specified action:
		isOdd(): The lambda expression must return true if a number is odd or false if it is even.
		isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
		isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
 */

public class Test {
	
	interface Odd{
		boolean isOdd(int num);		// functional Interface
	}
	
	interface Prime{
		boolean isPrime(int num);
	}

	public static void main(String[] args) {
		Odd o = (num) -> {
			return (num % 2) != 0;
		};
		
		Prime p = (num) -> {
			for(int i = 2; i < num / 2; i++) {
				if(num % i == 0)
					return false;
			}
			return true;
		};
		
		System.out.println(o.isOdd(11));
		System.out.println(p.isPrime(5));
	}

}
