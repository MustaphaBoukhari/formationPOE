package com.m2i.poo.tpmedia.tpmediaCorrec;

import com.m2i.poo.tpmedia.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BookRepository implements IBookRepository {

    private List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> bookList = new ArrayList<>();
    String driverName="org.postgresql.Driver";
    String url="jdbc:postgresql://localhost:5432/postgres";

    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer((line), ";");
            int id = Integer.parseInt(st.nextToken());
            String title = st.nextToken();
            Double price = Double.parseDouble(st.nextToken());
            int nbPage = Integer.parseInt(st.nextToken());
            Publisher publisher = new Publisher(0, st.nextToken());
            com.m2i.poo.tpmedia.tpmediaCorrec.Book book = new com.m2i.poo.tpmedia.tpmediaCorrec.Book(id, title, price);
            book.setNbPage(nbPage);
            bookList.add(book);
            line = reader.readLine();

        }
        reader.close();

    }

    @Override
    public List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getAll() {
        return bookList;
    }

    @Override
    public com.m2i.poo.tpmedia.tpmediaCorrec.Book getById(int id) {
        return bookList
                .stream().filter(book -> book.getId() == id)
                .collect(Collectors.toList()).get(0);
    }

    @Override
    public List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByTitle(String title) {
        return bookList
                .stream().filter(book -> book.getTitle().toUpperCase().contains(title.toUpperCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByPrice(double price) {
        return bookList
                .stream().filter(book -> book.getNetPrice() <= price)
                .collect(Collectors.toList());
    }

    @Override
    public List<com.m2i.poo.tpmedia.tpmediaCorrec.Book> getByPublisher(String publisherName) {
        return null;
    }


    @Override
    public void add(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) {

    }

    @Override
    public void remove(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) {

    }

    @Override
    public void update(com.m2i.poo.tpmedia.tpmediaCorrec.Book b) {

    }
}
