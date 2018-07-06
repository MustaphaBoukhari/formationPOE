package com.m2i.poo.tpmedia;

public class Cd extends Media {
    private int nbTrack;

    public int getNbTrack() {
        return nbTrack;
    }

    public void setNbTrack(int nbPage) {
        this.nbTrack = nbTrack;
    }

    public Cd(int id, String title, double price) {
        super(id, title, price);
    }

    @Override
    public double getNetPrice() {
        return getPrice() * 1.2;
    }


}
