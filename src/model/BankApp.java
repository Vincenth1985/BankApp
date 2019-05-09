package model;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {


        boolean a = true;

        User user1 = new User();
        System.out.println("Hi welcome to Intec Brussel National Bank.");
        Scanner kbd = new Scanner(System.in);


        while (a) {

            String userInput;
            do {
                System.out.print("Choose between option : ");
                userInput = kbd.nextLine();
            } while (userInput.matches("[^1-6]"));
            int x = Integer.parseInt(userInput);

            if (x == 1) {

                user1.checkBalance();
            } else if (x == 2) {
                do {
                    System.out.println("Please introduce deposit amount :");
                    userInput = kbd.nextLine();
                } while (!userInput.matches("([0-9]*)\\.([0-9]*)"));
                user1.deposit(Double.parseDouble(userInput));

            } else if (x == 3) {

                do {
                    System.out.println("Withdraw amount : ");
                    userInput = kbd.nextLine();

                } while (!userInput.matches("([0-9]*)\\.([0-9]*)"));
                user1.deposit(Double.parseDouble(userInput));

            } else if (x == 4) {
                do {
                    System.out.println("Please introduce the annual rate : ");
                    userInput = kbd.nextLine();
                }
                while (!userInput.matches("([0-9]*)\\.([0-9]*)"));
                user1.deposit(Double.parseDouble(userInput));


            } else if (x == 5) {
                do {
                    System.out.println(user1.account);
                    userInput = kbd.nextLine();
                }
                while (!userInput.matches("([0-9]*)\\.([0-9]*)"));
                user1.deposit(Double.parseDouble(userInput));
            } else if (x == 6) {
                a = false;

            }
        }
    }
}
