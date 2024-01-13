package inheritance;

import java.util.Scanner;
/*
 * 6. Assume that a Bank maintains two kinds of accounts for its customers, one called savings
		account and the other current account. The savings account provides compound interest and
		withdrawal facilities. The current account provides no interest. Current account holders
		should maintain balance and if the balance falls below this level, a service charge is imposed.
		o Create a class Account that stores customers name, account number and type of the
		account. From this derive the classes CurAccount and SavAccount to make them
		more specific to their requirements.
		o Include the necessary methods in order to achieve the following tasks:
		Assign initial values
		Accept deposit from a customer and update the balance
		Permit withdrawal and update the balance
		Compute and deposit interest
		Check for the minimum balance, impose penalty, if necessary, and update it.
		Display the balance
		o Write a program that creates an array of Bank Account and displays a menu that lets a
		new account to be created, perform deposit and withdrawal transactions on the basis
		of account number, display the balance of account holder for whom the account
		number is provided.
 */

class Account{
	private String nameOfDepositor, accountNumber, accountType;
	private double balance;
	
	
	
	public Account(String nameOfDepositor, String accountNumber, String accountType) {
		this.nameOfDepositor = nameOfDepositor;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public boolean deposit(double amount){
		this.balance += amount;
		return true;
	}
	
	public double withdraw(double amount){
		if(amount <= this.balance){
			this.balance -= amount;
			System.out.println(amount + " withdrawn ||| " + this.balance + " remaining");
			return amount;
		}
		else{
			System.out.println("Insufficient balance");
			return amount;
		}
	}
	
	public void display(){
		System.out.println("Name : " + this.nameOfDepositor + "\n" + "Balance : " + this.balance);
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public String getNameOfDepositor() {
		return this.nameOfDepositor;
	}
}
class CurAccount extends Account{
	
	private double AccBal;
	
	CurAccount(String cxName, String accNum, String typeOfAcc) {
		super(cxName, accNum, typeOfAcc);
	}
	
	public boolean deposit(double amount){
		this.AccBal += amount;
		return true;
	}
	
	public double withdraw(double amount){
		if(amount <= this.AccBal){
			this.AccBal -= amount;
			System.out.println(amount + " withdrawn ||| " + this.AccBal + " remaining");
			return amount;
		}
		else{
			System.out.println("Insufficient balance");
			return amount;
		}
	}
	
}

class SavAccount extends Account{
	
	private double AccBal;

	SavAccount(String cxName, String accNum, String typeOfAcc) {
		super(cxName, accNum, typeOfAcc);
	}
	
	public boolean deposit(double amount){
		this.AccBal += amount;
		return true;
	}
	
	public double withdraw(double amount){
		if(amount <= this.AccBal){
			this.AccBal -= amount;
			System.out.println(amount + " withdrawn ||| " + this.AccBal + " remaining");
			return amount;
		}
		else{
			System.out.println("Insufficient balance");
			return amount;
		}
	}
	
}

public class Prog_1_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of account : ");
		int n = sc.nextInt();
		
		Account a1[] = new Account[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("Account #" + (i+1));
			System.out.print("Enter name of depositer : ");
			String name = sc.next();
			
			System.out.print("Enter name of account number : ");
			String accNum = sc.next();
			
			System.out.print("Enter name of account type : ");
			System.out.println("1) CURRENT\t\t2)SAVINGS");
			int accType = sc.nextInt();
			
			switch(accType){
			case 1:
				a1[i] = new CurAccount(name, accNum, "CURRENT");
				break;
			case 2:
				a1[i] = new SavAccount(name, accNum, "SAVINGS");
				break;
			default:
				System.out.println("INVALID OPTION! TRY AGAIN");
			}
			
		}
		
		
		boolean flag = true;
		while(flag){
			System.out.println("Choose any operation : \n0) Exit \n1) Create an account\n2) Select an account\n3) Search an account");
			System.out.print("Input : ");
			int accountOption = sc.nextInt();
			switch(accountOption){
			case 0:
				flag = false;
				break;
			case 1:
				break;
			case 2:
				System.out.print("Enter account number : ");
				sc.nextLine();
				String acc = sc.nextLine();
				Account user = null;
				
				for(Account a : a1) {
					if(a.getAccountNumber().equals(acc)) {
						user = a;
						break;
					}
				}
				
				if(user != null)
					System.out.println("Account Found!");
				else {
					System.out.println("Account not found !!");
					break;
				}
				
				System.out.println("Choose any operation : \n0) Cancel\n1) Deposit\n2) Withdraw\n3) Check Balance");
				System.out.print("Input : ");
				int accountOperation = sc.nextInt();
				switch(accountOperation) {
				case 0:
					break;
				case 1:
					System.out.print("Enter the amount : ");
					double amount = sc.nextDouble();
					if(user.deposit(amount))
						System.out.println("Success!");
					else
						System.out.println("Failed!");
					break;
				case 2:
					System.out.print("Enter the amount : ");
					amount = sc.nextDouble();
					user.withdraw(amount);
					break;
				case 3:
					user.display();
					break;
				default:
					System.out.println("Invalid input, try again !!\n");
					break;
				}
				break;
				
			case 3 :
				System.out.print("Enter account number : ");
				sc.nextLine();
				acc = sc.nextLine();
				user = null;
				for(Account a : a1) {
					if(a.getAccountNumber().equals(acc)) {
						user = a;
						break;
					}
				}
				
				if(user != null)
					System.out.println("Account Found!");
				else {
					System.out.println("Account not found !!");
					break;
				}
				System.out.println("Name : " + user.getNameOfDepositor());
				break;
			
			default:
				System.out.println("Invalid input, try again !!\n");
				break;
			}
		}
		
		
	}

}
