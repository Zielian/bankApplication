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
                login(); // in web app, go to (or stay) login screen
            } else if (choice == 2) {
                input.nextLine();
                createAccount(); // in web app, go to create account screen
            } else {
                informationLogger.invalidInput();
                choice = input.nextInt(); // in web app, show an error text and clear fields.
            }
        } while (choice < 1 || choice > 2);

    }

    public void login() {
        // retrieve users information
        informationLogger.printLogin();
        informationLogger.requestUsername();
        String username = input.nextLine();
        informationLogger.requestPassword();
        String password = input.nextLine();

        // logic to check if user exists should come here

        // if user exist, go to overview page

        // if not, throw an error/ask to login again.


    }

    public void createAccount() {
        // retrieve users information
        informationLogger.printCreateAccount();
        System.out.print("first name:");
        String firstName = input.nextLine();
        System.out.print("last name:");
        String lastName = input.nextLine();
        System.out.print("email:");
        String email = input.nextLine();
        System.out.print("IBAN Number:");
        String ibanNumber = input.nextLine();

        // create an account for this person with username and password
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

