package com.m2i.poo.baseamine.baseaminecorrec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RNA extends Nucleotid {

    public RNA() {
    }

    public RNA(String code) throws IOException {
        super(code);
        if (code.contains("T")) {
            throw new IOException("T is forbidden");
        }
    }

    @Override
    public String toString() {
        return "RNA :" + super.toString();
    }


}