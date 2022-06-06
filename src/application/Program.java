package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.Exceptions;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Account holder: ");
		String holder = sc.nextLine();
		System.out.print("Innitial balance:$ ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:$ ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		
				
		System.out.print("Enter amount for withdraw:$");
		double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
			System.out.printf("New balance:$%.2f", account.getBalance());
			
		}
		catch (Exceptions e) {
			System.out.println(e.getMessage());
			
		}
		sc.close();

	}

}
