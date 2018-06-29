package com.m2i.poo.bank;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    //numero de compte, Solde, Coordonnée client
    /*public int num;
    public double solde;
    public String nom;

    public void decouvert(){
        if (solde<0){
            System.out.println("Vous êtes à découvert");
        } else {
            System.out.println("Vous êtes dans le vert");
        }
    }

    public void newSolpde(double vir){
        solde+=vir;
    }

    public void info(){
        System.out.format("%nNuméro de compte: %d%nClient : %s%nSolde : %.2f%n%n",num,nom,solde);
    }*/

// Passer les attributs en private
    // Créer les getters setters
    // Créer un constructeur sans paramètre (constructeur par défaut)
    // Créer un constructeur avec les paramètres obligatoires
    // Créer toString

    private int id = 0;
    private double solde = 0;
    private boolean isActive = true;
    private boolean isBlocked = false;
    private Date creationDate = new Date();
    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

    public Account() {
    }

    public Account(int id) {
        this.id = id;

    }


    public void deposit(double amount) {
        if (isActive() && !isBlocked()) {
            solde = (getSolde() + amount);
        }
    }

    public double withdraw(double amount) {
        if (isActive() && !isBlocked()) {
            if (amount <= getSolde()) {
                solde = (getSolde() - amount);
                return amount;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void close() {
        setActive(false);
    }

    void block() {
        setBlocked(true);
    }

    void unblock() {
        setBlocked(false);
    }

    public int getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public double getSolde() {
        return solde;
    }

//    public void setSolde(double solde) { // pas besoin de changer la valeur manuellement
//        this.solde = solde;
//    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Date getCreationDate() {
        return creationDate;
    }

//    public void setCreationDate(Date creationDate) {
//        this.creationDate = creationDate;
//    }

    public String toString() {
        return ("Account " + id + " Solde " + solde + " blabla");
    }
}
