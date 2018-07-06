package com.m2i.poo.baseamine.baseaminecorrec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DNARepository {
    List<Base> baseList = new ArrayList<>();
    private DNA dna = new DNA();


    public List<Base> getBaseList() {
        return baseList;
    }

    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        String line = reader.readLine();
//        while(line!=null) {
        DNA dna = new DNA(line);
        this.dna = dna;
//        }
//        reader.close();
        for (int i = 0; i < line.length(); i++) {
            Base base = new Base(String.valueOf(line.charAt(i)));
            baseList.add(base);
        }
    }

    public DNA getDna() {
        return dna;
    }

}
