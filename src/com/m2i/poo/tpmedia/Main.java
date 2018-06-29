package com.m2i.poo.tpmedia;

public class Main {
    public static void main(String[] args) {
        Cd cd1 = new Cd(21, "Daft", 10, 15);
        System.out.println(cd1.getNetPrice());
        Book b1 = new Book(12, "Throne", 15, 200);
        System.out.println(b1.getNetPrice());
        Dvd dvd1 = new Dvd(31, "Move:The Movie", 15, 1);
        System.out.println(dvd1.getNetPrice());

        Media cd2 = new Cd(22, "Punk", 14.99, 10);
        Media b2 = new Book(12, "Games of", 15, 210);
        Media dvd2 = new Dvd(32, "Sequel 2", 15, 1);

        System.out.println(cd2.getNetPrice());
        System.out.println(b2.getNetPrice());
        System.out.println(dvd2.getNetPrice());
        System.out.println(cd2);

        //_b2.getAuthors().add(new Author("Jules","Verne"));
        System.out.println(b2);

    }
}
