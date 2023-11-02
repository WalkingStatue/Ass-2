package Mypackage;

public class Bank_account {
    private int Account_id;
    private long mobile_number;
    private String account_holder_name;
    private String account_type;
    private double account_balance;
    private double Credit_limit;

    public Bank_account() {
    }

    public Bank_account(int Account_id, long mobile_number, String account_holder_name,
            String account_type, double account_balance, double Credit_limit) {
        this.Account_id = Account_id;
        this.mobile_number = mobile_number;
        this.account_holder_name = account_holder_name;
        this.account_type = account_type;
        this.account_balance = account_balance;
        this.Credit_limit = Credit_limit;
    }

    public void update_account(double new_balance, double new_credit_limit) {
        this.account_balance = new_balance;
        this.Credit_limit = new_credit_limit;
    }

    @Override
    public String toString() {
        return "Account ID: " + Account_id + "\nMobile Number: " + mobile_number + "\nAccount Holder Name: "
                + account_holder_name + "\nAccount Type: " + account_type + "\nAccount Balance: " + account_balance
                + "\nCredit Limit: " + Credit_limit;
    }

    public int getAccount_id() {
        return Account_id;
    }
}
