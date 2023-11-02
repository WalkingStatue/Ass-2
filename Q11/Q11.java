import Mypackage.Bank_account;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int numAccounts = 3;
            Bank_account[] bankAccounts = new Bank_account[numAccounts];

            for (int i = 0; i < numAccounts; i++) {
                System.out.println("Enter details for Bank Account " + (i + 1) + ":");
                System.out.print("Account ID: ");
                int Account_id = scanner.nextInt();
                System.out.print("Mobile Number: ");
                long mobile_number = scanner.nextLong();
                scanner.nextLine();
                System.out.print("Account Holder Name: ");
                String account_holder_name = scanner.nextLine();
                System.out.print("Account Type: ");
                String account_type = scanner.nextLine();
                System.out.print("Account Balance: ");
                double account_balance = scanner.nextDouble();
                System.out.print("Credit Limit: ");
                double Credit_limit = scanner.nextDouble();

                bankAccounts[i] = new Bank_account(Account_id, mobile_number, account_holder_name, account_type,
                        account_balance, Credit_limit);
            }

            System.out.print("Enter Account ID to retrieve account details: ");
            int inputAccountID = scanner.nextInt();
            boolean accountFound = false;

            for (Bank_account account : bankAccounts) {
                if (account != null && account.getAccount_id() == inputAccountID) {
                    System.out.println("\nAccount Details:");
                    System.out.println(account);
                    accountFound = true;
                    break;
                }
            }

            if (!accountFound) {
                System.out.println("Account not found.");
            }
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
