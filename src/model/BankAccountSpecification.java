package model;

public interface BankAccountSpecification {

    double getMonthlyInterestRate();

    double getMonthlyIntereset();


    void withdraw(double d);

    void deposit(double d);


}
