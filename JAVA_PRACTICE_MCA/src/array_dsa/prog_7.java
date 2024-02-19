/*
 * 7. Create a program with multi-dimensional List to store customer details 
 * (customerId, customerName, customerCity).
	This program to search the customer based on the customerName from a given array.
		Note: use Binary search and Insertion sort algorithm.
			 Create a constructor to initialize size of customer details for five customers.
			 Create customer method which takes the array of customer elements (sorted as a
				customerName).
			 Create a method to getCustomer(customerId) method which will return the customer
				details as a List.
			 Create a method to sortCustomer() method which will return the array in a sorted
				order based on customer city.
	DONE
 */

/*
 * customerID	customerName	customerCity
   -----------	------------	--------------
	cx802			A				Kolkata
	cx729			B				Bengaluru
	cx162			C				Delhi
	cx999			D				Kolkata
	cx101			E				Chennai
 */

package array_dsa;

import java.util.*;

class Customer {
	private String customerID;
	private String customerName;
	private String customerCity;

	public Customer(String customerID, String customerName, String customerCity) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}

class Record {
	Customer[] record;

	Record(int size) {
		this.record = new Customer[size];
	}

	Record() {
		this.record = new Customer[5];

		// 1
		record[0] = new Customer(null, null, null);
		record[0].setCustomerID("cx802");
		record[0].setCustomerName("A");
		record[0].setCustomerCity("Kolkata".toUpperCase());

		// 4
		record[3] = new Customer(null, null, null);
		record[3].setCustomerID("cx729");
		record[3].setCustomerName("B");
		record[3].setCustomerCity("Bengaluru".toUpperCase());

		// 5
		record[4] = new Customer(null, null, null);
		record[4].setCustomerID("cx162");
		record[4].setCustomerName("C");
		record[4].setCustomerCity("Delhi".toUpperCase());

		// 2
		record[1] = new Customer(null, null, null);
		record[1].setCustomerID("cx999");
		record[1].setCustomerName("D");
		record[1].setCustomerCity("Kolkata".toUpperCase());

		// 3
		record[2] = new Customer(null, null, null);
		record[2].setCustomerID("cx101");
		record[2].setCustomerName("E");
		record[2].setCustomerCity("Chennai".toUpperCase());
	}

	boolean insertDetails() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < record.length; i++) {
			System.out.println("Enter Customer ID : ");
			String id = sc.next();
			System.out.println("Enter Customer Name : ");
			String name = sc.next();
			System.out.println("Enter Customer City : ");
			String city = sc.next().toUpperCase();

			record[i] = new Customer(id, name, city);
		}

		sc.close();
		return true;
	}

	void displayDetails(String msg) {
		System.out.println("------------------------" + msg + "------------------------");
		System.out.print("CustomerID\t\tCustomerName\t\tCustomerCity\n");
		System.out.print("-----------\t\t------------\t\t------------\n");
		for (Customer ob : this.record) {
			System.out.print(
					ob.getCustomerID() + "\t\t\t" + ob.getCustomerName() + "\t\t\t" + ob.getCustomerCity() + "\n");
		}
		System.out.println("-----X-------------X---------------X---------------X------\n");
	}

	void getCustomer(String key) {

		Integer first = 0;
		Integer last = this.record.length;
		Integer mid = (first + last) / 2;
		while (first <= last) {
//			System.out.println("Checking - " + this.record[mid].getCustomerID() + " "
//					+ this.record[mid].getCustomerName() + " " + this.record[mid].getCustomerCity());
			if (this.record[mid].getCustomerID().compareTo(key) == -1) {
				first = mid + 1;
			} else if (this.record[mid].getCustomerID().compareTo(key) == 0) {
				System.out.println("Found - " + this.record[mid].getCustomerID() + " "
						+ this.record[mid].getCustomerName() + " " + this.record[mid].getCustomerCity());
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		if (first > last) {
			System.err.println("ID not found!");
		}
	}

	void sortByCxID() {

		int n = this.record.length;
		for (int j = 1; j < n; j++) {
			Customer key = this.record[j];
			int i = j - 1;
			while ((i > -1) && (this.record[i].getCustomerID().compareTo(key.getCustomerID())) > 0) {
				this.record[i + 1] = this.record[i];
				i--;
			}
			this.record[i + 1] = key;
		}

	}
	
	void sortByCxName() {

		int n = this.record.length;
		for (int j = 1; j < n; j++) {
			Customer key = this.record[j];
			int i = j - 1;
			while ((i > -1) && (this.record[i].getCustomerName().compareTo(key.getCustomerName())) > 0) {
				this.record[i + 1] = this.record[i];
				i--;
			}
			this.record[i + 1] = key;
		}

	}
	
	void sortByCxCity() {

		int n = this.record.length;
		for (int j = 1; j < n; j++) {
			Customer key = this.record[j];
			int i = j - 1;
			while ((i > -1) && (this.record[i].getCustomerCity().compareTo(key.getCustomerCity())) > 0) {
				this.record[i + 1] = this.record[i];
				i--;
			}
			this.record[i + 1] = key;
		}

	}

}

public class prog_7 {
	
	// --------------------------------- MAIN
	// ---------------@Saqib---------------------

	public static void main(String[] args) {

		Record cxRecords = new Record();

		cxRecords.displayDetails("Orignal Records");

		cxRecords.sortByCxID();

		cxRecords.displayDetails("Sorted Records by ID");

		System.out.println("===========================Looking for=====================\ncx101\n");
		cxRecords.getCustomer("cx101");
		System.out.println("========================================================\n");
		
		System.out.println("===========================Looking for=====================\ncx501\n");
		cxRecords.getCustomer("cx501");
		System.out.println("========================================================\n");

		cxRecords.sortByCxName();

		cxRecords.displayDetails("Sorted Records by NAME");
		
		cxRecords.sortByCxCity();

		cxRecords.displayDetails("Sorted Records by CITY");
	}

}


/*
 * OUTPUT -
		------------------------Orignal Records------------------------
		CustomerID		CustomerName		CustomerCity
		-----------		------------		------------
		cx802			A			KOLKATA
		cx999			D			KOLKATA
		cx101			E			CHENNAI
		cx729			B			BENGALURU
		cx162			C			DELHI
		-----X-------------X---------------X---------------X------
		
		------------------------Sorted Records by ID------------------------
		CustomerID		CustomerName		CustomerCity
		-----------		------------		------------
		cx101			E			CHENNAI
		cx162			C			DELHI
		cx729			B			BENGALURU
		cx802			A			KOLKATA
		cx999			D			KOLKATA
		-----X-------------X---------------X---------------X------
		
		===========================Looking for=====================
		cx101
		
		Found - cx101 E CHENNAI
		========================================================
		
		===========================Looking for=====================
		cx501
		
		ID not found!
		========================================================
		
		------------------------Sorted Records by NAME------------------------
		CustomerID		CustomerName		CustomerCity
		-----------		------------		------------
		cx802			A			KOLKATA
		cx729			B			BENGALURU
		cx162			C			DELHI
		cx999			D			KOLKATA
		cx101			E			CHENNAI
		-----X-------------X---------------X---------------X------
		
		------------------------Sorted Records by CITY------------------------
		CustomerID		CustomerName		CustomerCity
		-----------		------------		------------
		cx729			B			BENGALURU
		cx101			E			CHENNAI
		cx162			C			DELHI
		cx802			A			KOLKATA
		cx999			D			KOLKATA
		-----X-------------X---------------X---------------X------ 
*/