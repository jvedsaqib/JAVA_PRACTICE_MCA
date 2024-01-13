package interfaceClass.prog4;
import java.util.*;

/*
 * 4. Create an interface Department containing attributes deptName and deptHead. It also
		has abstract methods for getting data and printing the attributes. Create a class hostel
		containing hostelName, hostelLocation and numberofRooms. The class contains methods
		for getting and printing the attributes. Then write Student class extending the Hostel
		class and implementing the Department interface. This class contains attributes
		studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
		printData methods for this class. Also implement the abstract methods of the Department
		interface. Write a driver class to test the Student class. The program should be menu
		driven containing the options:
		i) Admit new student
		ii) Migrate a student
		iii) Display details of a student
		For the third option a search is to be made on the basis of the entered registration number.
 */

public class Driver {

	
	public static void main(String[] args) {
		String studentName, regdNo, electiveSubject, avgMarks, deptName, deptHead, key;
		Scanner sc = new Scanner(System.in);
		int choice, count = 0;
		
		Hostel ob = new Hostel("ABC", "KOLKATA", 15);
		
		Student s[] = new Student[10];
		
		boolean flag = true;
		while(flag){
			System.out.println("\n0) EXIT \n1) Admit new Student \n2) Migrate a student \n3) Display details of a student");
			System.out.println("\nEnter choice :");
			
			choice = sc.nextInt();
			
			switch(choice){
			case 0 :
				flag = false;
				break;
			case 1 :
				
				
				System.out.print("Enter student name : ");
				studentName = sc.next();
				
				System.out.print("Enter student regdNo : ");
				regdNo = sc.next();
				
				System.out.print("Enter student electiveSubject : ");
				electiveSubject = sc.next();
				
				System.out.print("Enter student avgMarks : ");
				avgMarks = sc.next();
				
				System.out.print("Enter student deptName : ");
				deptName = sc.next();
				
				System.out.print("Enter student deptHead : ");
				deptHead = sc.next();
				
				s[count] = new Student(studentName, regdNo, electiveSubject, avgMarks, ob, deptName, deptHead);
				count++;
				break;
			case 2 :
				break;
			case 3 :
				System.out.print("Enter redgNo : ");
				key = sc.next();
				for(Student stu : s){
					if(stu != null){
						if(stu.regdNo.equals(key)){
							System.out.println(stu);
							break;
						}
					}
				}
				break;
			default:
				
			}
		}
		
		sc.close();

	}

}
