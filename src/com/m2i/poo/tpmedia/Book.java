package com.m2i.poo.tpmedia;

public class Book extends Media {
    private int nbpage;

    public Book(int id, String title, double price, int nbpage) {
        super(id, title, price);
        this.nbpage = nbpage;
    }

    public Book() {
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.05;
    }

}
