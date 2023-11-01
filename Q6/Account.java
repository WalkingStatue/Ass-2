package MyPackage;

public class Account {
    private int accountNo;
    protected double balance;

    public Account(int accountNo) {
        this.accountNo = accountNo;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNo + ", Balance: " + balance;
    }
}
