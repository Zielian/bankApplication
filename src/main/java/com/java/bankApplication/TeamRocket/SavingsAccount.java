package com.java.bankApplication.TeamRocket;

public class SavingsAccount implements BankAccount {

    private final String IBAN;
    private int balance;
    private final PaymentAccount linkedAccount;

    public SavingsAccount(String iban, PaymentAccount linkedAccount) {
        this.IBAN = iban;
        this.balance = 0;
        double interestRate = 0.05;
        this.linkedAccount = linkedAccount;
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
        return false; // you can not transfer money from a savings account, provide error.
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String getType() {
        return "Savings";
    }


    public boolean transferMoneyToPaymentAccount(int amount) {
        if (amount <= balance) {
            withdrawMoney(amount);
            linkedAccount.depositMoney(amount);
            return true;
        }
        else {
            return false;
        }
    }

}
