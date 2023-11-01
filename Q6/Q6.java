import MyPackage.Account;
import MyPackage.Savings;
import MyPackage.Current;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter account number for Savings Account: ");
            int savingsAccountNo = scanner.nextInt();
            System.out.print("Enter interest rate for Savings Account: ");
            double savingsInterestRate = scanner.nextDouble();

            Savings savingsAccount = new Savings(savingsAccountNo, savingsInterestRate);

            System.out.print("Enter account number for Current Account: ");
            int currentAccountNo = scanner.nextInt();
            System.out.print("Enter overdraft limit for Current Account: ");
            double currentOverdraftLimit = scanner.nextDouble();

            Current currentAccount = new Current(currentAccountNo, currentOverdraftLimit);

            System.out.print("Enter the deposit amount for Savings Account: ");
            double depositAmountSavings = scanner.nextDouble();
            savingsAccount.deposit(depositAmountSavings);

            System.out.print("Enter the withdrawal amount for Savings Account: ");
            double withdrawalAmountSavings = scanner.nextDouble();
            savingsAccount.withdraw(withdrawalAmountSavings);

            System.out.print("Enter the deposit amount for Current Account: ");
            double depositAmountCurrent = scanner.nextDouble();
            currentAccount.deposit(depositAmountCurrent);

            System.out.print("Enter the withdrawal amount for Current Account: ");
            double withdrawalAmountCurrent = scanner.nextDouble();
            currentAccount.withdraw(withdrawalAmountCurrent);

            System.out.println("\nSavings Account Details:");
            System.out.println(savingsAccount.toString());

            System.out.println("\nCurrent Account Details:");
            System.out.println(currentAccount.toString());

            scanner.close();
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}
