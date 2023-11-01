package MyPackage;

public class Savings extends Account {
    private double interestRate;

    public Savings(int accountNo, double interestRate) {
        super(accountNo);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate;
    }
}
