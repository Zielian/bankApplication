package com.java.bankApplication.TeamRocket.Printers;

public class PrintCustomer {

    // from here print statements for Customer class
    public void printCustomerOptions(){
        System.out.println();
        System.out.println("Please pick one of the following options:");
        System.out.println("1) Add new payment account");
        System.out.println("2) Add new savings account");
        System.out.println("3) Show an overview of all accounts");
        System.out.println("4) Remove payment account");
        System.out.println("5) Remove savings account");
        System.out.println("6) Log out");
    }

    public void askIBAN() {
        System.out.print("Please provide the IBAN number of the account you want to add: ");
    }

    public void askIBANToDelete() {
        System.out.print("Please provide the IBAN number of the account you want to delete: ");
    }

}
