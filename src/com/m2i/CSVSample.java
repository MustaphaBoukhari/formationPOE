package com.m2i;

import com.m2i.poo.mesure.MesureRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CSVSample {
    public static void main(String[] args) {
//        List<Double> time = new ArrayList<>();
//        List<Double> theoretical = new ArrayList<>();
//        List<Double> mesured = new ArrayList<>();
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("Sinusoidal.csv"));
//            String line = reader.readLine();
//            StringTokenizer st = new StringTokenizer(line, ";");
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//                time.add(Double.parseDouble(st.nextToken()));
////                theoretical.add(Double.parseDouble(st.nextToken()));
////                mesured.add(Double.parseDouble(st.nextToken()));
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        for (double d : time) {
//            System.out.println(d);
//        }
//
        try {
            MesureRepository repo = new MesureRepository();
            repo.load("Sinusoidal.csv");

            System.out.println(repo.getMesuredList());
            System.out.println(repo.getDifferenceList());
            System.out.println(repo.getQuadraticList());
            System.out.println(repo.getTimeDifferenceErrorList(0.1));
            System.out.println(repo.getTimeQuadraticErrorList(0.01));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
