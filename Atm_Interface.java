package ATM_Interface;

import java.util.Scanner;

class Account {
    private int balance;

    public Account(int initialBalance) {
        balance = initialBalance;
    }

    public int withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
        return balance;
    }

    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;
    }

    public int checkBalance() {
        return balance;
    }
}

public class Atm_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account user = new Account(1000);

        System.out.println("<--- Welcome to the ATM Interface --->");

        while(true) {
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Please Select the Option:");
            int option = sc.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter the Amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    int newBalance = user.withdraw(withdrawAmount);
                    System.out.println("Your Available Balance is " + newBalance);
                    System.out.println("Thank you, your transaction is successful");
                    break;

                case 2:
                    System.out.println("Enter the Amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    int updatedBalance = user.deposit(depositAmount);
                    System.out.println("Your Available Balance is " + updatedBalance);
                    System.out.println("Thank you, your transaction is successful");
                    break;

                case 3:
                    int currentBalance = user.checkBalance();
                    System.out.println("Your Available Balance is " + currentBalance);
                    System.out.println("Thank you, your transaction is successful");
                    break;

                case 4:
                    System.out.println("Exiting the Application. Thank you.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}


