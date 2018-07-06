package com.m2i.poo.tpmedia.tpmediaCorrec;

import com.m2i.poo.mesure.MesureRepository;
import com.m2i.poo.tpmedia.BookRepository;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MediaMain {

    public static void main(String[] args) {
//        IMedia m2 = new Book(0, "", 20);
//        IMedia b = new Book(1, "Java", 22.2);
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

        try {
            BookRepository repo = new BookRepository();
            repo.load("books.csv");

            System.out.println(repo.getAll());
            System.out.println(repo.getById(2));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

