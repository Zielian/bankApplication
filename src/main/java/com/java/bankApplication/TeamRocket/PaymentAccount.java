package com.java.bankApplication.TeamRocket;

public class PaymentAccount implements BankAccount {

    private String IBAN;
    private int balance;
    private double interestRate;

    public PaymentAccount(String iban) {
        this.IBAN = iban;
        balance = 0;
        interestRate = 0.0;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public boolean withdrawMoney(int amount) {
        if (amount <= balance){
            balance -= amount;
            return true; // if enough money, substract and return true.
        }
        return false; // if not enough money, return false.
    }

    @Override
    public boolean depositMoney(int amount) {
        balance -= amount;
        return true; // returns successful status, might be used by other methods later.
    }

    @Override
    public boolean transferMoney(int amount, BankAccount account) {
        // withdraw money from this account if balance is high enough (so, withdraw returns true).
        if(withdrawMoney(amount)){
            account.depositMoney(amount); // deposit it to the specified account
            return true;
        }
        else {
            return false; // if not enough money, return false.
        }

        // print overview of transaction
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String getType() {
        return "Payment";
    }
}
