package com.m2i.poo.baseamine;

import java.util.ArrayList;

public class Rna {
    private ArrayList<Base> dna;
    private ArrayList<Base> rna;

    public Rna(ArrayList<Base> dna) {
        this.dna = dna;
        Transcrip(dna);

    }

    public Rna() {

    }

    public ArrayList<Base> Transcrip(ArrayList<Base> dna) {
        int t = dna.size();
        for (int i = 0; i < t; i++) {
            Base q = new Base();
            q = dna.get(i);
            q.setSymbol(q.ApparieRNA(q.getSymbol()));
            rna.add(q);
        }
        return rna;
    }
}
