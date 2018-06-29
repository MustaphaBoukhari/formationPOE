package com.m2i.poo.baseamine;

import java.util.ArrayList;

public class Dna {
    private String dna;
    private ArrayList<Base> brin;
    private ArrayList<Base> compbrin;

    public Dna() {

    }

    public Dna(String dna) {
        this.setDna(dna);
        Brin(dna);
        CompBrin(Brin(dna));
    }

    public ArrayList<Base> Brin(String dna) {
        dna = dna.toLowerCase();
        ArrayList<Base> brin = new ArrayList<>();
        int t = dna.length();
        for (int i = 0; i < t; i++) {
            char g = dna.charAt(i);
            if (g == 'a' || g == 'c' || g == 'g' || g == 't') {
                Base q = new Base(g);
                brin.add(q);
            }
        }
        return brin;
    }

    public ArrayList<Base> CompBrin(ArrayList<Base> brin) {
        int t = brin.size();
        ArrayList<Base> compbrin = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            Base q = new Base();
            q = brin.get(i);
            q.setSymbol(q.ApparieDNA(q.getSymbol()));
            compbrin.add(q);
        }
        return compbrin;
    }

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public ArrayList<Base> getBrin() {
        return brin;
    }

    public void setBrin(ArrayList<Base> brin) {
        this.brin = brin;
    }

    public ArrayList<Base> getCompbrin() {
        return compbrin;
    }

    public void setCompbrin(ArrayList<Base> compbrin) {
        this.compbrin = compbrin;
    }
}

