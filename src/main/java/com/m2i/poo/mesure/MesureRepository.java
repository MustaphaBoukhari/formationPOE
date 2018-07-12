package com.m2i.poo.mesure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class MesureRepository implements IMesureRepository {
    private List<Double> timeList = new ArrayList<>();
    private List<Double> theoreticalList = new ArrayList<>();
    private List<Double> mesuredList = new ArrayList<>();
    private List<Double> deltaList = new ArrayList<>();


    @Override
    public void load(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ";");
            timeList.add(Double.parseDouble(st.nextToken()));
            theoreticalList.add(Double.parseDouble(st.nextToken()));
            mesuredList.add(Double.parseDouble(st.nextToken()));
            line = reader.readLine();
        }
        reader.close();
    }

    @Override
    public List<Double> getTimeList() {
        return timeList;
    }


    @Override
    public List<Double> getTheoreticalList() {
        return theoreticalList;
    }

    @Override
    public List<Double> getMesuredList() {
        return mesuredList;
    }

    @Override
    public List<Double> getDifferenceList() {
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < timeList.size(); i++) {
            res.add(mesuredList.get(i) - theoreticalList.get(i));
        }
        return res;
    }

    @Override
    public List<Double> getQuadraticList() {
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < timeList.size(); i++) {
            res.add(Math.pow(mesuredList.get(i) - theoreticalList.get(i), 2));
        }
        return res;
    }

    private List<Double> getTimeDifference(double delta, List<Double> list) {
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (Math.abs(list.get(i)) >= delta) {
                res.add(timeList.get(i));
            }
        }
        return res;
    }

    @Override
    public List<Double> getTimeDifferenceErrorList(double delta) {
        return getTimeDifference(delta, getDifferenceList());
    }

    @Override
    public List<Double> getTimeQuadraticErrorList(double delta) {
        return getTimeDifference(delta, getQuadraticList());
    }
}




