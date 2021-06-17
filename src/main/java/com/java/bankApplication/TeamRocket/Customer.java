package com.java.bankApplication.TeamRocket;

public class Customer {

    public String firstName;
    public String lastName;
    public String email;
    public String IBAN; // this probably needs to be changed from String to BankAccount type.
    public String username;
    public String password;

    public Customer(String firstName, String lastName, String email, String IBAN, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.IBAN = IBAN;
        this.username = username;
        this.password = password;
    }

}
