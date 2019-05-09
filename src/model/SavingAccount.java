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
            System.out.println("More than balance ");
        } else {
            setBalance(getBalance() - withdrawAmount);
            System.out.println("Thanks good bye.");
        }

    }
}
