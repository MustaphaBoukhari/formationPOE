package com.m2i.poo.tpmedia;

public class Main {
    public static void main(String[] args) {
        Cd cd1 = new Cd(21, "Daft", 10);
        System.out.println(cd1.getNetPrice());
        Book b1 = new Book(12, "Throne", 15);
        System.out.println(b1.getNetPrice());
        Dvd dvd1 = new Dvd(31, "Move:The Movie", 15);
        System.out.println(dvd1.getNetPrice());

        iMedia cd2 = new Cd(22, "Punk", 14.99);
        iMedia b2 = new Book(12, "Games of", 15);
        iMedia dvd2 = new Dvd(32, "Sequel 2", 15);

        System.out.println(cd2.getNetPrice());
        System.out.println(b2.getNetPrice());
        System.out.println(dvd2.getNetPrice());
        System.out.println(cd2);

        //_b2.getAuthors().add(new Author("Jules","Verne"));
        System.out.println(b2);


        CartRow row1 = new CartRow(dvd2, 2);
        System.out.println(row1.getRowNetPrice());
        CartRow row2 = new CartRow(cd2, 1);
        System.out.println(row2.getRowNetPrice());
        row2.increment();
        System.out.println(row2.getRowNetPrice());
        row2.decrement();
        System.out.println(row2.getRowNetPrice());
        row2.decrement();
        System.out.println(row2.getRowNetPrice());

        /*Cart cart=new Cart();
        cart.add(row1);
        cart.add(row2);
        System.out.println(cart.getTotalNetPrice());*/


    }
}
