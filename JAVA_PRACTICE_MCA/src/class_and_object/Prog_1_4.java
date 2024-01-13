package class_and_object;
import java.util.*;


/*
 * 4. The annual examination results of N students are tabulated as follows:
				Roll No. Subject 1 Subject 2 Subject 3
									.....
									.....
			Write a program to read the data and determine the following:
			(a) Total marks obtain by each student
			(b) The highest marks in each subject and the roll no of the student who secured it
			(c) The student who obtained the highest total marks
 * 
 */

class Student{
	private int roll, sub1, sub2, sub3;
	
	public Student(int roll, int sub1, int sub2, int sub3){
		this.roll = roll;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public int getTotalMarks(){
		return this.sub1 + this.sub2 + this.sub3;
	}

	public int getRoll() {
		return roll;
	}

	public int getSub1() {
		return sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public int getSub3() {
		return sub3;
	}
	
	
}

public class Prog_1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students : ");
		int n = sc.nextInt();
		
		Student s1[] = new Student[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("Student #" + (i+1));
			System.out.print("Enter marks of sub1 : ");
			int sub1 = sc.nextInt();
			
			System.out.print("Enter marks of sub2 : ");
			int sub2 = sc.nextInt();
			
			System.out.print("Enter marks of sub3 : ");
			int sub3 = sc.nextInt();
			
			s1[i] = new Student((i+1), sub1, sub2, sub3);
			
		}
		
		System.out.println("\nRoll No \t Sub1 \t Sub2 \t Sub3 \t Total");
		
		for(Student s : s1){
			System.out.print(s.getRoll() + " \t\t " + s.getSub1() + " \t " + s.getSub2() + " \t " + s.getSub3() + " \t " + s.getTotalMarks()+ "\n");
		}
		
		int maxSub1, maxSub2, maxSub3;
		int maxRollSub1, maxRollSub2, maxRollSub3;
		
		maxSub1 = s1[0].getSub1();
		maxSub2 = s1[0].getSub2();
		maxSub3 = s1[0].getSub3();
		
		maxRollSub1 = s1[0].getRoll();
		maxRollSub2 = s1[0].getRoll();
		maxRollSub3 = s1[0].getRoll();
		
		for(int i = 0; i < s1.length; i++){
			if(maxSub1 < s1[i].getSub1()){
				maxSub1 = s1[i].getSub1();
				maxRollSub1 = s1[i].getRoll();
			}
				
			if(maxSub2 < s1[i].getSub2()){
				maxSub2 = s1[i].getSub2();
				maxRollSub2 = s1[i].getRoll();
			}
				
			if(maxSub3 < s1[i].getSub3()){
				maxSub3 = s1[i].getSub3();
				maxRollSub3 = s1[i].getRoll();
			}
		}
		
		System.out.println("Sub1 -> " + maxSub1 + " " + "Sub2 -> " + maxSub2 + " " + "Sub3 -> " + maxSub3);
		System.out.println("Roll -> " + maxRollSub1 + " " + "Sub2 -> " + maxRollSub2 + " " + "Sub3 -> " + maxRollSub3);
		
		int maxTotal = s1[0].getTotalMarks();
		int maxRollTotal = s1[0].getRoll();
		
		for(int i = 0; i < s1.length; i++){
			if(maxTotal < s1[i].getTotalMarks()){
				maxTotal = s1[i].getSub1();
				maxRollTotal = s1[i].getRoll();
			}
		}
		
		System.out.println("Highest Total -> " + maxTotal);
		System.out.println("Roll -> " + maxRollTotal);
		

	}

}
