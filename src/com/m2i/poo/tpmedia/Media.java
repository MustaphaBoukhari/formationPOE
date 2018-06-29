package com.m2i.poo.tpmedia;

import java.util.ArrayList;

public class Media {
    private int id;
    private String title;
    private double price;
    private Publisher publisher;
    private ArrayList<Author> author;

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
        getNetPrice();
    }

    public Media() {
    }

    public double getNetPrice() {
        return getPrice() * 1.2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return (getId() + " " + getTitle() + " " + getPrice() + " " + getNetPrice());
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public ArrayList<Author> getAuthors() {
        return author;
    }
}
