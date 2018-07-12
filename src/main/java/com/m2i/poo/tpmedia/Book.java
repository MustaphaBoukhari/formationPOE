package com.m2i.poo.tpmedia;

public class Book extends Media {
    private int nbPage;

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public Book(int id, String title, double price) {
        super(id, title, price);
    }

    public Book() {
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.05;
    }

}
