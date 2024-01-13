package interfaceClass.prog4;

public class Student extends Hostel implements Department {
	String studentName;
	String regdNo;
	String electiveSubject;
	String avgMarks;
	String deptName;
	String deptHead;
	
	public String toString(){
		return this.studentName + " " + this.regdNo;
	}
	
	public Student(String studentName, String regdNo, String electiveSubject,
			String avgMarks, Hostel ob, String deptName, String deptHead) {
		super(ob);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
		this.deptName = deptName;
		this.deptHead = deptHead;
	}
	
	

	public String getData() {
		return this.toString();
	}

	public String getDeptName() {
		return this.deptName;
	}

	public String getDeptHead() {
		return this.deptHead;
	}
	
	
	
	
	
}
