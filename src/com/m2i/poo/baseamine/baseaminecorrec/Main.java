package com.m2i.poo.baseamine.baseaminecorrec;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Base a = new Base("A");
        System.out.println(a);
        System.out.println(a.getApparie(false));
        DNA dna1 = new DNA("ATCG");
        System.out.println(dna1);
        System.out.println(dna1.getComplementary());
        RNA rna = dna1.transcription();
        System.out.println(rna);
        DNA dna2 = new DNA("GAAAGAGCG");
        rna = dna2.transcription(); // CUUUCUCGC
        System.out.println(rna);
        ArrayList<AminoAcid> protein = rna.translate(); // LSR
        System.out.println(protein);
    }
}
