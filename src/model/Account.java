package model;

import java.time.LocalDate;


public abstract class Account implements BankAccountSpecification {

    private double annualInterestRate;
    private int id;
    private double balance;
    private LocalDate dateCreated = LocalDate.now();


    public Account() {
    }

    public Account(int id, double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;

    }


    @Override
    public abstract void withdraw(double d);


    @Override
    public void deposit(double d) {
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getMounthlyInterestRate() {
        return BankAccountSpecification.MOUNTHLY_INTERESET_RATE;
    }


    public double getMounthlyInterest() {
        return BankAccountSpecification.MOUNTHLY_INTERESET;
    }
}
