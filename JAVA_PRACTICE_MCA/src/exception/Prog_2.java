package exception;
import java.util.*;

/*
 * 2. Define an exception called “NoMatchFoundException” that is thrown when a string is
		not equal to “University”. Write a program that uses this exception.
 */

class NoMatchFoundException extends Exception{
	String message = "";
	NoMatchFoundException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}

public class Prog_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			String key = "";
			System.out.print("ENTER KEY - ");
			key = sc.next();
			if(!key.equals("UNIVERSITY"))
				throw new NoMatchFoundException("INVALID INPUT");
			else{
				System.out.println("ACCESS GRANTED");
			}
		}catch(NoMatchFoundException e){
			System.out.println(e.getMessage());
		}finally{
			sc.close();
		}
		
	}

}
