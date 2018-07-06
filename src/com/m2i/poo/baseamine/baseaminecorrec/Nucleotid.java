package com.m2i.poo.baseamine.baseaminecorrec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Nucleotid {
    private List<Base> strand = new ArrayList<>();

    public Nucleotid() {
    }

    public List<Base> getStrand() {
        return strand;
    }


    public Nucleotid(String code) throws IOException {
        for (char c :
                code.toCharArray()) {
            Base b = new Base(String.valueOf(c));
            getStrand().add(b);
        }

    }

    public String toString() {
        String res = "";
        for (Base b : getStrand()) {
            res += b.getSymbol();
        }
        return res;
    }
}
