package model;

public class SavingAccount extends Account {


    public SavingAccount() {
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }


    @Override
    public void withdraw(double withdrawAmount) {

        if (withdrawAmount > getBalance()) {
            System.err.println("Not possible.Your balance is :" + getBalance());
        } else {
            setBalance(getBalance() - withdrawAmount);
        }

    }
}
