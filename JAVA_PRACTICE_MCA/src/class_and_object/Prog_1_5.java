package class_and_object;
import java.util.Scanner;

/*
 * 5. Define a class Account to represent a bank account. Include the following members.
		Instance Variable: Name of the depositor, Account number, Account type, Balance amount in
		the account.
		Method: To assign initial values, To deposit an amount, To withdraw an amount after checking
		the balance, To display name and balance.
		Write a program to test the program for a given number of customers. The program should be
		able to search any customer if the account number is provided.
 */

class Account{
	private String nameOfDepositor, accountNumber, accountType;
	private double balance;
	
	
	
	public Account(String nameOfDepositor, String accountNumber, String accountType) {
		this.nameOfDepositor = nameOfDepositor;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public void setNameOfDepositor(String nameOfDepositor) {
		this.nameOfDepositor = nameOfDepositor;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
		
	public String getNameOfDepositor() {
		return nameOfDepositor;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
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
	
}

public class Prog_1_5 {
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
			String accType = sc.next();
			
			a1[i] = new Account(name, accNum, accType);
			
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
		sc.close();
	}
	
}
