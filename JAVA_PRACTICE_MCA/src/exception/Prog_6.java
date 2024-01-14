package exception;
/*
 * 6. Write a program that takes a value at the command line for which factorial is to be
		computed. The program must convert the string to its integer equivalent. 
		There are three possible user input errors that can prevent the program from executing normally.
		
		The first error is when the user provides no argument while executing the program and an
		ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
		
		The second error is NumberFormatException that is raised in case the user provides a
		non-integer (float double) value at the command line.
		
		The third error is IllegalArgumentException. This needs to be thrown manually if the value at the command line is 0.
 */

public class Prog_6 {
	
	public static int fact(int n){
		int factRes = 1;
		
		for(int i = n; i >= 1; i--){
			factRes = factRes * i;
		}
		
		return factRes;
	}

	public static void main(String[] args) {
		try{
			if(Integer.parseInt(args[0]) == 0)
				throw new IllegalArgumentException();
			fact(Integer.parseInt(args[0]));
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No Argument");
		}
		catch(NumberFormatException e){
			System.out.println("Non-integer provided");
		}
		catch(IllegalArgumentException e){
			System.out.println("Zero provided");
		}
	}

}
