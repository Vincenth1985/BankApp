package be.intecbrussel.model;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > getBalance() + overdraftLimit) {
            System.err.println("Not possible.Your balance is :" + getBalance());
        } else {
            setBalance(getBalance() - withdrawAmount);
        }


    }

    @Override
    public String toString() {
        return super.toString() + String.format(getClass().getSimpleName() + " Overdraftlimit : %.2f Euro", overdraftLimit);
    }


}
