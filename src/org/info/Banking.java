package org.info;

import java.util.Scanner;

public class Banking {
public static void main(String[] args) {
	BankAccount obj1=new BankAccount("XYZ","BA0001");
	obj1.showMenu();
}
}
class BankAccount{//CLASS
	int balance;
	int previousTransactions;
	String customerName;
	String customerId;
	public BankAccount(String cname,String cId) {//CONSTRUCTOR
		customerName=cname;
		customerId=cId;
	}
	 void deposit(int amount) {
		if (amount !=0) {
			balance = balance+amount;
			previousTransactions=amount;
			
		}

	}
	 void withdraw(int amount) {
		if (amount !=0) {
			balance = balance - amount;
			previousTransactions= -amount;
		}

	}
	 void getPreviousTransaction() {
		if (previousTransactions > 0) {
			System.out.println("Deposited :"+previousTransactions);
		}
		else if (previousTransactions < 0) {
			System.out.println("withdrawn:" +Math.abs(previousTransactions));
		}
		else {
			System.out.println("No Transactions occured");
		}

	}
	 void showMenu() {
		char option ='\0';
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("yourId is "+customerId);
		System.out.println("\n");
		System.out.println("A. check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transactions");
		System.out.println("E. Exit");
		do {
			
			System.out.println("===================================================================================");
			System.out.println("Enter an Option");
			System.out.println("===================================================================================");
			option = s.next().charAt(0);
			System.out.println("\n");
			switch (option) {
			case 'A':
				System.out.println("-------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-------------------------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("-------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("-------------------------------------");
				int amount = s.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("-------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("-------------------------------------");
				int amount1 = s.nextInt();
				withdraw(amount1);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("-------------------------------------");
				getPreviousTransaction();
				System.out.println("-------------------------------------");
				System.out.println("\n");
			case 'E':
				System.out.println("*************************************");
				break;

			default:
				System.out.println("Invalid option!!.Please Enter again");
				break;
			}
			
			
		} while (option!='E');
          System.out.println("Thankyou for using our services");
	}
	
}