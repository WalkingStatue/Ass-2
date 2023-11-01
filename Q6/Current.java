package MyPackage;

public class Current extends Account {
    private double overdraftLimit;

    public Current(int accountNo, double overdraftLimit) {
        super(accountNo);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit reached.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }
}
