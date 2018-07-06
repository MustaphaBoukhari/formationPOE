package com.m2i.poo.tpmedia;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartRow> cartRowList = new ArrayList<>();

    public Cart() {
    }

    public double getTotalNetPrice() {
        double tot = 0;
        for (CartRow c : cartRowList) {
            tot += c.getRowNetPrice();
        }
        return tot;
    }

    public void add(CartRow c) {
        cartRowList.add(c);
    }

    public void remove(CartRow c) {
        cartRowList.remove(c);
    }

    public List<CartRow> getCartRowList() {
        return cartRowList;
    }

}
