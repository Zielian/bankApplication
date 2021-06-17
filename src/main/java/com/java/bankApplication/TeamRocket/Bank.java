package com.java.bankApplication.TeamRocket;

import java.util.ArrayList;

public class Bank {

    String name;
    public ArrayList<Customer> allCustomers;

    public Bank(String name) {
        this.name = name;

        Customer c1 = new Customer("Ruomei", "Liu", "ruomei.liu@rabobank.com", "NL99RAB99999999999", "luij", "test999");
        Customer c2 = new Customer("Johan", "Ziel", "johan.ziel@rabobank.com", "NL11RAB11111111111", "zielj", "test321");
        Customer c3 = new Customer("Jop", "van der Steen", "jop.van.der.steen@rabobank.com", "NL00RABO1234567890", "steenj", "test123");

        allCustomers = new ArrayList<>();
        allCustomers.add(c1);
        allCustomers.add(c2);
        allCustomers.add(c3);
    }





}
