
package juario;

import java.util.Scanner;


public class activity3 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctAccountNumber = 2001;
        int correctPin = 123456;
        float balance = 0;

        int attempts = 3;
        boolean authenticated = false;

        while (attempts > 0) {
            System.out.print("Enter Account Number: ");
            int inputAcc = sc.nextInt();

            System.out.print("Enter PIN: ");
            int inputPin = sc.nextInt();

            if (inputAcc == correctAccountNumber && inputPin == correctPin) {
                authenticated = true;
                break;
            } else {
                attempts--;
                System.out.println("Invalid account number or PIN. Attempts left: " + attempts);
            }
        }

        if (authenticated) {
            System.out.println("Login successful!");

            sc.nextLine(); 
            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.println("Welcome " + name + "!");

            boolean exit = false;

            while (!exit) {
                System.out.println("\nChoose operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Balance");
                System.out.println("4. Exit");
                System.out.print("Enter choice (1-4): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        float deposit = sc.nextFloat();
                        balance += deposit;
                        System.out.println("Deposited successfully. New balance: " + balance);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        float withdraw = sc.nextFloat();
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawn successfully. New balance: " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Current balance: " + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using my Banking. Goodbye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } else {
            System.out.println("Too many failed attempts. Access denied.");
        }

        sc.close();
    }
}


