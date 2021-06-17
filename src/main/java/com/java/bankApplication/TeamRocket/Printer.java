package com.java.bankApplication.TeamRocket;

import java.util.Scanner;

public class Printer {

    public void requestUsername() {
        System.out.print("Username: ");
    }

    public void requestPassword() {
        System.out.print("Password: ");
    }

    public void requestPasswordConfirmation() {
        System.out.print("Confirm password: ");
    }

    public void printLoginOption(){
        System.out.println("Welcome, please pick one of the following:");
        System.out.println("1) Login");
        System.out.println("2) Create new account");
    }

    public void printLogin(){
        System.out.println("Please provide your username and password.");
    }

    public void printCreateAccount(){
        System.out.println("Thank you for signing up with the Rabobank");
        System.out.println("Please provide the following details:");
    }

    public void printCreateLogin() {
        System.out.println("In order to be able to login in the future you also need to create a username and password.");
    }

    public void printSuccesfulAccountCreation() {
        System.out.println("Thank you for signing up.");
        System.out.println("You will now be redirected to the login page.");
    }

    public void invalidInput() {
        System.out.println("That's not a valid option.");
        System.out.println("Please pick again.");
    }

    public void noMatchingPasswords() {
        System.out.println("Sorry, these passwords don't match.");
        System.out.println("Please try again.");
    }

}
