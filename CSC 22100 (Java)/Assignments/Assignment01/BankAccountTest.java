package Assignments.Assignment01;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String [] args){
        //Interactive Testing 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNum, accHolderName, balance);

        
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Info");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.getAccInfo();
                    break;
                case 4:
                    account.getBalance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }       
        }
    }
}
