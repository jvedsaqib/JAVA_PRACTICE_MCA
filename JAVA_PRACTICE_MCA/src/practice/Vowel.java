package practice;

public class Vowel {
	Integer vCount = 0;
	public void vowelCount(Character c) {
		Character temp = Character.toUpperCase(c);
		
		if(temp.equals('A') || temp.equals('E') || temp.equals('I') || temp.equals('O') || temp.equals('U'))
			this.vCount++;
	}
	
	public int getVCount() {
		return this.vCount;
	}

	public static void main(String[] args) {
		Vowel v = new Vowel();
		
//		v.vowelCount('A');
//		v.vowelCount('B');
//		v.vowelCount('C');
//		v.vowelCount('e');
//		
//		System.out.println(v.getVCount());	// 2
		
		for(char i = 'a'; i<='z' ;i++)
			v.vowelCount(i);
		
		System.out.println(v.getVCount());		// 5

	}

}