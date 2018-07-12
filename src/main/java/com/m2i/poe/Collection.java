package com.m2i.poe;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        /*int[]tab={3,2,1};
        int[] tab2=new int[10];
        ArrayList<Integer> l=new ArrayList<Integer>(); //Collection //Integer est l'équivalent de Int pour objet
        l.add(3); // ajoute cette valeur à la première place disponoble dans la collection
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);// 3 4 5 7 8
        l.remove(l.indexOf(4)); //3 5 7 8 // cas particulier des integers (voir docu)
        int elem=l.get(0); //3
        elem=l.get(2); //7
        int size=l.size(); //4
        l.add(9); //3 5 7 8 9
        l.add(2,0); // insère 0 àl'indice 2 //3 5 0 7 8 9
        ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(3,4,5,7,8)); //autre ecriture pour add les valeurs d'un coup
*/
        //TP
        //Methodes qui font: sum,min,max,average,getPrimeNumbers
        //TP moyen: inverse => 1,2,3,4 renvoie 4,3,2,1
        //TP difficile: inverse sans créer nouvelle list, cad en détruisant List originelle
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(sum(l, l.size()));
        System.out.println(min(l));
        System.out.println(max(l));
        System.out.println(average(l));
        System.out.println(getPrimeNumbers(l));
        System.out.println(inverse(l));
    }

    public static int sum(ArrayList<Integer> l, int i) {
        if (i == 1) {
            return l.get(0);
        } else {
            return l.get(i - 1) + sum(l, i - 1);
        }
    }

    public static int min(ArrayList<Integer> l) {
        int mini = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            int temp = l.get(i);
            if (mini > l.get(i)) {
                mini = l.get(i);
            }
        }
        return mini;
    }

    public static int max(ArrayList<Integer> l) {
        int maxi = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (maxi < l.get(i)) {
                maxi = l.get(i);
            }
        }
        return maxi;
    }

    public static double average(ArrayList<Integer> l) {
        double av = sum(l, l.size()) / l.size();
        return av;
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if (n < 2) {
            result = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> l) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int index = 0;
        for (int i : l) {
            if (isPrime(i)) {
                result.add(i);
                index++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> inverse(ArrayList<Integer> l) {
        ArrayList<Integer> inv = new ArrayList<Integer>();
        for (int i = l.size() - 1; i > -1; i--) {
            inv.add(l.get(i));
        }
        return inv;
    }

    public static ArrayList<Integer> rinverse(ArrayList<Integer> l) {
        for (int i = 0; i < (l.size() - 1) / 2; i++) {
            permut(l, i, l.size() - 1 - i);
        }
        return l;
    }

    public static ArrayList<Integer> permut(ArrayList<Integer> l, int index1, int index2) {
        int temp = l.get(index1);
        l.set(index1, l.get(index2));
        l.set(index2, temp);
        return l;
    }

}
