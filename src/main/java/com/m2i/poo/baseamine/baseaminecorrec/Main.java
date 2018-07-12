package com.m2i.poo.baseamine.baseaminecorrec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
//        Base a = new Base("A");
//        System.out.println(a);
//        System.out.println(a.getApparie(false));
//        DNA dna1 = new DNA("ATCG");
//        System.out.println(dna1);
//        System.out.println(dna1.getComplementary());
//        RNA rna = dna1.transcription();
//        System.out.println(rna);
//        DNA dna2 = new DNA("GAAAGAGCG");
//        rna = dna2.transcription(); // CUUUCUCGC
//        System.out.println(rna);
//        ArrayList<AminoAcid> protein = rna.translate(); // LSR
//        System.out.println(protein);

        DNARepository dnr = new DNARepository();

        dnr.load("dna.txt");
        List<Base> baseList = new ArrayList<>();
        baseList = dnr.getBaseList();
        System.out.println(baseList);
        DNA dna = dnr.getDna();
        System.out.println(dna);
        RNA rna = dna.transcription();
        System.out.println(rna);
        Ribosome rib = new Ribosome();
        List<AminoAcid> chain = rib.translate(rna);
        System.out.println(chain);


    }
}
