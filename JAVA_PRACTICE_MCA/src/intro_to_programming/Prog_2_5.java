package intro_to_programming;
import java.util.*;


/*
 * The straight-line method of computing the early depreciation of the value of an item is
	given by:

		Depreciation = (Purchase price - Salvage value) / Years of service

	Write a program to determine the salvage value of an item when the purchase price years
	of service & the annual depreciation is given.
 */

public class Prog_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double depreciation, purchasePrice, salvageValue, YoS;
		
		System.out.println("Enter Purchase Price - ");
		purchasePrice = sc.nextDouble();
		
		System.out.println("Enter Depreciation - ");
		depreciation = sc.nextDouble();
		
		System.out.println("Enter Years of Service - ");
		YoS = sc.nextDouble();
		
		salvageValue = purchasePrice - (depreciation * YoS);
		
		System.out.println("Depreciation" + " \t " + "Purchase_Price" + " \t " + "Years_of_Service" + " \t " + "Salvage_value");
		System.out.println(depreciation + " \t\t " + purchasePrice + " \t\t " + YoS + " \t\t " + salvageValue);

	}

}
