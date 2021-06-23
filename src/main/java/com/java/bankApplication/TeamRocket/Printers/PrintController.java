package com.java.bankApplication.TeamRocket.Printers;

public class PrintController {

    public void requestUsername() {
        System.out.print("Username: ");
        System.out.println();
    }

    public void requestPassword() {
        System.out.print("Password: ");
        System.out.println();
    }

    public void requestPasswordConfirmation() {
        System.out.print("Confirm password: ");
        System.out.println();
    }

    public void requestRaboAccount(){System.out.println("Your Rabobank IBAN account: ");
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

    public void printsuccessfulaccountcreation() {
        System.out.println("Thank you for signing up.");
        System.out.println("You will now be redirected to the login page.");
    }

    public void printSuccessfulLogin() {
        System.out.println("You are now logged in to the system successfully");
    }

    public void noMatchingPasswords() {
        System.out.println("Sorry, these passwords don't match.");
        System.out.println("Please try again.");
    }

    public void failedCredentials() {
        System.out.println("We didn't find a match between that username & password");
        System.out.println("Please try again.");
    }

    public void printNoRabo(){
        System.out.println("Sorry, you are not a Rabobank user yet, please create an account firstly.");
        System.out.println("Now you will transfer to account creation page.");}

}
