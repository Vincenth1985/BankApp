package model;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        User user1 = new User(232, "Vincent", "Rue de la semence 39", "0241034323", "Vincenth1985@gmail.com", new CheckingAccount());

        System.out.println("\nHi welcome to Intec Brussel National Bank.");
        System.out.println("-".repeat(42));


        Scanner kbd = new Scanner(System.in);

        while (true) {

            String userInput;
            do {
                System.out.println("\nChoose between options below.");
                System.out.println("-".repeat(30));
                System.out.println("1.CheckBalance.");
                System.out.println("2.Introduce deposit amount.");
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

                System.out.println(user1.account);


            } else if (x == 6) {
                break;
            }
        }
    }
}
