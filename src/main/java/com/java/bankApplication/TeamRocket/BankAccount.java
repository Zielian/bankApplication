package com.java.bankApplication.TeamRocket;

public interface BankAccount {

    int getBalance();
    boolean withdrawMoney(int amount);
    boolean depositMoney(int amount);
    boolean transferMoney(int amount, BankAccount account);

    String getIBAN();
    String getType();
}
