package inheritance;

/*
 * 5. Consider an example of book shop which sells books & video tapes. It’s modeled by Book &
		Tape classes. These two classes are inherited from the abstract class called Media. The Media
		class has common data members such as title & publication. The Book class has data
		member for storing a no. of pages in a book & Tape class has the playing time in a tape. Each
		class will have method such as read ( ) & show ( ). Write a program that models this class
		hierarchy & processes objects using reference to base class only.
 */


abstract class Media{
	String title;
	String publication;
	public Media(String title, String publication) {
		this.title = title;
		this.publication = publication;
	}
}

class Book extends Media{
	int numOfPages;
	public Book(String title, String publication, int numOfPages) {
		super(title, publication);
		this.numOfPages = numOfPages;
	}
}

class Tape extends Media{
	double playingTime;
	public Tape(String title, String publication, double playingTime) {
		super(title, publication);
		this.playingTime = playingTime;
	}
	
}

public class Prog_1_5 {

	public static void main(String[] args) {
		
		Media m1 = new Book("A Book", "DISHA PUBLISHERS", 456);
		Media m2 = new Tape("Tiger 3", "SKF", 2.09);
		
		System.out.println("MEDIA #1");
		System.out.println("TITLE : " + m1.title);
		System.out.println("PUBLISHER : " + m1.publication);
		Book b1 = (Book)m1;
		System.out.println("NUMBER OF PAGES : " + b1.numOfPages);
		
		System.out.println();
		
		System.out.println("MEDIA #2");
		System.out.println("TITLE : " + m2.title);
		System.out.println("PUBLISHER : " + m2.publication);
		Tape t1 = (Tape)m2;
		System.out.println("PLAYING TIME : " + t1.playingTime);

	}

}
