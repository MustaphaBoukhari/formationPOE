package com.m2i.poo.bank.bankcorrec;


import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id = 0;
    private double solde = 0;
    private boolean isActive = true;
    private boolean isBlocked = false;
    private Date creationDate = new Date();
    private Customer customer;
    private ArrayList<Transaction> transactionList = new ArrayList<>();
    private static int nb = 0;

    public Account() {
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        nb++;
    }

    public static int getNb() {
        return nb;
    }

    void deposit(double amount) {
        if (isActive && !isBlocked) {
            solde = solde + amount;
            Transaction transaction = new Transaction(amount);
            transaction.setFromAccount(null);
            transaction.setToAccount(this);
            transactionList.add(transaction);
        }
    }

    double withdraw(double amount) {
        if (isActive && !isBlocked) {
            if (amount <= solde) {
                solde = solde - amount;
                Transaction transaction = new Transaction(-amount);
                transaction.setFromAccount(this);
                transaction.setToAccount(null);
                transactionList.add(transaction);
                return amount;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void transfer(double amount, Account account) {
        if (isActive && !isBlocked) {
            if (amount <= solde) {
                solde -= amount;
                Transaction transaction = new Transaction(-amount);
                transaction.setFromAccount(this);
                transaction.setToAccount(account);
                transactionList.add(transaction);
            }
        }
    }

    public void close() {
        isActive = false;
    }

    public void block() {
        isBlocked = true;
    }

    public void unblock() {
        isBlocked = false;
    }


    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String toString() {
        return "Account " + id + ": " + solde + " €";
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }


}
