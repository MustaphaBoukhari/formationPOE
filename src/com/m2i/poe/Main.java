package com.m2i.poe;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] tab = {2, -3, 4, 5, 6, 7, 8, 9};
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(1001));
      /*  int[] result = getPrimeNumbers(tab);
        for (int i : result) {
            System.out.print(i + " ");
        }*/
        int n = tab.length;
        System.out.println(multipli(tab, n));
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

    public static int[] getPrimeNumbers(int[] tab) {
        int[] result = new int[tab.length];
        int index = 0;
        for (int i : tab) {
            if (isPrime(i)) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static int multipli(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        } else {
            return tab[n - 1] * multipli(tab, n - 1);
        }

    }
}
