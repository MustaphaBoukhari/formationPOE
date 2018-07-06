package com.m2i.poo.baseamine.baseaminecorrec;

import java.util.ArrayList;
import java.util.List;

public class Protein {
    private List<AminoAcid> chain = new ArrayList<>();

    public Protein(List<AminoAcid> chain) {
        this.chain = chain;
    }

//    public List<Protein> factory(List<AminoAcid> chain){
//        List<Protein> proteinList=new ArrayList<>();
//        for (chain:
//             ) {
//
//        }
//        if (isProtein()){
//            Protein protein=new Protein(chain);
//        proteinList.add(protein);}
//
//    }

    public boolean isProtein() {
        return chain.size() > 50;
    }


}
