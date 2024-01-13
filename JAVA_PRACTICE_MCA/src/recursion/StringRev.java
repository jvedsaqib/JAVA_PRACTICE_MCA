package recursion;

public class StringRev {
	
	static String revString(String s) {
		if(s.equals("")) {
			return "";
		}
		return revString(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		
		String s = "Hello Saqib";
		
		System.out.println(s);
		System.out.println(revString(s));
		
	}

}
