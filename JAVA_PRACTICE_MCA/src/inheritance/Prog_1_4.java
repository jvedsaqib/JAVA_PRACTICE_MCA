package inheritance;
import java.util.*;

/*
 * 4. An educational institution wishes to maintain a database of its employees. The database is
		divided into a number of classes whose hierarchical relationships are shown below. Write all
		the classes and defines the methods to create the database and retrieve individual information
		as and when needed.
		Write a driver program to test the classes.
		Staff (code, name)
		Teacher (subject, publication) is a Staff
		Officer (grade) is a Staff
		Typist (speed) is a Staff
		RegularTypist (remuneration) is a Typist
		CasualTypist (daily wages) is a Typist.
 * 
 */

class Staff{
	int code;
	String name;
	Staff(int code, String name) {
		this.code = code;
		this.name = name;
	}
}

class Teacher extends Staff{

	String publication, subject;
	
	Teacher(int code, String name, String publication, String subject) {
		super(code, name);
		this.publication = publication;
		this.subject = subject;
	}
}

class Officer extends Staff{
	
	String grade;
	
	Officer(int code, String name, String grade) {
		super(code, name);
		this.grade = grade;
	}
}

class Typist extends Staff{

	double speed;
	
	Typist(int code, String name, double speed) {
		super(code, name);
		this.speed = speed;
	}
}

class RegularTypist extends Typist{

	double remuneration;
	
	RegularTypist(int code, String name, double speed, double remuneration) {
		super(code, name, speed);
		this.remuneration = remuneration;
	}
}

class CasualTypist extends Typist{

	double dailyWage;
	
	CasualTypist(int code, String name, double speed, double dailyWage) {
		super(code, name, speed);
		this.dailyWage = dailyWage;
	}
}

public class Prog_1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){
			System.out.println("1) Staff\t\t2) Teacher\t\t3)Officer\t\t4)Typist\t\t0)EXIT\n");
			System.out.print("Input :: ");
			
			int choice = sc.nextInt();
			switch(choice){
			case 0:
				flag = false;
				break;
			case 1:
				
			}
		}
		
		sc.close();

	}

}
