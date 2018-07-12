package com.m2i.poo.baseamine.baseaminecorrec;

import java.io.IOException;
import java.util.ArrayList;

public class DNA extends Nucleotid {

    public DNA() {
    }


    public DNA(String code) throws IOException {
        super(code);
        if (code.contains("U")) {
            throw new IOException("U forbidden");
        }
    }

    public String toString() {
        return "DNA :" + super.toString();
    }

    public ArrayList<Base> getComplementary() {
        ArrayList<Base> res = new ArrayList<>();
        for (Base b : getStrand()) {
            res.add(b.getApparie(false));
        }
        return res;
    }

    public RNA transcription() {
        RNA rna = new RNA();
        for (Base b : getStrand()) {
            rna.getStrand().add(b.getApparie(true));
        }
        return rna;
    }
}