package com.m2i.poo.tpmedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements iMedia {
    private int id;
    private String title;
    private double price;
    private Publisher publisher;
    private List<Author> authorList;

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
        getNetPrice();
    }

    public Media() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (getId() + " " + getTitle() + " " + getPrice() + " " + getNetPrice());
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public List<Author> getAuthorList() {
        return authorList;
    }
}
