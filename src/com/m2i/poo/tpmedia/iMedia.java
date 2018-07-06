package com.m2i.poo.tpmedia;

import java.util.ArrayList;
import java.util.List;

public interface iMedia {
    double getNetPrice();

    int getId();

    void setId(int id);

    String getTitle();

    void setTitle(String title);

    double getPrice();

    void setPrice(double price);

    String toString();

    Publisher getPublisher();

    List<Author> getAuthorList();
}
