package com.m2i.poo.tpmedia.tpmediaCorrec;

import com.m2i.poo.mesure.MesureRepository;
import com.m2i.poo.tpmedia.Book;
import com.m2i.poo.tpmedia.BookRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MediaMain {

    public static void main(String[] args) {
//        IMedia m2 = new Book(0, "", 20);
        IMedia b3 = new com.m2i.poo.tpmedia.tpmediaCorrec.Book(1, "Java", 22.2);
//        IMedia m = new Cd(2, "A que Johnny", 10.99);
//        m = new Dvd(3, "Rambo 12", 0);
//        System.out.println(m.getNetPrice());
//        m.setPublisher(new Publisher(4, "Gaumont"));
//        m.getAuthorList().add(new Author(5, "Silvester", "Stallone"));
//        int zone = ((Dvd) m).getZone();
//        Cart cart = new Cart();
//        cart.add(b);
//        cart.add(b);
//        cart.add(m);
//        System.out.println(cart.getTotalNetPrice());

//        try {
//            BookRepository repo = new BookRepository();
//            repo.load("books.csv");
//
//            System.out.println(repo.getAll());
//            System.out.println(repo.getById(2));
//
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            BookRepositorySQl bsql=new BookRepositorySQl();
            bsql.load("jdbc:postgresql://localhost:5432/postgres");
            for (com.m2i.poo.tpmedia.tpmediaCorrec.Book b:
                 bsql.getByPrice(30)) {
                System.out.println(b);
            }
            System.out.println(bsql.getById(2));
            System.out.println(bsql.getByTitle("jAVa"));
            System.out.println(bsql.getByPrice(15));
//            bsql.add((com.m2i.poo.tpmedia.tpmediaCorrec.Book) b3);
            b3= new com.m2i.poo.tpmedia.tpmediaCorrec.Book(13,"Goullah",50);
            bsql.update((com.m2i.poo.tpmedia.tpmediaCorrec.Book)b3);
            for (com.m2i.poo.tpmedia.tpmediaCorrec.Book b:
                    bsql.getAll()) {
                System.out.println(b);
            }
            } catch (Exception e1) {
            e1.printStackTrace();
        }


    }
}

