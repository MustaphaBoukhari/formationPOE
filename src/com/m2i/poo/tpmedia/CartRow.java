package com.m2i.poo.tpmedia;

public class CartRow {
    private iMedia media;
    private int quantity = 1;

    public CartRow(iMedia media, int quantity) {
        this.media = media;
        this.quantity = quantity;
    }

    public void increment() {
        CartRow row = new CartRow(media, quantity++);
    }

    public void decrement() {
        if (quantity > 1) {
            CartRow row = new CartRow(media, quantity--);
        } else {
            System.out.println("La quantité est déjà à 1");
        }
    }

    public double getRowNetPrice() {
        return media.getNetPrice() * quantity;
    }

}
