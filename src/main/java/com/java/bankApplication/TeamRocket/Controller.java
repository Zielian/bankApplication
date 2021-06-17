package com.java.bankApplication.TeamRocket;

import java.util.Scanner;

public class Controller {

    static private Printer informationLogger = new Printer();
    static private Scanner input = new Scanner(System.in);


    public void loginOption() {
        informationLogger.printLoginOption();
        int choice = input.nextInt();

        do {
            if (choice == 1) {
                input.nextLine();
                login();
            } else if (choice == 2) {
                input.nextLine();
                createAccount();
            } else {
                informationLogger.invalidInput();
                choice = input.nextInt();
            }
        } while (choice < 1 || choice > 2);

    }

    public void login() {
        informationLogger.printLogin();
        System.out.print("username:");
        String username = input.nextLine();
        System.out.print("password:");
        String password = input.nextLine();


    }

    public void createAccount() {
        informationLogger.printCreateAccount();
        System.out.print("first name:");
        String firstName = input.nextLine();
        System.out.print("last name:");
        String lastName = input.nextLine();
        System.out.print("email:");
        String email = input.nextLine();
        System.out.print("IBAN Number:");
        String ibanNumber = input.nextLine();
        createLogin();
    }

    public void createLogin() {
        informationLogger.printCreateLogin();
        System.out.print("username:");
        String username = input.nextLine();
        // check if username already exists
        // if so, return an error
        System.out.print("password:");
        String password = input.nextLine();
        System.out.print("confirm password:");
        if (!input.nextLine().equals(password)) {
            informationLogger.noMatchingPasswords();
            createLogin();
        } else {
            informationLogger.printSuccesfulAccountCreation();
            login();
        }


    }
}

