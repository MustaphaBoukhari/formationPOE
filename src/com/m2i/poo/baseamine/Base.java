package com.m2i.poo.baseamine;

public class Base {
    private char symbol;
    private String name;
    private String family;
    private char apparieDNA;
    private char apparieRNA;

    public Base() {

    }

    public Base(char symbol) {
        this.setSymbol(symbol);
        Name(this.getSymbol());
        Family(this.getSymbol());
        ApparieDNA(this.getSymbol());
        ApparieRNA(this.getSymbol());
    }

    public String Name(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case 'a':
                name = "adénine";
                break;
            case 'c':
                name = "cytosine";
                break;
            case 'g':
                name = "guanine";
                break;
            case 't':
                name = "thymine";
                break;
            case 'u':
                name = "uracile";
                break;
        }
        return getName();
    }

    public String Family(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case 'a':
                family = "Purine";
                break;
            case 'c':
                family = "Pyrimidine";
                break;
            case 'g':
                family = "Purine";
                break;
            case 't':
                family = "Pyrimidine";
                break;
            case 'u':
                family = "Pyrimidine";
                break;
        }
        return getFamily();

    }
/*System.out.println("adénine");
                System.out.println("cytosine");
                System.out.println("guanine");
                System.out.println("thymine");
                System.out.println("uracile");*/

    public char ApparieDNA(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case 'a':
                apparieDNA = 't';
                break;
            case 'c':
                apparieDNA = 'g';
                break;
            case 'g':
                apparieDNA = 'c';
                break;
            case 't':
                apparieDNA = 'a';
                break;
        }
        return apparieDNA;
    }

    public char ApparieRNA(char symbol) {
        symbol = Character.toLowerCase(symbol);
        switch (symbol) {
            case 'a':
                apparieRNA = 'u';
                break;
            case 'c':
                apparieRNA = 'g';
                break;
            case 'g':
                apparieRNA = 'g';
                break;
            case 't':
                apparieRNA = 'a';
                break;
        }
        return apparieDNA;
    }

    public String toString() {
        return (getSymbol() + " " + getName() + " " + getFamily());
    }


    public char getSymbol() {
        return symbol;
    }


    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
