package com.m2i.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalMain {

    public static boolean isPrime(double n) {
        boolean result = true;
        if (n < 2 || n != (int) n) {
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

    public static void main(String[] args) {
        // fonctionnel
        // f(x)=x+1, x € R <=>
        Function<Double, Double> f = x -> x + 1; // -> (donne)
        System.out.println(f.apply(1.0));
        Function<Double, Boolean> predicat = x -> x < 10; // signe à gauche => Expression Lambda
        System.out.println(predicat.apply(9.0));

        ArrayList<Double> l = new ArrayList<>(Arrays.asList(2.0, 0.41, 72.1, 8.6));
        List<Double> res = new ArrayList<>();
        for (double d : l) {
            if (d < 10) {
                res.add(d);
            }
        }
        //<=>
        res = l.stream().filter(x -> x < 10).collect(Collectors.toList());
        Stream<Double> stream = l.stream().filter(x -> x < 10);
        stream = l.stream().filter(x -> x < 10).filter(x -> x > 2); //Lazy loading
        res = stream.collect(Collectors.toList()); // Déclenche le lazy loading

        //map
        stream = l.stream().map(x -> x + 1); //map applique x+1 à chaque élément de la liste
        stream = l.stream().map(x -> Math.cos(x)).filter(x -> Math.abs(x) < 0.5);
        Stream<Boolean> stream2 = l.stream().map(x -> x < 10);
        System.out.println(stream2.collect(Collectors.toList()));

        //Exercice
        // 1 Créer une collection  de 10 doubles
        // 2 Filtrer les chiffres pairs
        // 3 Filtrer le chiffres pairs + appliquer cos
        // 4 Filtrer les nombres premiers
        // 5 Filtrer les nombres premiers + appliquer tangente + filtrer les positifs

        ArrayList<Double> col = new ArrayList<>(Arrays.asList(0.5, 3.0, 5.0, 5.5, 7.0, 55.3, 99.99, 66.0, 23.0, 3.3));
        Stream<Double> stream3 = col.stream().filter(x -> x % 2 == 0.0);
        System.out.println(stream3.collect(Collectors.toList()));
        stream3 = col.stream().filter(x -> x % 2 == 0.0).map(x -> Math.cos(x));
        System.out.println(stream3.collect(Collectors.toList()));

//        ArrayList<Integer> col2=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
//        Stream<Integer> stream4=col2.stream().filter(x->isPrime(x));
//        System.out.println(stream4.collect(Collectors.toList()));
        stream3 = col.stream().filter(x -> isPrime(x));
        System.out.println(stream3.collect(Collectors.toList()));
        stream3 = col.stream().filter(x -> isPrime(x)).map(x -> Math.tan(x)).filter(x -> x > 0);
        System.out.println(stream3.collect(Collectors.toList()));

        // Reduce abbaisse la dimension de 1
        double i = l.stream().mapToDouble(x -> x).sum();
        //<=> via reduce
        i = l.stream().mapToDouble(x -> x).reduce(0, (x, y) -> x + y);
        System.out.println(i);
        // multiplier avec reduce
        i = l.stream().mapToDouble(x -> x).reduce(1, (x, y) -> x * y);
        System.out.println(i);

    }


}