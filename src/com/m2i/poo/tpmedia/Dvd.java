package com.m2i.poo.tpmedia;

public class Dvd extends Media {
    private int zone;

    public Dvd(int id, String title, double price, int zone) {
        super(id, title, price);
        this.zone = zone;
    }

    public double getNetPrice() {
        return super.getNetPrice() * 0.8;
    }
}
