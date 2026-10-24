// Very Basic Mini Project: Bank Management System
// Language: Java (Console Based)

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    double balance;

    void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        System.out.println("Account Created Successfully");
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        int choice;

        do {
            System.out.println("\n--- BANK MANAGEMENT SYSTEM ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: acc.createAccount(); break;
                case 2: acc.deposit(); break;
                case 3: acc.withdraw(); break;
                case 4: acc.checkBalance(); break;
                case 5: acc.displayDetails(); break;
                case 6: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice");
            }
        } while (choice != 6);
    }
}
