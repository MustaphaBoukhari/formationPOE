package com.m2i.poo.tpmedia.tpmediaCorrec;

import com.m2i.poo.tpmedia.Book;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {
    void load(String uri) throws IOException;

    List<com.m2i.poo.tpmedia.Book> getAll();

    com.m2i.poo.tpmedia.Book getById(int id);

    List<com.m2i.poo.tpmedia.Book> getByTitle(String title);

    List<com.m2i.poo.tpmedia.Book> getByPrice(double price);

    List<com.m2i.poo.tpmedia.Book> getByPublisher(String publisherName); // Bonus

    // Bonus
    void add(com.m2i.poo.tpmedia.Book b);

    void remove(com.m2i.poo.tpmedia.Book b);

    void update(Book b);
}
