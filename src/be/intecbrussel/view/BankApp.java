package be.intecbrussel.view;

import be.intecbrussel.model.CheckingAccount;
import be.intecbrussel.model.SavingAccount;
import be.intecbrussel.model.User;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        User user1 = new User(232, "Vincent Honca", "Rue de la Semence 39.", "02/410.34.32", "Vincenth1985@gmail.com",
                new CheckingAccount(232, 0.0, 1000));

        System.out.println("\nHi welcome to Intec Brussel National Bank.");
        System.out.println("-".repeat(42));
        Scanner kbd = new Scanner(System.in);

        while (true) {

            String userInput;
            do {
                System.out.println("\nChoose between options below.");
                System.out.println("-".repeat(30));
                System.out.println("1.Check Balance.");
                System.out.println("2.Deposit amount.");
                System.out.println("3.Withdraw amount.");
                System.out.println("4.Please introduce the annual rate.");
                System.out.println("5.Printing Account.");
                System.out.println("6.Exit.");
                System.out.print("Choose digits from 1 -> 6 : ");
                System.out.println();
                userInput = kbd.nextLine();
            } while (!userInput.matches("[1-6]"));
            int x = Integer.parseInt(userInput);

            if (x == 1) {

                user1.checkBalance();
            } else if (x == 2) {
                do {
                    System.out.println("Please introduce deposit amount in digits :");
                    userInput = kbd.nextLine();
                } while (!userInput.matches("([0-9]*)\\.?([0-9]*)"));
                user1.deposit(Double.parseDouble(userInput));


            } else if (x == 3) {

                do {
                    System.out.print("Please introduce amount to withdraw in digits : ");
                    userInput = kbd.nextLine();

                } while (!userInput.matches("([0-9]*)\\.?([0-9]*)"));
                user1.withDraw(Double.parseDouble(userInput));

            } else if (x == 4) {
                do {
                    System.out.println("Please introduce the annual rate in digits : ");
                    userInput = kbd.nextLine();
                }
                while (!userInput.matches("([0-9]*)\\.?([0-9]*)"));
                user1.setChangeAnnuelRate(Double.parseDouble(userInput));


            } else if (x == 5) {

                System.out.println(user1.getAccount());
                System.out.println(user1.toString());


            } else if (x == 6) {

                System.out.println("Thanks Good Bye");
                break;
            }
        }
        kbd.close();
    }


}
