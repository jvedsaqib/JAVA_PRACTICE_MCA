package exception;

/*
 * 5. Write a program that outputs the name of the capital of the country entered at the
		command line. The program should throw a �NoMatchFoundException� when it fails to
		print the capital of the country entered at the command line.
 */

class NoMatchFoundException1 extends Exception{
	String message = "";
	NoMatchFoundException1(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}


public class Prog_5 {

	public static void main(String[] args) {
		
		try{
			for(String s : args){
				if(s.toUpperCase().equals("INDIA"))
					System.out.println(s + " capital - " + "NEW DELHI");
				else if(s.toUpperCase().equals("AUSTRALIA"))
					System.out.println(s + " capital - " + "Canberra");
				else if(s.toUpperCase().equals("CANADA"))
					System.out.println(s + " capital - " + "INDIA");
				else if(s.toUpperCase().equals("US"))
					System.out.println(s + " capital - " + "Washington, D.C.");
				else{
					throw new NoMatchFoundException1("INVALID INPUT");
				}
			}
		}catch(NoMatchFoundException1 e){
			System.out.println(e.getMessage());
		}
		
	}

}
