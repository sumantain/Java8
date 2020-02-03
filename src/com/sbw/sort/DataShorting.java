package com.sbw.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class DataShorting {
    private static ArrayList<Devloper> devlopers;

    public static void main(String[] args) {
        setData();

        shortData(devlopers);
    }

    private static void shortData(ArrayList<Devloper> devlopers) {
        printData(devlopers);

//       devlopers.sort(new Comparator<Devloper>() {
//           @Override
//           public int compare(Devloper o1, Devloper o2) {
//               return o1.age - o2.age;
//           }
//       });

        devlopers.sort((Devloper d1, Devloper d2) -> d1.age - d2.age);

        printData(devlopers);

        devlopers.sort((Devloper d1, Devloper d2) -> d1.name.compareTo(d2.name));

        printData(devlopers);
    }

    private static void printData(ArrayList<Devloper> devlopers) {
        System.out.println("");
        for (Devloper dev : devlopers) {
            System.out.println(dev.name + " " + dev.age);
        }
    }

    private static void setData() {
        devlopers = new ArrayList<Devloper>();
        devlopers.add(new Devloper("Sumanta", 32));
        devlopers.add(new Devloper("Binayak", 30));
        devlopers.add(new Devloper("Indranil", 31));
        devlopers.add(new Devloper("Surajit", 29));
        devlopers.add(new Devloper("Avijit", 32));
    }
}

class Devloper {
    String name;
    int age;

    public Devloper(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
