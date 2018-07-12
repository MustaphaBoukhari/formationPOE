package com.m2i.poo.tpmedia;

public class Dvd extends Media {
    private int zone;

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public Dvd(int id, String title, double price) {
        super(id, title, price);
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 0.8;
    }
}
