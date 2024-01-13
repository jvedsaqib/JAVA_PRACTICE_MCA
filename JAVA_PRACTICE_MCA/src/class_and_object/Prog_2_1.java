package class_and_object;


/**
 * 1) Create a class called Time that has separate data member for hours, minutes and seconds.
		Define member functions to perform the following tasks: 
		to display the time in the format hh: mm: ss.
		to add times passed as arguments.
		to check which among two times passed as arguments is greater.
		Write a program to test the class and its functions. Use constructor to initialize the instance
		variables of the class Time.
 */	


class Time{
	
	private int hr;
	private int min;
	private int sec;
	
	Time(int hr, int min, int sec){
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	public void display() {
		System.out.println(this.hr + " : " + this.min + " : " + this.sec);
	}
	
	public Time add(Time t) {
		Time result;
		int hr, min, sec;
		
		if(this.sec + t.sec > 60) {
			sec = (this.sec + t.sec) - 60;
			this.min++;
		}else {
			sec = this.sec + t.sec;
		}
		
		if(this.min + t.min > 60) {
			min = this.min + t.min - 60;
			this.hr++;
		}else {
			min = this.min + t.min;
		}
		
		hr = this.hr + t.hr;
		
		result = new Time(hr, min, sec);
		
		return result;
	}
	
	public boolean compare(Time t) {
		
		if(this.hr > t.hr) {
			return true;
		}
		else if(this.hr == t.hr) {
			if(this.min > t.min)
				return true;
			else if(this.min == t.min) {
				if(this.sec > t.sec)
					return true;
				else if(this.sec == t.sec)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	
}

public class Prog_2_1 {
	
	public static void main(String[] args) {
		
		Time t1 = new Time(5, 40, 40);
		Time t2 = new Time(5, 41, 40);
		t1.display();
		t2.display();
		System.out.println(t1.compare(t2));
		System.out.println();

		t1 = t1.add(t2);
		t1.display();
		
		
	}

}
