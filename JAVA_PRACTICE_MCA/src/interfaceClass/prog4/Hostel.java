package interfaceClass.prog4;

public class Hostel {
	String hostelName;
	String hostelLocation;
	int numberOfRooms;

	public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.numberOfRooms = numberOfRooms;
	}

	public Hostel(Hostel ob) {
		this.hostelName = ob.hostelName;
		this.hostelLocation = ob.hostelLocation;
		this.numberOfRooms = ob.numberOfRooms;
	}
	
	
}
