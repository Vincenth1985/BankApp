package be.intecbrussel.services;

public interface BankAccountSpecification {

    double getMonthlyInterestRate();

    double getMonthlyIntereset();


    void withdraw(double d);

    void deposit(double d);


}
