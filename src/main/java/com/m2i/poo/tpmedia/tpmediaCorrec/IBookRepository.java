package com.m2i.poo.tpmedia.tpmediaCorrec;

import com.m2i.poo.tpmedia.Book;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {
    void load(String uri) throws IOException, ClassNotFoundException, SQLException;

    List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getAll() throws Exception;

    com.m2i.poo.tpmedia.tpmediaCorrec.Book getById(int id) throws Exception;

    List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByTitle(String title) throws Exception;

    List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByPrice(double price) throws Exception;

    List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByPublisher(String publisherName) throws Exception; // Bonus

    // Bonus
    void add(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) throws SQLException;

    void remove(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) throws SQLException;

    void update(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) throws SQLException;
}
