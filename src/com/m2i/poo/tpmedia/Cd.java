package com.m2i.poo.tpmedia;

public class Cd extends Media {
    private int nbTrack;

    public Cd(int id, String title, double price, int nbTrack) {
        super(id, title, price);
        this.nbTrack = nbTrack;
    }


}
