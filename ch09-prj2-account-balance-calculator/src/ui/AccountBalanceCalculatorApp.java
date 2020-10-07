package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import ui.console.Console;

public class AccountBalanceCalculatorApp {
	
	private static NumberFormat currency = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator App!");
		
		// initialize account balances - ca, sa
		CheckingAccount ca = new CheckingAccount(1000.0,1.0);
		SavingsAccount sa = new SavingsAccount(1000.0,.01);
		
		// displayBalanceSummary
		System.out.println();
		System.out.println("Starting Balances:");
		displayBalanceSummary(ca, sa);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			// transaction while loop
			// enter transactions for the month
			// prompt transType (String), account (String), amount (double)
			String transType = Console.getChoiceString
					("Withdrawal or deposit (w/d)? ", "w", "d");
			String account = Console.getChoiceString
					("Checking or savings (c/s)? ", "c", "s");
			// determine max:  deposit - infinity, withdrawal, balance
			
			double max = 0;
			Account a = null;
			if (account.equalsIgnoreCase("c")) {
				a = ca;
			}
			else {
				a = sa;
			}
			if (transType.equalsIgnoreCase("w")) {
				max = a.getBalance();
			}
			else {
				max = Double.POSITIVE_INFINITY;
			}
			
			double amount = Console.getDouble("Amount? ", 1, max);
			// execute transaction
			if (transType.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			}
			else {
				a.deposit(amount);
			}
		
			// prompt continue?
			choice = Console.getChoiceString("Continue? ", "y", "n");
		}
		
		// display monthlyPayments and Fees
		sa.applyInterestPaymentToBalance();
		ca.subtractFeeFromBalance();
		System.out.println();
		System.out.println("Monthly Payments and Fees:");
		System.out.println("Checking Fee:  "+currency.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment:  "+currency.format(sa.getMonthlyInterestPayment()));
		System.out.println();
		
		// displayBalanceSummary
		System.out.println("Final Balances:");
		displayBalanceSummary(ca, sa);
		
		System.out.println("bye");
	}

	private static void displayBalanceSummary(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: "+currency.format(ca.getBalance()));
		System.out.println("Savings: "+currency.format(sa.getBalance()));
		System.out.println();
	}

}