package com.m2i.poo.geometry;

public class TriangleRectangle extends Rectangle {

    // Herite de Rectangle
    // getSurface
    // Hypothenuse
    // Perimetre


    public TriangleRectangle(double width, double height) {
        super(width, height);
        getSurface();
        getHypothenus();
        getPerimetre();
    }

    @Override
    public double getSurface() {
        return super.getSurface() / 2;
    }

    public double getHypothenus() {
        return Math.sqrt((Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2)));
    }

    @Override
    public double getPerimetre() {
        return getHypothenus() + getWidth() + getHeight();
    }


}
