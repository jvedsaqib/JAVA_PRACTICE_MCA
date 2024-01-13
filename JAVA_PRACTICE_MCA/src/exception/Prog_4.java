package exception;
/*
 * 4. Write a class that keeps a running total of all characters passed to it (one at a time) and
		throws an exception if it is passed a non-alphabetic character.
 */


class NotALetterException extends Exception {

	  static int count=0;
	  String msg;
	  
	  
	  public NotALetterException(String msg) {
	    this.msg = msg;
	  }
	  

	  public static void countLetter(char c) throws NotALetterException {
	  

	    if (Character.isAlphabetic(c)) {
	      count++;
	    }
	    else {
	      throw new NotALetterException(c + " is not a letter"); 
	    }
	  
	  
	  }

	}

public class Prog_4 {

	 public static void main(String[] args) {
			String s = "abcj2sad";
			char arr[] = s.toCharArray();
			
			try {
				for(char c : arr) {
					NotALetterException.countLetter(c);
				}
				System.out.println(NotALetterException.count);
			}catch(NotALetterException e) {
				System.out.println(e.msg);
			}
		}

}
