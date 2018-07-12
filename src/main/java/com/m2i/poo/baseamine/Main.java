package com.m2i.poo.baseamine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Base ch = new Base();
        System.out.println(ch.Name('A'));
        System.out.println(ch.Family('A'));
        System.out.println(ch.ApparieDNA('A'));
        System.out.println(ch.ApparieRNA('A'));

        Dna ch2 = new Dna();
        ArrayList<Base> k = new ArrayList<>();
        k = ch2.Brin("ACGT");
        System.out.println();
        for (int i = 0; i < k.size(); i++) {
            System.out.println(k.get(i));
        }

        ArrayList<Base> l = new ArrayList<>();
        l = ch2.CompBrin(k);
        System.out.println();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();

        Rna ch3 = new Rna();
        ArrayList<Base> m = ch3.Transcrip(k);
        System.out.println(m);

//        ArrayList<Base> tt = new ArrayList<>();
//        int t = k.size();
//        for (int i = 0; i < t; i++) {
//            Base q = new Base();
//            q.setSymbol(q.ApparieDNA(q.getSymbol()));
//            tt.add(q);
//        }
    }
}
