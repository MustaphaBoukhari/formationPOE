package com.m2i.poo.tpmedia.tpmediaCorrec;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookRepositorySQl implements IBookRepository {
    private Connection conn;
    private List<Book> bookList = new ArrayList<>();

    @Override
    public void load(String uri) throws IOException, ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(uri, "postgres", "123456");
    }

    private List<Book> getPrivately(String string) throws Exception {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(string + " order by id asc");
        List<Book> res = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book book = new Book(id, title, price);
            res.add(book);
            book.setNbPage(rs.getInt("nbpage"));
        }
        return res;
    }


    @Override
    public List<Book> getAll() throws Exception {

        return getPrivately("select * from book ");
    }

    @Override
    public Book getById(int id) throws Exception {
        return getPrivately("select * from book where id=" + id).get(0);
    }


    @Override
    public List<Book> getByTitle(String title) throws Exception {

        return getPrivately("select * from book where book.title like '%" + title + "%'");
    }

    @Override
    public List<Book> getByPrice(double price) throws Exception {
        return getPrivately("select * from book where book.price <=" + price);
    }

    @Override
    public List<Book> getByPublisher(String publisherName) throws Exception {

        return getPrivately("select * from book, publisher where book.publisher.id=publisher.id and publisher.name ilike '%" + publisherName + "%'");
    }

    @Override
    public void add(Book b) throws SQLException {
        Statement st = conn.createStatement();
        st.execute("insert into book (title, price) values ('" + b.getTitle() + "'," + b.getPrice() + ")");
    }

    @Override
    public void remove(Book b) throws SQLException {
        Statement st = conn.createStatement();
        st.execute("delete from book where book.id =" + b.getId());
    }

    @Override
    public void update(Book b) throws SQLException {
        Statement st = conn.createStatement();
        st.execute("update book set title ='" + b.getTitle() + "', price =" + b.getPrice() + " where book.id=" + b.getId());
    }
}
