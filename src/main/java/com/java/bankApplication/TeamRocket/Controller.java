package com.java.bankApplication.TeamRocket;

import java.util.Scanner;

public class Controller {

    static private final Printer informationLogger = new Printer();
    static private final Scanner input = new Scanner(System.in);


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
        informationLogger.requestUsername();
        String username = input.nextLine();
        informationLogger.requestPassword();
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
        informationLogger.requestUsername();
        String username = input.nextLine();
        // check if username already exists
        // if so, return an error
        informationLogger.requestPassword();
        String password = input.nextLine();
        // double check to make sure no typos were made
        informationLogger.requestPasswordConfirmation();
        if (!input.nextLine().equals(password)) {
            informationLogger.noMatchingPasswords();
            createLogin();
        } else {
            informationLogger.printSuccesfulAccountCreation();
            login();
        }


    }
}

