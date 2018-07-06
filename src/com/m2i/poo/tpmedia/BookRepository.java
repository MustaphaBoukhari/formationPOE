package com.m2i.poo.tpmedia;

import com.m2i.poo.tpmedia.tpmediaCorrec.IMedia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookRepository implements IBookRepository {
    private List<Integer> idList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private List<Double> priceList = new ArrayList<>();
    private List<Integer> pageNbList = new ArrayList<>();
    private List<String> publisherList = new ArrayList<>();
    private Book book = new Book();
    private List<Book> bookList = new ArrayList<>();

    public BookRepository() {
        this.book = new Book();
        this.bookList = new ArrayList<>();
        getAll();

    }


    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ";");
            idList.add(Integer.parseInt(st.nextToken()));
            titleList.add(st.nextToken());
            priceList.add(Double.parseDouble(st.nextToken()));
            pageNbList.add(Integer.parseInt(st.nextToken()));
            publisherList.add(st.nextToken());
            line = reader.readLine();
        }
        for (int i = 0; i < idList.size(); i++) {
            book = new Book(idList.get(i), titleList.get(i), priceList.get(i));
            bookList.add(book);
        }
        reader.close();
    }

    @Override
    public List<Book> getAll() {

        return bookList;
    }

    @Override
    public Book getById(int id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (id == book.getId()) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> getByPrice(double price) {
        return null;
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        return null;
    }

    @Override
    public void add(Book b) {

    }

    @Override
    public void remove(Book b) {

    }

    @Override
    public void update(Book b) {

    }
}
