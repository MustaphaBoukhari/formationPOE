package com.m2i.poo.mesure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IMesureRepository {

    void load(String uri) throws IOException;


    List<Double> getTimeList();

    List<Double> getTheoreticalList();

    List<Double> getMesuredList();

    List<Double> getDifferenceList();

    List<Double> getQuadraticList();

    List<Double> getTimeDifferenceErrorList(double delta);

    List<Double> getTimeQuadraticErrorList(double delta);


}
