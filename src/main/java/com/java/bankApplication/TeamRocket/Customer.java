package com.java.bankApplication.TeamRocket;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    static private final Printer informationLogger = new Printer();
    static private final Scanner input = new Scanner(System.in);

    public String firstName;
    public String lastName;
    public String email;
    public String username;
    public String password;
    public PaymentAccount account; // When you are a new customer you need to have a payment account.
    public ArrayList<BankAccount> allAccounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String email, String IBAN, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;

        this.account = new PaymentAccount(IBAN);
        allAccounts.add(account);
    }

    public void showCustomerOptions(){
        informationLogger.printCustomerOptions();
        int choice = input.nextInt();

        do {
            if (choice == 1) { // add payment account
                input.nextLine();
                informationLogger.askIBAN();
                String iban = input.nextLine();
                addPaymentAccount(iban); // in web app, go to create account screen
                // maybe print confirmation that account was added
                showCustomerOptions(); // bring back to all options
            } else if (choice == 2) { // add savings accounts
                input.nextLine();
                informationLogger.askIBAN();
                String iban = input.nextLine();
                addSavingsAccount(iban); // in web app, go to create account screen
                // maybe print confirmation that account was added
                showCustomerOptions(); // bring back to all options
            } else if (choice == 3) { // show overview
                input.nextLine();
                showOverview(); // in web app, go to create account screen
            } else {
                informationLogger.invalidInput();
                choice = input.nextInt(); // in web app, show an error text and clear fields.
            }
        } while (choice < 1 || choice > 3);

    }

    public boolean addPaymentAccount(String iban) {
        PaymentAccount payment = new PaymentAccount(iban);
        allAccounts.add(payment);
        return true;
    }

    public boolean removePaymentAccount() {
        return true;
        // logic
    }

    public boolean addSavingsAccount(String iban) {
        SavingsAccount savings = new SavingsAccount(iban, account);
        allAccounts.add(savings);
        return true;
    }

    public boolean removeSavingsAccount() {
        return true;
        // logic
    }

    public boolean showOverview() {

        System.out.println("Here is an overview of all your accounts:");
        System.out.println();
        System.out.format("%-20s%-10s%-10s", "IBAN number", "Type", "Balance");
        System.out.println();
        System.out.print("----------------------------------------");
        for (BankAccount ba : allAccounts) {
            System.out.println();
            System.out.format("%-20s%-10s%-10s", ba.getIBAN(), ba.getType(), ba.getBalance());
        }
        return true;

    }




}
