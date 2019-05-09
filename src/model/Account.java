package model;

import java.time.LocalDate;


public abstract class Account implements BankAccountSpecification {


    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;


    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }


    @Override
    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    @Override
    public double getMonthlyIntereset() {
        return this.balance * getMonthlyInterestRate();
    }

    public abstract void withdraw(double d);

    @Override
    public void deposit(double deposit) {
        this.balance += deposit;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
