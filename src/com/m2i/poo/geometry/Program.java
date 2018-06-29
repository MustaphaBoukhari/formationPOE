package com.m2i.poo.geometry;

public class Program {

    public static void main(String[] args) {
        Point p1;
        p1 = new Point(3, 2); // Instanciation
        Point p2 = new Point(4, 5);
        p1.display();
        p1.moveTo(5, -2);
        p1.display();
        p1.moveRelative(-1, -1);
        p1.display();
        TriangleRectangle r1;
        r1 = new TriangleRectangle(5, 4);
        System.out.println(r1.getSurface());
        System.out.println(r1.getHypothenus());
        System.out.println(r1.getPerimetre());


    }
}