package model;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }


    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > getBalance()+overdraftLimit) {
            System.out.println("More than balance ");
        } else {
            setBalance(getBalance() - withdrawAmount);
            System.out.println("Thanks good bye.");
        }


    }

    @Override
    public String toString() {
        return super.toString() + "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }




}
